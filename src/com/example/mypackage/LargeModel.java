package com.example.mypackage;

public class LargeModel {
    public static void main(String[] args) {
        HeavenlyBody theSun = new HeavenlyBodyStar("Sun");

        HeavenlyBody tempAdd = new HeavenlyBodyPlanet("Mercury", 88);
        tempAdd.addBody(tempAdd);
        tempAdd.printThePlanets();
        tempAdd.printSatellites();
        theSun.addSatellite(tempAdd);


        tempAdd = new HeavenlyBodyPlanet("Venus", 225);
        tempAdd.addBody(tempAdd);
        tempAdd.printThePlanets();
        theSun.addSatellite(tempAdd);

        tempAdd = new HeavenlyBodyPlanet("Earth", 365);
        tempAdd.addBody(tempAdd);
        tempAdd.printThePlanets();
        theSun.addSatellite(tempAdd);

        HeavenlyBody tempMoonAdd = new HeavenlyBodyMoon("Moon", 27);
        tempAdd.addSatellite(tempMoonAdd);
        tempAdd.printSatellites();

        tempAdd = new HeavenlyBodyPlanet("Mars", 687);
        tempAdd.addBody(tempAdd);
        tempAdd.printThePlanets();
        theSun.addSatellite(tempAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Phobos", 8);
        tempAdd.addSatellite(tempMoonAdd);
        theSun.addSatellite(tempAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Deimos", 30);
        tempAdd.addSatellite(tempMoonAdd);

        tempAdd.printSatellites();

        tempAdd = new HeavenlyBodyPlanet("Jupiter", 4300);
        tempAdd.addBody(tempAdd);
        tempAdd.printThePlanets();
        theSun.addSatellite(tempAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Metis", .25);
        tempAdd.addSatellite(tempMoonAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Adrastea", .25);
        tempAdd.addSatellite(tempMoonAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Amalthea", .5);
        tempAdd.addSatellite(tempMoonAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Thebe", .7);
        tempAdd.addSatellite(tempMoonAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Io", 1.7);
        tempAdd.addSatellite(tempMoonAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Europa", 3.5);
        tempAdd.addSatellite(tempMoonAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Ganymede", 7.1);
        tempAdd.addSatellite(tempMoonAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Callisto", 16.6);
        tempAdd.addSatellite(tempMoonAdd);

        tempAdd.printSatellites();

        tempAdd = new HeavenlyBodyPlanet("Saturn", 11000);
        tempAdd.addBody(tempAdd);
        tempAdd.printThePlanets();
        theSun.addSatellite(tempAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Titan", 16);
        tempAdd.addSatellite(tempMoonAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Rhea", 4.5);
        tempAdd.addSatellite(tempMoonAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Iapetus", 79);
        tempAdd.addSatellite(tempMoonAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Dione", 2.7);
        tempAdd.addSatellite(tempMoonAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Tethys", 1.9);
        tempAdd.addSatellite(tempMoonAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Enceladus", 1.4);
        tempAdd.addSatellite(tempMoonAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Mimas", 0.9);
        tempAdd.addSatellite(tempMoonAdd);

        tempAdd.printSatellites();

        tempAdd = new HeavenlyBodyPlanet("Uranus", 31000);
        tempAdd.addBody(tempAdd);
        tempAdd.printThePlanets();
        theSun.addSatellite(tempAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Miranda", 1.4);
        tempAdd.addSatellite(tempMoonAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Ariel", 2.5);
        tempAdd.addSatellite(tempMoonAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Umbriel", 4.1);
        tempAdd.addSatellite(tempMoonAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Titania", 8.7);
        tempAdd.addSatellite(tempMoonAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Oberon", 13.4);
        tempAdd.addSatellite(tempMoonAdd);

        tempAdd.printSatellites();

        tempAdd = new HeavenlyBodyPlanet("Neptune", 60200);
        tempAdd.addBody(tempAdd);
        tempAdd.printThePlanets();
        theSun.addSatellite(tempAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Triton", 5.8);
        tempAdd.addSatellite(tempMoonAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Nereid", 360.1);
        tempAdd.addSatellite(tempMoonAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Halimede", 1879.08);
        tempAdd.addSatellite(tempMoonAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Sao", 2912.72);
        tempAdd.addSatellite(tempMoonAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Laomedeia", 3171.33);
        tempAdd.addSatellite(tempMoonAdd);

        tempAdd.printSatellites();

        tempAdd = new HeavenlyBodyPlanet("Pluto", 90600);
        tempAdd.addBody(tempAdd);
        tempAdd.printThePlanets();
        theSun.addSatellite(tempAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Charon", 6.38);
        tempAdd.addSatellite(tempMoonAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Styx", 20.1);
        tempAdd.addSatellite(tempMoonAdd);

        tempMoonAdd = new HeavenlyBodyMoon("Nix", 24.8);
        tempAdd.addSatellite(tempMoonAdd);

        tempAdd.printSatellites();

        theSun.printSatellites();

        HeavenlyBody tempAddComet = new HeavenlyBody("Halley's", 27000, "comet");
        theSun.addSatellite(tempAddComet);

        tempAddComet = new HeavenlyBody("Hyakutake", 25550000, "comet");
        theSun.addSatellite(tempAddComet);

        theSun.printSatellites();
    }
}
