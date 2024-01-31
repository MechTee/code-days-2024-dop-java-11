package com.example.healingservice.service;

import com.example.healingservice.model.pokemon.DoubleTypePokemon;
import com.example.healingservice.model.pokemon.Pokemon;
import java.util.logging.Logger;

public class KantoHealingService implements HealingService {

  private static final Logger log = Logger.getLogger(KantoHealingService.class.getName());

  @Override
  public void healPokemon(Pokemon pokemon) {
    // we do some Kanto specific healing here
    if (pokemon instanceof DoubleTypePokemon) {
      DoubleTypePokemon doubleTypePokemon = (DoubleTypePokemon) pokemon;
      log.info("Healed pokemon from kanto with PokeDexNumber: "
          + pokemon.getNationalDexNumber() + " with Name: " + pokemon.getNickName()
          + " and second type: " + doubleTypePokemon.getSecondType());
    } else {
      log.info("Healed pokemon from kanto with PokeDexNumber: "
          + pokemon.getNationalDexNumber() + " with Name: " + pokemon.getNickName());
    }
    pokemon.setHealed(true);
  }
}
