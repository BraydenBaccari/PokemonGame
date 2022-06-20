/** Required package class namespace */
package finalPokemon.pokemon;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

 
/**
 * Garchomp.java - description
 *
 * @author Liam McCausland
 * @since 16-Jun-2022, 3:03:27 PM
 */
public class Garchomp extends Pokemon
{
   public Garchomp(JLabel label) {
        super(label);
        ImageIcon icon = new ImageIcon(getClass().getResource(Properties.GARCHOMP_ICON));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
        name = "Garchomp";
        type = "Dragon";
        //Moveset   

        attackValues.add(0.8);
        attackNames.add("Roar");

        attackValues.add(0.6);
        attackNames.add("Tail Whip");

        attackValues.add(0.7);
        attackNames.add("Dragon Slash");

        attackValues.add(0.8);
        attackNames.add("Bite");
        
        //Stats
        atk = 30;
        hp = 80;
    }

}