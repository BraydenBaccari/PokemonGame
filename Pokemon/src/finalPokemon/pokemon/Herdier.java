/** Required package class namespace */
package finalPokemon.pokemon;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

 
/**
 * Herdier.java - description
 *
 * @author Liam McCausland
 * @since 15-Jun-2022, 12:37:45 PM
 */
public class Herdier extends Pokemon{


    public Herdier(JLabel label) {
        super(label);
        ImageIcon icon = new ImageIcon(getClass().getResource(Properties.HERDIER_ICON));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
        name = "Herdier";
        type = "Fighting";
        //Moveset   

        attackValues.add(0.04);
        attackNames.add("Bite");

        attackValues.add(0.01);
        attackNames.add("Bark");

        attackValues.add(0.02);
        attackNames.add("Tail Wag");

        attackValues.add(0.06);
        attackNames.add("Punch");
        
        //Stats
        atk = 20;
        hp = 70;
    }
 
}