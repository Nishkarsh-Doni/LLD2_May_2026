package org.example.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class GameConfig implements Prototype<GameConfig> {
    private String map;
    private String version;
    private int maxPlayers;
    private List<String> weaponsEnabled;
    private String weatherType;
    private double gravity;
    private double healthMultiplier;
    private String serverRegion;

    public GameConfig() {}

    // -- copy constructor --  the engine behind the clone() --
    GameConfig(GameConfig source) {
        this.map = source.map;
        this.gravity = source.gravity;
        this.serverRegion = source.serverRegion;
        this.version = source.version;
        this.maxPlayers = source.maxPlayers;
        this.weaponsEnabled = new ArrayList<>(source.weaponsEnabled); // deep copy
        this.weatherType = source.weatherType;
        this.healthMultiplier = source.healthMultiplier;
    }

    @Override
    public GameConfig clone() {
        return new GameConfig(this);
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public List<String> getWeaponsEnabled() {
        return weaponsEnabled;
    }

    public void setWeaponsEnabled(List<String> weaponsEnabled) {
        this.weaponsEnabled = weaponsEnabled;
    }

    public String getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(String weatherType) {
        this.weatherType = weatherType;
    }

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    public double getHealthMultiplier() {
        return healthMultiplier;
    }

    public void setHealthMultiplier(double healthMultiplier) {
        this.healthMultiplier = healthMultiplier;
    }

    public String getServerRegion() {
        return serverRegion;
    }

    public void setServerRegion(String serverRegion) {
        this.serverRegion = serverRegion;
    }

    @Override
    public String toString() {
        return "GameConfig{" +
                "map='" + map + '\'' +
                ", version='" + version + '\'' +
                ", maxPlayers=" + maxPlayers +
                ", weaponsEnabled=" + weaponsEnabled +
                ", weatherType='" + weatherType + '\'' +
                ", gravity=" + gravity +
                ", healthMultiplier=" + healthMultiplier +
                ", serverRegion='" + serverRegion + '\'' +
                '}';
    }
}
