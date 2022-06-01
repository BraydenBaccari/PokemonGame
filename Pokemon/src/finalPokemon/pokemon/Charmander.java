/** Required package class namespace */
package finalPokemon.pokemon;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Charmander.java - description
 *
 * @author Liam McCausland
 * @since 10-May-2022, 3:04:34 PM
 */
public class Charmander extends Pokemon {

    /**
     * Default constructor, set class properties
     */
    public Charmander(JLabel label) {
        super(label);

        index = 1;
        name = "Charmander";
        label.setIcon(new ImageIcon("C:\\Users\\l.mccausland\\Desktop\\Projects\\Pokemon\\src\\finalPokemon\\pictures\\charmander2.png"));
        //label.setText(name);
        type = "Fire";
        //Moveset
        attack0 = "Scratch";
        attack1 = "Fire Fang";
        attack2 = "Smoke Screen";
        attack3 = "Flamethrower";
        //Stats
        atk = 52;
        hp = 39;
        def = 43;
    }

}
