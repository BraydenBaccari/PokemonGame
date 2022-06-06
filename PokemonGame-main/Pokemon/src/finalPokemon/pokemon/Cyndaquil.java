/** Required package class namespace */
package finalPokemon.pokemon;

import java.awt.Image;
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
        ImageIcon icon = new ImageIcon(getClass().getResource("/finalPokemon/pictures/cyndaquil.png"));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
        name = "Cyndaquil";
        type = "Fire";
        //Moveset   
        attack0 = "Tackle";
        attack1 = "Quick Attack";
        attack2 = "Smoke Screen";
        attack3 = "Flamethrower";
        //Stats
        atk = 52;
        hp = 39;
    }

}