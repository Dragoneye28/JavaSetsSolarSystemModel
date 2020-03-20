package com.example.mypackage;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBodyPlanet extends HeavenlyBody {
    private final static Set<HeavenlyBody> heavenlyPlanets = new HashSet<>();

    public HeavenlyBodyPlanet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, "Planet");
    }

}
