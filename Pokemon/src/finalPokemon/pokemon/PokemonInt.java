/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package finalPokemon.pokemon;

/** 
 * PokemonInt.java - Sets required methods for pokemon 
 * objects: getFriendly(), damage(), and getAttack().
 *
 * @author Liam McCausland 
 * @since 22-June-2022 
 */
public interface PokemonInt {

    /**
     * Returns the current pokemon
     * @return the current pokemon
     */
    public Pokemon getFriendly();
    
    /**
     * calculates the damage to inflict for the friendly pokemon
     * 
     * @param pokemonAttack the attack used
     * @param multiplier the attack multiplier
     * @return the damage
     */
    public double damage(Pokemon pokemonAttack, double multiplier);
    
    /**
     * Gets the attack used and returns it.
     * @param button button clicked
     * @return the attack used
     */
    public String getAttack(int button);

}
