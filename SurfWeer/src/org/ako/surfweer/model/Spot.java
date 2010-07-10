package org.ako.surfweer.model;

public class Spot {
	private String name;
	private int currentWindSpeedKnots;
	private int currentWaveHeight;
	private int currentWindDirection;
	private String awdUrlWindsnelheid;

	public int getCurrentWindSpeedKnots() {
		return currentWindSpeedKnots;
	}

	public void setCurrentWindSpeedKnots(int currentWindSpeedKnots) {
		this.currentWindSpeedKnots = currentWindSpeedKnots;
	}

	public int getCurrentWaveHeight() {
		return currentWaveHeight;
	}

	public void setCurrentWaveHeight(int currentWaveHeight) {
		this.currentWaveHeight = currentWaveHeight;
	}

	public int getCurrentWindDirection() {
		return currentWindDirection;
	}

	public void setCurrentWindDirection(int currentWindDirection) {
		this.currentWindDirection = currentWindDirection;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Spot(String name) {
		this.name = name;
	}

	public Spot(String name, int windSpeed, int windDirection, int waveHeight) {
		this.name = name;
		this.currentWaveHeight = waveHeight;
		this.currentWindDirection = windDirection;
		this.currentWindSpeedKnots = windSpeed;
	}

	public Spot(String name, int windSpeed, int windDirection, int waveHeight, String awdUrlWindsnelheid, String awdUrlWindrichting) {
		this.name = name;
		this.currentWaveHeight = waveHeight;
		this.currentWindDirection = windDirection;
		this.currentWindSpeedKnots = windSpeed;
		this.awdUrlWindsnelheid = awdUrlWindsnelheid;
		
	}
	
	public void setAwdUrlWindgegevens(String awdUrlWindgegevens) {
		this.awdUrlWindsnelheid = awdUrlWindgegevens;
	}

	public String getAwdUrlWindgegevens() {
		return awdUrlWindsnelheid;
	}
}
