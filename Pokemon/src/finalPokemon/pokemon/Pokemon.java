/** Required package class namespace */
package finalPokemon.pokemon;

import java.util.LinkedList;
import javax.swing.JLabel;
import finalPokemon.GameScreen;

/**
 * Pokemon.java - description
 *
 * @author Liam McCausland
 * @since 10-May-2022, 3:02:04 PM
 */
public class Pokemon {

    public String name;
    public String type;
    public JLabel label;

    // attacks
//    public LinkedList attack0 = new LinkedList();
//    public LinkedList attack1 = new LinkedList();
//    public LinkedList attack2 = new LinkedList();
//    public LinkedList attack3 = new LinkedList();
    public LinkedList attackNames = new LinkedList();
    public LinkedList attackValues = new LinkedList();

    //stats
    public int hp;
    public int atk;

    /**
     * Default constructor, set class properties
     */
    public Pokemon(JLabel label) {
        this.label = label;
        name = null;
        type = null;
        //Moveset
        hp = 0;
        atk = 0;
    }

    public Pokemon getFriendly() {
        return this;
    }

    public String getAttack(int button) {
        return (String) getFriendly().attackNames.get(button - 1);
    }

    public double damage(Pokemon pokemonAttack, double multiplier) {
        double dmg = pokemonAttack.atk * multiplier;
        return dmg;
    }

}
