import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Pokemon {
    private String name;
    public int hp;
    private int maxHp;
    private ArrayList<Integer> damages;
    private ArrayList<String> nameAttacks;


    public Pokemon(String name, int hp, ArrayList<Integer> damages, ArrayList<String> nameAttacks) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.damages = damages;
        this.nameAttacks = nameAttacks;
    }


    public void presentation() {

        System.out.println("mi nombre es:" + this.getName());
        System.out.println("mi vida maxima es:" + this.getMaxHp());
        // pokemon.damages.set(1,pokemon.damages.get(1)-20);
        this.getAttackName();

        System.out.println("-----------------------------");
    }

    public String getName() {
        return name;
    }

    public int getMaxHp() {
        return maxHp;
    }


    public int getDamages() {

        int indexRandom = (int) (Math.random() * damages.size());
        return damages.get(indexRandom);
    }


    public void getAttackName() {
        for (int i = 0; i < nameAttacks.size(); i++) {
            System.out.println(nameAttacks.get(i));
        }
    }


    public void takeDamage(int damage) {
        System.out.println( this.name + " tiene la vida actual de: " + this.hp);

        if (this.hp > damage) {
            this.hp = this.hp - damage;
            System.out.println("despues del ataque la vida actual de " + this.name + " es de: " + this.hp);

        } else {
            this.hp = 0;
            System.out.println(this.name + " ha caido en combate");
        }
    }

    public void winnerDeclaration() {
        System.out.println("ha ganado la pelea " + this.name + " con " + this.hp + " de salud");
    }

}
