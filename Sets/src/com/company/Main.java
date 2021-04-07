package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String,HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();


    public static void main(String[] args) {

        HeavenlyBody temp = new HeavenlyBody("Mercury",88);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        HeavenlyBody temp3 = new HeavenlyBody("Mars",129);
        solarSystem.put(temp.getName(),temp3);
        planets.add(temp3);
        HeavenlyBody temp4 = new HeavenlyBody("Venus",66);
        solarSystem.put(temp.getName(),temp4);
        planets.add(temp4);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon",27);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        for(HeavenlyBody planet : planets){
            for (HeavenlyBody h :planet.getSatellites()){
                System.out.println("Satellite of " + planet.getName() + " is " + h.getName());
            }
        }



    }
}
