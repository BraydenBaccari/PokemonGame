/** Required package class namespace */
package finalPokemon.pokemon;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Bulbasaur.java - description
 *
 * @author Liam McCausland
 * @since 12-May-2022, 2:45:38 PM
 */
public class Bulbasaur extends Pokemon {

    /**
     * Default constructor, set class properties
     */
    public Bulbasaur(JLabel label) {
        super(label);
        name = "Bulbasaur";
        label.setIcon(new ImageIcon("C:\\Users\\l.mccausland\\Desktop\\Projects\\Pokemon\\src\\finalPokemon\\pictures\\bulbasaur2.png"));
        type = "Grass";
        //Moveset
        attack0 = "Seed Bomb";
        attack1 = "Sleep Powder";
        attack2 = "Synthesis";
        attack3 = "Leech Seed";
        //Stats
        atk = 49;
        hp = 45;
        def = 49;
    }
}
