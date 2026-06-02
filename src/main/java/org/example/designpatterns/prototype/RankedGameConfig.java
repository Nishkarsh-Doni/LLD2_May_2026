package org.example.designpatterns.prototype;

public class RankedGameConfig extends GameConfig {
    private int rankedPointsMultiplier;
    private boolean antiCheatEnabled;

    public RankedGameConfig() {}

    public RankedGameConfig(RankedGameConfig source) {
        super(source);  // copies parent fields
        this.rankedPointsMultiplier = source.rankedPointsMultiplier;
        this.antiCheatEnabled = source.antiCheatEnabled;
    }

    public RankedGameConfig clone() { // overriding the clone() in parent
        return new RankedGameConfig(this);
    }

    public int getRankedPointsMultiplier() {
        return rankedPointsMultiplier;
    }

    public void setRankedPointsMultiplier(int rankedPointsMultiplier) {
        this.rankedPointsMultiplier = rankedPointsMultiplier;
    }

    public boolean isAntiCheatEnabled() {
        return antiCheatEnabled;
    }

    public void setAntiCheatEnabled(boolean antiCheatEnabled) {
        this.antiCheatEnabled = antiCheatEnabled;
    }

    @Override
    public String toString() {
        return "RankedGameConfig{" +
                "rankedPointsMultiplier=" + rankedPointsMultiplier +
                ", antiCheatEnabled=" + antiCheatEnabled +
                '}';
    }
}
