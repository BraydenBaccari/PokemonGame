/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalPokemon;

import collections.LinkedList;
import finalPokemon.pokemon.FileHandler;
import finalPokemon.pokemon.Properties;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author l.mccausland
 */
public class StartMenu extends javax.swing.JFrame {

    public static boolean charmanderIsActive = false;
    public static boolean bulbasaurIsActive = false;
    public static boolean squirtleIsActive = false;
    private FileHandler playerData;

    public int highScoreText;

    int i = 0;

    /**
     * Creates new form GameScreen
     */
    public StartMenu() {
        initComponents();
        setText();
        setFrame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        pokemonSelect = new java.awt.Button();
        playButton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalPokemon/pictures/title.png"))); // NOI18N
        getContentPane().add(title);
        title.setBounds(220, 50, 503, 164);

        pokemonSelect.setActionCommand("Play");
        pokemonSelect.setLabel("Pokemon Select");
        pokemonSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokemonSelectActionPerformed(evt);
            }
        });
        getContentPane().add(pokemonSelect);
        pokemonSelect.setBounds(392, 301, 162, 39);

        playButton.setActionCommand("Play");
        playButton.setLabel("Play");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        getContentPane().add(playButton);
        playButton.setBounds(392, 252, 162, 39);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        // for the monkeys that might use this program
        if (i >= 10) {
            JOptionPane.showMessageDialog(null, "how did a monkey get on the internet");
        } else {
            if (charmanderIsActive == false && squirtleIsActive == false && bulbasaurIsActive == false) {
                JOptionPane.showMessageDialog(null, "Please pick a pokemon", Properties.TITLE, JOptionPane.PLAIN_MESSAGE);
                i++;
            } else {

                GameScreen screen = new GameScreen(charmanderIsActive, bulbasaurIsActive, squirtleIsActive);
                this.dispose();
            }
        }

    }//GEN-LAST:event_playButtonActionPerformed

    private void pokemonSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokemonSelectActionPerformed

        PokemonSelect select = new PokemonSelect();
        this.dispose();
    }//GEN-LAST:event_pokemonSelectActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button playButton;
    private java.awt.Button pokemonSelect;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private void setFrame() {
        this.setTitle("Pokemon");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(1000, 600);
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("/finalPokemon/pictures/title.png"));
        this.setVisible(true);
    }

    private void setText() {
        ImageIcon icon;
        icon = new ImageIcon(getClass().getResource("/finalPokemon/pictures/title.png"));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(title.getWidth(), title.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        title.setIcon(scaledIcon);
        title.setOpaque(true);
        add(title);
    } 
}
