/** Required package class namespace */
package finalPokemon.pokemon;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Weedle.java - Represents a Weedle pokemon. It holds properties and
 * sets the label accordingly.
 *
 * @author Liam McCausland
 * @since 12-May-2022, 2:45:38 PM
 */
public class Weedle extends Pokemon {

    public Weedle(JLabel label) {
        super(label);
        ImageIcon icon = new ImageIcon(getClass().getResource(Properties.WEEDLE_ICON));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
        name = "Weedle";
        type = "Bug";
        //Moveset   

        attackValues.add(0.3);
        attackNames.add("Bite");

        attackValues.add(0.2);
        attackNames.add("Pinch");

        attackValues.add(0.1);
        attackNames.add("Sting");

        attackValues.add(0.5);
        attackNames.add("Scream");

        //Stats
        atk = 30;
        hp = 23;
    }
}
