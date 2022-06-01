/** Required package class namespace */
package finalPokemon.pokemon;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Squirtle.java - description
 *
 * @author Liam McCausland
 * @since 12-May-2022, 2:45:23 PM
 */
public class Squirtle extends Pokemon {

    /**
     * Default constructor, set class properties
     */
    public Squirtle(JLabel label) {
        super(label);

        name = "Squirtle";
        label.setIcon(new ImageIcon("C:\\Users\\l.mccausland\\Desktop\\Projects\\Pokemon\\src\\finalPokemon\\pictures\\squirtle2.png"));
        //label.setText(name);
        index = 2;
        type = "Water";
        //Moveset
        attack0 = "Tackle";
        attack1 = "Water Gun";
        attack2 = "Protect";
        attack3 = "Aqua Tail";
        //Stats
        atk = 48;
        hp = 44;
        def = 65;
    }
}
