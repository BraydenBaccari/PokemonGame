/** Required package class namespace */
package finalPokemon.pokemon;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Cyndaquil.java - Represents a Cyndaquil pokemon. It holds properties and
 * sets the label accordingly.
 *
 * @author Liam McCausland
 * @since 12-May-2022, 2:45:38 PM
 */
public class Cyndaquil extends Pokemon {

    public Cyndaquil(JLabel label) {
        super(label);
        ImageIcon icon = new ImageIcon(getClass().getResource(Properties.CYNDAQUIL_ICON));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
        name = "Cyndaquil";
        type = "Fire";
        //Moveset   

        attackValues.add(0.05);
        attackNames.add("Tackle");

        attackValues.add(0.02);
        attackNames.add("Quick Attack");

        attackValues.add(0.01);
        attackNames.add("Smoke Screen");

        attackValues.add(0.04);
        attackNames.add("Flamethrower");
        
        //Stats
        atk = 52;
        hp = 39;
    }

}
