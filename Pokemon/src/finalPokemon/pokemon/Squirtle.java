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
        label.setIcon(new ImageIcon(getClass().getResource(Properties.SQUIRTLE_ICON_RIGHT)));
        //label.setText(name);
        type = "Water";
        //Moveset 

        attackValues.add(.02);
        attackNames.add("Tackle");

        attackValues.add(.034);
        attackNames.add("Water Gun");

        attackValues.add(.01);
        attackNames.add("Protect");

        attackValues.add(.045);
        attackNames.add("Aqua Tail");

        //Stats
        atk = 48;
        hp = 44;
    }
}
