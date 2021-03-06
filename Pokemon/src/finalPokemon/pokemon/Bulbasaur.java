/** Required package class namespace */
package finalPokemon.pokemon;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Bulbasaur.java - Represents a Bulbasaur pokemon. It holds properties and
 * sets the label accordingly.
 *
 * @author Liam McCausland
 * @since 12-May-2022, 2:45:38 PM
 */
public class Bulbasaur extends Pokemon {

    /**
     * Default constructor, set class properties
     * @param label
     */
    public Bulbasaur(JLabel label) {
        super(label);
        name = "Bulbasaur";
        label.setIcon(new ImageIcon(getClass().getResource(Properties.BULBASAUR_ICON_RIGHT)));
        type = "Grass";
        //Moveset
         
        attackValues.add(0.1);
        attackNames.add("Seed Bomb");       

        attackValues.add(0.05);
        attackNames.add("Sleep Powder");

        attackValues.add(0.07);
        attackNames.add("Synthesis");

        attackValues.add(0.08);
        attackNames.add("Leech Seed");
        
        //Stats
        atk = 49;
        hp = 45; 
    }
}
