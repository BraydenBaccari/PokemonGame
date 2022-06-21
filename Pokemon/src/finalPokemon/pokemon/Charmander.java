/** Required package class namespace */
package finalPokemon.pokemon;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Charmander.java - Represents a Charmander pokemon. It holds properties and
 * sets the label accordingly.
 *
 * @author Liam McCausland
 * @since 12-May-2022, 2:45:38 PM
 */
public class Charmander extends Pokemon {

    /**
     * Default constructor, set class properties
     */
    public Charmander(JLabel label) {
        super(label);

        name = "Charmander";
        label.setIcon(new ImageIcon(getClass().getResource(Properties.CHARMANDER_ICON_RIGHT)));
        type = "Fire";
        //Moveset

        attackValues.add(0.05);
        attackNames.add("Scratch");

        attackValues.add(0.03);
        attackNames.add("Fire Fang");

        attackValues.add(0.01);
        attackNames.add("Smoke Screen");

        attackValues.add(0.04);
        attackNames.add("Flamethrower");
        
        //Stats
        atk = 52;
        hp = 39;
    }

}
