/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package finalPokemon.pokemon;

/**
 *
 * @author l.mccausland
 */
public interface PokemonInt {

    public Pokemon getFriendly();
    public double damage(Pokemon pokemonAttack, double multiplier);
    public String getAttack(int button);

}
