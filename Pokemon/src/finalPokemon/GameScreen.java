/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalPokemon;

import static finalPokemon.StartMenu.bulbasaurIsActive;
import static finalPokemon.StartMenu.charmanderIsActive;
import static finalPokemon.StartMenu.squirtleIsActive;
import finalPokemon.pokemon.Bulbasaur;
import finalPokemon.pokemon.Charmander;
import finalPokemon.pokemon.Cyndaquil;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import finalPokemon.pokemon.Squirtle;

/**
 *
 * @author l.mccausland
 */
public class GameScreen extends JFrame {

    private Bulbasaur bulbasaur;
    private Charmander charmander;
    private Squirtle squirtle;
    private Cyndaquil cyndaquil;

    public boolean ch;
    public boolean bu;
    public boolean sq;

    /**
     * Creates new form GameScreen
     */
    public GameScreen(boolean ch, boolean bu, boolean sq) {
        this.ch = ch;
        this.bu = bu;
        this.sq = sq;

        initComponents();
        setFrame();
        setText();
        initialize(charmanderIsActive, bulbasaurIsActive, squirtleIsActive);
        level1();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(77, 141, 231, 204);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(705, 141, 231, 204);

        button1.setLabel("button1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1);
        button1.setBounds(101, 459, 353, 129);

        button2.setLabel("button1");
        getContentPane().add(button2);
        button2.setBounds(101, 609, 353, 129);

        button3.setLabel("button1");
        getContentPane().add(button3);
        button3.setBounds(482, 609, 353, 129);

        button4.setLabel("button1");
        getContentPane().add(button4);
        button4.setBounds(482, 459, 353, 129);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        if (bu) {
            seedBomb();
        } else if (ch) {
            scratch();

        } else if (sq) {
            tackle();

        }
    }//GEN-LAST:event_button1ActionPerformed

    private void setFrame() {
        this.setTitle("Pokemon");
        this.setSize(1000, 800);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void initialize(boolean ch, boolean bu, boolean sq) {
        if (bu) {
            bulbasaur = new Bulbasaur(jLabel1);
            button1.setLabel(bulbasaur.attack0);
            button2.setLabel(bulbasaur.attack1);
            button3.setLabel(bulbasaur.attack2);
            button4.setLabel(bulbasaur.attack3);
        } else if (ch) {
            charmander = new Charmander(jLabel1);
            button1.setLabel(charmander.attack0);
            button2.setLabel(charmander.attack1);
            button3.setLabel(charmander.attack2);
            button4.setLabel(charmander.attack3);
        } else if (sq) {
            squirtle = new Squirtle(jLabel1);
            button1.setLabel(squirtle.attack0);
            button2.setLabel(squirtle.attack1);
            button3.setLabel(squirtle.attack2);
            button4.setLabel(squirtle.attack3);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    private void level1() {
        cyndaquil = new Cyndaquil(jLabel2);
    }

    private void setText() {
        jLabel2.setVisible(true);
        jLabel2.setOpaque(true);
    }

    private void seedBomb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void scratch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void tackle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
