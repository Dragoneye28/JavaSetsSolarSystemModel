package com.example.mypackage;

import java.util.*;

public class HeavenlyBody {

    private final static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private final static Set<HeavenlyBody> heavenlyBodies = new LinkedHashSet<>();
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final String bodyType;

    public HeavenlyBody(String name, double orbitalPeriod, String bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites =  new LinkedHashSet<>();
        this.bodyType = bodyType.toUpperCase();
    }

    public void addBody(HeavenlyBody HB){
        if (!this.doesItExist(HB.getName(), HB.getBodyType())) {
            heavenlyBodies.add(HB);
        }
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public String getName() {
        return name;
    }

    public String getBodyType() {
        return bodyType;
    }

//    public void testForResults(String key){
//        solarSystem.containsKey(key);
//        solarSystem.get(key);
//    }

    public void addToTheMap(HeavenlyBody HB){
        String key = HB.getName()+"-"+HB.getBodyType();
        if (!solarSystem.containsKey(key)){
            solarSystem.put(key, HB);
        } else {
            solarSystem.replace(key, solarSystem.get(key), HB);
        }

    }

    public HeavenlyBody getSpecificOne(String name) {
        return solarSystem.get(name);
    }

    public boolean addSatellite(HeavenlyBody HBO){
        if (this.getBodyType().equals("PLANET")) {
            if (HBO.getBodyType().equals("MOON")) {
                return this.satellites.add(HBO);
            } else {
                System.out.println("Can't add a moon that isn't a moon to a planet's moon set.");
                return false;
            }
        } else if (getBodyType().equals("STAR") && !HBO.getBodyType().equals("MOON")) {
            return this.satellites.add(HBO);
        } else {
            System.out.println("Non planets and stars cannot have satellites. Not in my universe, buddyboi.");
            return false;
        }
    }

    public void printThePlanets(){
        for (HeavenlyBody HB : heavenlyBodies){
            System.out.println(HB.getName() + " of type " + HB.getBodyType() + " orbital period: " + HB.getOrbitalPeriod());
        }
        System.out.println();
    }

    public boolean doesItExist(String name, String bodyType){
        for (HeavenlyBody body : heavenlyBodies){
            if (body.getName().equals(name)){
                HashSet<HeavenlyBody> tempHash = new HashSet<>();
                tempHash.add(body);
                for (HeavenlyBody Body : tempHash) {
                    if (Body.getBodyType().equals(bodyType)) {
                        System.out.println("Body of name " + name + " type " + bodyType + " is already on the set.");
                        System.out.println();
                        return true;
                    } else {
                        System.out.println("Body: " + Body.getName() + " of type " + Body.getBodyType() +
                                " found. Names match, type of object to be added: " + bodyType);
                        System.out.println();
                        return false;
                    }
                }
            }
        }
        System.out.println(this.getBodyType() + " " + this.getName() + " wasn't found on the set.");
        System.out.println();
        return false;
    }


    public void printSatellites(){
        if (this.satellites.isEmpty()){
            System.out.println(this.name + " has no satellites.");
        } else {
            System.out.println("Printing satellites of " + this.getName() + ":");
            for (HeavenlyBody satellite : satellites) {
                System.out.println("\t" + satellite.getName() + " of type " + satellite.getBodyType() + " orbital period (in days) " + satellite.getOrbitalPeriod());
            }
        }
        System.out.println();
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public void getContents(){
        for (HeavenlyBody HB : heavenlyBodies) {
            System.out.println(HB.getName() + " of type " + HB.getBodyType());
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

//        System.out.println("obj.getClass() is " + obj.getClass());
//        System.out.println("this.getClass() is " + this.getClass());
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        String objName = ((HeavenlyBody) obj).getName();
        System.out.println(this.name.equals(objName));
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
//        System.out.println("hashCode() used");
        int result = this.name.hashCode() + 57;
//        System.out.println("The hashcode is: " + result);
        return result;
    }
}
