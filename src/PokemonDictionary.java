import java.util.ArrayList;

public class PokemonDictionary {


    public static final String[] names = {
            "Charmander",
            "Pikachu",
            "Bulbasour",
            "Squirtle",
            "Eevee",
            "Ditto"
    };

    public static final String[] attackNames = {
            "placaje",
            "salpicadura",
            "Ataque ala",
            "Puño trueno",
            "Arañazo",
            "Atadura",
            "Ataque furia"
    };



    public static int getHp() {
        return (int) (Math.random() * 1000) + 1;
    }


    public static String[] getNames() {
        return names;
    }



    public static ArrayList<Integer> getDamage() {
        ArrayList<Integer> arrayDamages = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            int damage = (int) (Math.random() * 150) + 1;
            arrayDamages.add(damage);
        }

        return arrayDamages;
    }


    public static ArrayList<String> getAttacks() {

    ArrayList<String> attackNamesArray = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            int indexRandom = (int) (Math.random() * attackNames.length);
            attackNamesArray.add(attackNames[indexRandom]);
        }

        return attackNamesArray;
    }

}
