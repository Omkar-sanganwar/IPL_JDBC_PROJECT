package com.ipl.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.ipl.entity.Player;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAO {

    // Method to establish the database connection
    private Connection getConnection() throws SQLException {
        // Explicitly load the MySQL driver class
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("MySQL Driver not found");
        }

        String url = "jdbc:mysql://localhost:3307/ipl"; // Replace with your database name and port
        String user = "root";
        String password = "root"; // Replace with your database password
        return DriverManager.getConnection(url, user, password);
    }

    // Method to fetch all players from the database
    public List<Player> getAllPlayers() {
        List<Player> players = new ArrayList<>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = getConnection();
            stmt = conn.createStatement();
            String query = "SELECT jerseyNo, name, team, runs, role FROM ipl.player"; // Replace with your table name
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                Player player = new Player(
                    rs.getInt("jerseyNo"),
                    rs.getString("name"),
                    rs.getString("team"),
                    rs.getInt("runs"),
                    rs.getString("role")
                );
                players.add(player);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return players;
    }
}
