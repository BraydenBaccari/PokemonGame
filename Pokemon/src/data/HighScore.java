/** Required package class namespace */
package data;

import collections.LinkedList;
import finalPokemon.pokemon.FileHandler;
import finalPokemon.pokemon.Properties;

/**
 * HighScore.java - description
 *
 * @author Liam McCausland
 * @since 20-Jun-2022, 3:23:04 PM
 */
public class HighScore {
    
    private FileHandler playerData;

    /**
     * Default constructor, set class properties
     */
    public HighScore() {
        file();
//        playerData = new FileHandler(Properties.HIGH_SCORE);
//        java.util.LinkedList<String> data = playerData.read();
//        if (data != null) {
//            System.out.println(data.get(1));
//        }
    }

    private void file() {
        
    }
}
