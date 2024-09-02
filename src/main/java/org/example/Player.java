package org.example;

import java.util.Arrays;

public class Player {
    private static Player instance;
    private String name;
    private int coins;
    private Pokemon[] team = new Pokemon[6];

    private Player(String name){
        this.name = name;
        this.coins = 500;
        this.team [0] = new Pokemon("Pikachu",
                5, 18, 10,  9, 15);
    }

    public static Player getInstance(String name){
        if (instance == null) {
            instance = new Player(name);
        }
        return instance;
    }

    public void addPokemon(Pokemon pokemon, int slot){
        releasePokemon(slot);
        team[slot] = pokemon;
        System.out.println("Se capturo un " + team[slot].getSpecies());
    }

    public void releasePokemon(int slot){
        if (team[slot] != null){
            System.out.println("Se libero un " + team[slot].getSpecies());
            team[slot] = null;
        }
    }

    @Override
    public String toString() {
        return "Player - " + Integer.toHexString(System.identityHashCode(this)) + " - {" +
                "\n name='" + name + '\'' +
                "\n coins=" + coins +
                "\n team=" + Arrays.toString(team) +
                '}';
    }
}
