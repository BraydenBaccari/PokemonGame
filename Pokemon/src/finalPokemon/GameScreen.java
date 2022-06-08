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
import finalPokemon.pokemon.Pokemon;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import finalPokemon.pokemon.Squirtle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public Pokemon currentEnemy;
    public Pokemon friendly;
    public int enemyHp;

    public double friendlyHp;

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
        level(random(1, 1));
        initialize(charmanderIsActive, bulbasaurIsActive, squirtleIsActive);

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
        enemy = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        output = new javax.swing.JLabel();
        enemyHealth = new javax.swing.JLabel();
        friendlyHealth = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(77, 141, 231, 204);

        enemy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(enemy);
        enemy.setBounds(705, 141, 231, 204);

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

        output.setText("A wild name has appeard!");
        getContentPane().add(output);
        output.setBounds(400, 220, 570, 100);

        enemyHealth.setText("health");
        getContentPane().add(enemyHealth);
        enemyHealth.setBounds(800, 370, 33, 16);

        friendlyHealth.setText("heatlh");
        getContentPane().add(friendlyHealth);
        friendlyHealth.setBounds(170, 370, 50, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        chooseMove();
    }//GEN-LAST:event_button1ActionPerformed

    private void setFrame() {
        this.setTitle("Pokemon");
        this.setSize(1000, 800);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void initialize(boolean ch, boolean bu, boolean sq) {
        if (bu)      bulbasaur = new Bulbasaur(jLabel1);   
        else if (ch) charmander = new Charmander(jLabel1);
        else if (sq) squirtle = new Squirtle(jLabel1);
        
        friendlyHp = getFriendly().hp;
        friendlyHealth.setText(getFriendly().hp + "/" + getFriendly().hp);
        button1.setLabel(getFriendly().attack0);
        button2.setLabel(getFriendly().attack1);
        button3.setLabel(getFriendly().attack2);
        button4.setLabel(getFriendly().attack3);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private javax.swing.JLabel enemy;
    private javax.swing.JLabel enemyHealth;
    private javax.swing.JLabel friendlyHealth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel output;
    // End of variables declaration//GEN-END:variables

    private void level(int lvlNum) {
        switch (lvlNum) {
            case 1:
                cyndaquil();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                break;
        }
    }

    private void setText() {
        enemy.setVisible(true);
        enemy.setOpaque(true);
    }

    private double attack(Pokemon attack, double multiplier) {
        double dmg = attack.atk * multiplier;
        return dmg;
    }

    /**
     * makes a random number between the high, low and size variables
     *
     * @param low
     * @param high
     * @return
     */
    private static int random(int low, int high) {
        double seed = Math.random();
        double L = (double) low;
        double H = (double) high;
        double value = (H - L + 1) * seed + L;
        int answer = (int) value;
        return answer;

    }

    private void cyndaquil() {
        output.setText("A wild cyndaquil has appeared!");
        cyndaquil = new Cyndaquil(enemy);
        currentEnemy = cyndaquil;
        enemyHp = cyndaquil.hp;

        //Enemy health text
        enemyHealth.setOpaque(true);
        enemyHealth.setVisible(true);
        enemyHealth.setText(enemyHp + "/" + cyndaquil.hp);
        add(enemyHealth);

    }

    protected void enemyTurn() {
        String attackName = "";
        double dmg = 0;
        switch (random(1, 1)) {
            case 1:
                dmg = attack(getEnemy(), 0.2);
                friendlyHp -= dmg;
                friendlyHealth.setText(friendlyHp + "/" + getFriendly().hp);
                attackName = getEnemy().attack0;
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }
        output.setText(getEnemy().name + " used " + attackName + " and did " + dmg + " damage!");
    }

    private void chooseMove() {
        if (bu) {
            double dmg = attack(bulbasaur, 0.12);
            enemyHp -= dmg;
            enemyHealth.setText(enemyHp + "/" + cyndaquil.hp);
            output.setText("Bulbasaur used Seed Bomb and did " + dmg + " damage!");
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            if (enemyHp <= 0) {
                output.setText(currentEnemy + " has fainted!");
                System.exit(0);
            }
        } else if (ch) {
            //scratch();

        } else if (sq) {
            //tackle();
        }
        enemyTurn();
    }

    private Pokemon getEnemy() {
        return currentEnemy;
    }

    private Pokemon getFriendly() {
        if (bu) {
            friendly = bulbasaur;
        } else if (ch) {
            friendly = charmander;

        } else if (sq) {
            friendly = squirtle;
        }

        return friendly;
    }

}
