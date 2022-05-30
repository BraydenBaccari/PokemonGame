/** Required package class namespace */
package finalPokemon.pokemon;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Cyndaquil.java - description
 *
 * @author Liam McCausland
 * @since 26-May-2022, 3:09:47 PM
 */
public class Cyndaquil extends Pokemon {

    public Cyndaquil(JLabel label) {
        super(label);
        label.setIcon(new ImageIcon("C:\\Users\\l.mccausland\\Desktop\\Projects\\Pokemon\\src\\finalPokemon\\pictures\\cyndaquil.png"));
        name = "Cyndaquil";
        type = "Fire";
    }

}
