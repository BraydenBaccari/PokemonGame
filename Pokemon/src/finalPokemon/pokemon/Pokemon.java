/** Required package class namespace */
package finalPokemon.pokemon;

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
    public String[] attacks;
    public JLabel label;

    /**
     * Default constructor, set class properties
     */
    public Pokemon(JLabel label) {
        index = 0;
        this.label = label;
        name = null;
        type = null;
    }

    public boolean equals(Object object) {
        return super.equals(object);
    }
}
