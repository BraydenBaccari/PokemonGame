/** Required package class namespace */
package finalPokemon.pokemon;

import java.util.LinkedList;
import javax.swing.JLabel;

/**
 * Pokemon.java - description
 *
 * @author Liam McCausland
 * @since 10-May-2022, 3:02:04 PM
 */
public class Pokemon {

    public int index;
    public String name;
    public String type;
    public LinkedList attacks = new LinkedList();
    public JLabel label;
    // attacks
    public String attack0;
    public String attack1;
    public String attack2;
    public String attack3;
    //stats
    public int hp;
    public int def;
    public int atk;

    /**
     * Default constructor, set class properties
     */
    public Pokemon(JLabel label) {
        index = 0;
        this.label = label;
        name = null;
        type = null;
        //Moveset
        hp = 0;
        def = 0;
        atk = 0;
        //moveset
        attack0 = null;
        attack1 = null;
        attack2 = null;
        attack3 = null;

    }

    public boolean equals(Object object) {
        return super.equals(object);
    }
}
