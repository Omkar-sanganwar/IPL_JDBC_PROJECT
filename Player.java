package com.ipl.entity;

public class Player {
	private int jerseyNo;
	private String name;
	private String team;
	private int runs;
	private String role;

	// Constructors
	public Player() {
	}

	public Player(int jerseyNo, String name, String team, int runs, String role) {
		this.jerseyNo = jerseyNo;
		this.name = name;
		this.team = team;
		this.runs = runs;
		this.role = role;
	}

	// Getters and Setters
	public int getJerseyNo() {
		return jerseyNo;
	}

	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Player [Jersey No=" + jerseyNo + ", Name=" + name + ", Team=" + team + ", Runs=" + runs + ", Role="
				+ role + "]";
	}
}
