package org.example;

public class Pokemon {
    private String species;
    private int level;
    private int healthPoints;
    private int attack;
    private int defense;
    private int speed;

    public Pokemon(){

    }

    public Pokemon(String species, int level, int healthPoints, int attack, int defense, int speed) {
        this.species = species;
        this.level = level;
        this.healthPoints = healthPoints;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "species='" + species + '\'' +
                ", level=" + level +
                ", healthPoints=" + healthPoints +
                ", attack=" + attack +
                ", defense=" + defense +
                ", speed=" + speed +
                '}';
    }
}
