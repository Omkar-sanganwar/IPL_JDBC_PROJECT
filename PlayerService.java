package com.ipl.service;

import java.util.List;

import com.ipl.dao.PlayerDAO;
import com.ipl.entity.Player;

public class PlayerService {

    private PlayerDAO playerDAO;

    public PlayerService() {
        playerDAO = new PlayerDAO();
    }

    // Method to fetch all player details
    public List<Player> getAllPlayers() {
        return playerDAO.getAllPlayers();
    }

    // Additional methods for business logic can be added here, e.g., finding top players, players by team, etc.
}
