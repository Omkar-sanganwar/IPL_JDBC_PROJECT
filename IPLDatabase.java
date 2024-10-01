package com.ipl.controller;

import com.ipl.entity.Player;
import com.ipl.service.PlayerService;

import java.util.List;

public class IPLDatabase {

    public static void main(String[] args) {
        PlayerService playerService = new PlayerService();

        // Fetching all players from the database
        List<Player> players = playerService.getAllPlayers();
        System.out.println("All Players Details: ");
        
        // Displaying player details
        for (Player player : players) {
            System.out.println(player);
        }
    }
}
