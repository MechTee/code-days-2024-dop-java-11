package com.example.healingservice.service;

import com.example.healingservice.model.pokemon.DoubleTypePokemon;
import com.example.healingservice.model.pokemon.Pokemon;
import java.util.logging.Logger;

public class JohtoHealingService implements HealingService {

  private static final Logger log = Logger.getLogger(JohtoHealingService.class.getName());

  @Override
  public void healPokemon(Pokemon pokemon) {
    // we do some Johto specific healing here
    if (pokemon instanceof DoubleTypePokemon) {
      DoubleTypePokemon doubleTypePokemon = (DoubleTypePokemon) pokemon;
      log.info("Healed pokemon from johto with PokeDexNumber: "
          + pokemon.getNationalDexNumber() +" with Name: " + pokemon.getNickName()
          + " and second type: " + doubleTypePokemon.getSecondType());
    } else {
      log.info("Healed pokemon from johto with PokeDexNumber: "
          + pokemon.getNationalDexNumber() + " with Name: " + pokemon.getNickName());
    }
    pokemon.setHealed(true);
  }
}
