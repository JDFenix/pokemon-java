
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class index {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Pokemon[] pokemons = new Pokemon[2];

        for (int i = 0; i < 2; i++) {

            String[] names = PokemonDictionary.getNames();
            int randomIndex = (int) (Math.random() * names.length);
            int hpRandom = PokemonDictionary.getHp();

            ArrayList<Integer> damages = PokemonDictionary.getDamage();
            ArrayList<String> nameAttacks = PokemonDictionary.getAttacks();

            Pokemon pokemonCreated = new Pokemon(names[randomIndex], hpRandom, damages, nameAttacks);
            pokemons[i] = pokemonCreated;

            pokemonCreated.presentation();
        }

        int currentPlayerIndex = 0;
        while (pokemons[0].hp > 0 && pokemons[1].hp > 0) {
            Pokemon currentPlayer = pokemons[currentPlayerIndex];
            Pokemon opponent = pokemons[(currentPlayerIndex + 1) % 2];

            int damage = currentPlayer.getDamages();
            System.out.println(currentPlayer.getName() + " ha realizado un ataque de " + damage);
            opponent.takeDamage(damage);

            currentPlayerIndex = (currentPlayerIndex + 1) % 2;
        }

        if (pokemons[0].hp <= 0) {
            pokemons[1].winnerDeclaration();
        } else {
            pokemons[0].winnerDeclaration();
        }
    }
}
