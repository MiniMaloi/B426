package com.joysistvi.day31.recordingapp.main;
import java.sql.*;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static final String URL =
            "jdbc:mysql://localhost:3306/recording_studio_db";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
        }

    public static void main(String[] args) {

        System.out.println("=== Recording Studio Database ===");

            // --- Testing Albums CRUD ---
            System.out.println("--- Viewing All Albums ---");
            viewAllAlbums();
            System.out.println("--- Creating an Albums ---");
            createAlbum("Coco", 1990, 1);
            System.out.println("--- Updating an Album ---");
            updateAlbum(6, "Coco (Remastered)", 1995, 1);
            System.out.println("--- Deleting an album... ---");
            deleteAlbum(6);

            // --- Testing Artists CRUD ---
            System.out.println("--- Viewing all artists ---");
            viewAllArtists();
            System.out.println("--- Creating an artist ---");
            createArtist("IV of Spades");
            System.out.println("--- Updating an artist ---");
            updateArtist(6, "IV Of Spades");
            System.out.println("--- Deleting an artist... ---");
            deleteArtist(6);

            // Reading records only / find album and artists by ID
            viewAllAlbums();
            viewAllArtists();
            System.out.print("Enter the ID of the Artist: ");
            int artistID = scanner.nextInt();
            getArtistById(artistID);
            System.out.print("Enter the ID of the Album: ");
            int albumID = scanner.nextInt();
            getAlbumById(albumID);

        }

    public static void updateAlbum(int id, String name,
                                   int year, int artistId) {

        String sql = "UPDATE albums SET name = ?, year = ?, "
                + "artist_id = ? WHERE id = ?";

        try (Connection connection = connect();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(sql)) {

            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, year);
            preparedStatement.setInt(3, artistId);
            preparedStatement.setInt(4, id);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Album ID " + id
                        + " updated successfully!");
                viewAllAlbums();
            } else {
                System.out.println("No album found with ID " + id + ".");
            }

        } catch (SQLException e) {
            System.out.println("Update Album: " + e.getMessage());
        }
    }


    public static void createAlbum(String name, int year, int artistId) {

        String sql = "INSERT INTO albums (name, year, artist_id) "
                + "VALUES (?, ?, ?)";

        try (Connection connection = connect();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(sql)) {

            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, year);
            preparedStatement.setInt(3, artistId);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Album: " + name
                        + " created successfully!");
                viewAllAlbums();
            }

        } catch (SQLException e) {
            System.out.println("Create Album: " + e.getMessage());
        }
    }



    public static void viewAllAlbums() {

        String sql = "SELECT id, name, year, artist_id FROM albums";

        try (Connection connection = connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            System.out.println("\n----- Albums -----");

            System.out.printf("%-4s %-45s %-6s %-10s%n",
                    "ID", "Album Name", "Year", "Artist ID");

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int year = resultSet.getInt("year");
                int artistId = resultSet.getInt("artist_id");

                System.out.printf("%-4d %-45s %-6d %-10d%n",
                        id, name, year, artistId);
            }

        } catch (SQLException e) {
            System.out.println("View Albums: " + e.getMessage());
        }
    }

    public static void deleteAlbum(int id) {

        String sql = "DELETE FROM albums WHERE id = ?";

        try (Connection connection = connect();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, id);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Album ID " + id
                        + " deleted successfully!");
                viewAllAlbums();
            } else {
                System.out.println("No album found with ID " + id + ".");
            }

        } catch (SQLException e) {
            System.out.println("Delete Album: " + e.getMessage());
        }
    }


    public static void viewAllArtists() {

        String sql = "SELECT id, name FROM artists";

        try (Connection connection = connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            System.out.println("\n----- Artists -----");

            System.out.printf("%-4s %-25s%n",
                    "ID", "Artist Name");

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");

                System.out.printf("%-4d %-25s%n", id, name);
            }

        } catch (SQLException e) {
            System.out.println("View Artists: " + e.getMessage());
        }
    }


    public static void createArtist(String name) {

        String sql = "INSERT INTO artists (name) VALUES (?)";

        try (Connection connection = connect();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(sql)) {

            preparedStatement.setString(1, name);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Artist: " + name
                        + " created successfully!");
                viewAllArtists();
            }

        } catch (SQLException e) {
            System.out.println("Create Artist: " + e.getMessage());
        }
    }


    public static void updateArtist(int id, String name) {

        String sql = "UPDATE artists SET name = ? WHERE id = ?";

        try (Connection connection = connect();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(sql)) {

            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, id);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Artist ID " + id
                        + " updated successfully!");
                viewAllArtists();
            } else {
                System.out.println("No artist found with ID " + id + ".");
            }

        } catch (SQLException e) {
            System.out.println("Update Artist: " + e.getMessage());
        }
    }


    public static void deleteArtist(int id) {

        String sql = "DELETE FROM artists WHERE id = ?";

        try (Connection connection = connect();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, id);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Artist ID " + id
                        + " deleted successfully!");
                viewAllArtists();
            } else {
                System.out.println("No artist found with ID " + id + ".");
            }

        } catch (SQLException e) {
            System.out.println("Delete Artist: " + e.getMessage());
        }
    }


    public static void getArtistById(int id) {

        String sql = "SELECT id, name FROM artists WHERE id = ?";

        try (Connection connection = connect();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, id);

            try (ResultSet resultSet =
                         preparedStatement.executeQuery()) {

                if (resultSet.next()) {
                    System.out.println("Artist ID: "
                            + resultSet.getInt("id"));

                    System.out.println("Artist Name: "
                            + resultSet.getString("name"));
                } else {
                    System.out.println("No artist found with ID "
                            + id + ".");
                }
            }

        } catch (SQLException e) {
            System.out.println("Get Artist: " + e.getMessage());
        }
    }

    public static void getAlbumById(int id) {

        String sql = "SELECT id, name, year, artist_id "
                + "FROM albums WHERE id = ?";

        try (Connection connection = connect();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, id);

            try (ResultSet resultSet =
                         preparedStatement.executeQuery()) {

                if (resultSet.next()) {
                    System.out.println("Album ID: "
                            + resultSet.getInt("id"));

                    System.out.println("Album Name: "
                            + resultSet.getString("name"));

                    System.out.println("Year: "
                            + resultSet.getInt("year"));

                    System.out.println("Artist ID: "
                            + resultSet.getInt("artist_id"));
                } else {
                    System.out.println("No album found with ID "
                            + id + ".");
                }
            }

        } catch (SQLException e) {
            System.out.println("Get Album: " + e.getMessage());
        }
    }
}
