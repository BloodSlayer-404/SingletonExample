package org.example;

public class Main {
    public static void main(String[] args) {
        Player player = Player.getInstance("Red");
        Player player2 = Player.getInstance("Blue");

        System.out.println(player);
        System.out.println();
        System.out.println(player2);

        System.out.println("\n\n");

        Pokemon wildPokemon = new Pokemon("Rattata",
                3, 11, 15,  6, 10);

        player.addPokemon(wildPokemon, 0);

        System.out.println("\n\n");
        System.out.println(player);
        System.out.println();
        System.out.println(player2);
    }
}