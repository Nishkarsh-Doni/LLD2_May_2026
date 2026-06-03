package org.example.designpatterns.prototype;

import java.util.Arrays;

public class Client {
    public static void fillRegistry(GameConfigRegistry registry) {
        // ── Template: Battle Royale on Erangel ──
        GameConfig brErangel = new GameConfig();
        brErangel.setMap("Erangel");
        brErangel.setVersion("3.2.1");
        brErangel.setMaxPlayers(100);
        brErangel.setWeaponsEnabled(Arrays.asList("AR", "SMG", "Sniper", "Shotgun"));
        brErangel.setWeatherType("Clear");
        brErangel.setGravity(9.8);
        brErangel.setHealthMultiplier(1.0);
        brErangel.setServerRegion("Default");

        registry.register("BR-Erangel", brErangel);

        // ── Template: TDM on Warehouse ──
        GameConfig tdmWarehouse = new GameConfig();
        tdmWarehouse.setMap("Warehouse");
        tdmWarehouse.setVersion("3.2.1");
        tdmWarehouse.setMaxPlayers(8);
        tdmWarehouse.setWeaponsEnabled(Arrays.asList("AR", "SMG"));
        tdmWarehouse.setWeatherType("Indoor");
        tdmWarehouse.setGravity(9.8);
        tdmWarehouse.setHealthMultiplier(1.5);
        tdmWarehouse.setServerRegion("Default");

        registry.register("TDM-Warehouse", tdmWarehouse);

        // ── Template: Ranked on Erangel (uses RankedConfig!) ──
        RankedGameConfig rankedErangel = new RankedGameConfig();
        rankedErangel.setMap("Erangel");
        rankedErangel.setVersion("3.2.1");
        rankedErangel.setMaxPlayers(64);
        rankedErangel.setWeaponsEnabled(Arrays.asList("AR", "SMG", "Sniper", "Shotgun"));
        rankedErangel.setWeatherType("Clear");
        rankedErangel.setGravity(9.8);
        rankedErangel.setHealthMultiplier(1.0);
        rankedErangel.setServerRegion("Default");
        rankedErangel.setRankedPointsMultiplier(2);
        rankedErangel.setAntiCheatEnabled(true);

        registry.register("Ranked-Erangel", rankedErangel);

    }
    public static void main(String[] args) {
        // Step 1: Create and populate the registry
        GameConfigRegistry registry = new GameConfigRegistry();
        fillRegistry(registry);

        System.out.println("==== Battle Royale Matches ====");

        // Step 2: Clone a template and customise
        GameConfig asiaMatch = registry.get("BR-Erangel").clone();
        asiaMatch.setServerRegion("Asia");
        System.out.println("Asia match: " + asiaMatch);

        GameConfig europeMatch = registry.get("BR-Erangel").clone();
        europeMatch.setServerRegion("Europe");
        europeMatch.setWeatherType("Rain");
        System.out.println("Europe Match: " + europeMatch);


//        // Template config for Battle Royale - Erangel
//        GameConfig erangelTemplate = new GameConfig();
//        erangelTemplate.setMap("Erangel");
//        erangelTemplate.setVersion("3.2.1");
//        erangelTemplate.setMaxPlayers(100);
//        erangelTemplate.setWeaponsEnabled(Arrays.asList("AR", "SMG", "Sniper", "Shotgun"));
//        erangelTemplate.setWeatherType("Clear");
//        erangelTemplate.setGravity(9.8);
//        erangelTemplate.setHealthMultiplier(1.0);
//        erangelTemplate.setServerRegion("Asia");
//
////        GameConfig erangelTemplate = getTemplate("Erangel");
//
//        // Clone and customise - only change what is going to be different
//        GameConfig europeMatch = erangelTemplate.clone();
//        europeMatch.setServerRegion("Europe");
//
//        GameConfig rainyMatch = erangelTemplate.clone();
//        rainyMatch.setWeatherType("Rain");
//        rainyMatch.setServerRegion("NA-East");
//
//        RankedGameConfig original = new RankedGameConfig();
//        original.setMap("Erangel");
//        original.setWeaponsEnabled(Arrays.asList("AR", "SMG", "Sniper", "Shotgun"));
//        original.setRankedPointsMultiplier(2);
//        original.setAntiCheatEnabled(true);
//
//        original.clone();
//
//        System.out.println("DEBUG");

        // Naive copying -> copying each feild manually from the original config
//        GameConfig config2 = new GameConfig();
//        config2.setMap(config1.getMap());
//        config2.setGravity(config2.getGravity());

        // Problems with this approach?
        // 1. Tight coupling -> I need to know each and every attribute of GameConfig - violates encapsulation
        // 2. Repetitive code
        // 3. Fragile to changes and prone to errors
    }
}
