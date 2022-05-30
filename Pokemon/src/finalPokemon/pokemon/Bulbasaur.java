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
public class Bulbasaur extends Pokemon
{

    /**
     * Default constructor, set class properties
     */
    public Bulbasaur(JLabel label) {
        super(label);
        name = "Bulbasaur";
        label.setIcon(new ImageIcon("C:\\Users\\l.mccausland\\Desktop\\Projects\\Pokemon\\src\\finalPokemon\\pictures\\bulbasaur2.png"));
        type = "Grass";
    }  
}