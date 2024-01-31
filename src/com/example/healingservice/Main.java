package com.example.healingservice;

import com.example.healingservice.model.dex.JohtoPokeDexEntry;
import com.example.healingservice.model.dex.KantoPokeDexEntry;
import com.example.healingservice.model.pokemon.DoubleTypePokemon;
import com.example.healingservice.model.pokemon.Pokemon;
import com.example.healingservice.model.trainer.Trainer;
import com.example.healingservice.service.JohtoHealingService;
import com.example.healingservice.service.KantoHealingService;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class Main {

  private static final Logger log = Logger.getLogger(Main.class.getName());

  static KantoHealingService kantoHealingService = new KantoHealingService();
  static JohtoHealingService johtoHealingService = new JohtoHealingService();

   public static void main(String[] args) {
    Trainer trainer1 = new Trainer("Ash Ketchum", new HashSet<>(generateAshPokemon()));
    log.info("Pokemon before: " + trainer1.getPokemon());
    healPokemon(trainer1.getPokemon());
    log.info("Pokemon after: " + trainer1.getPokemon());
  }

  private static void healPokemon(Set<Pokemon> pokemon) {
    for (Pokemon poke : pokemon) {
      if (poke.isHealed()) {
        log.info("Pokemon " + poke.getNickName() + " is already healed");
        continue;
      }
      if (poke.getPokeDexEntry() instanceof KantoPokeDexEntry) {
        kantoHealingService.healPokemon(poke);
      } else if (poke.getPokeDexEntry() instanceof JohtoPokeDexEntry) {
        johtoHealingService.healPokemon(poke);
      }
    }
  }

  private static Set<Pokemon> generateAshPokemon() {
    return new HashSet<>(
        Set.of(
            new Pokemon(new KantoPokeDexEntry("Pikachu is very cute", 25, "Pikachu"),
                "Pikaaa", "Static", "Electric", false),
            new Pokemon(new JohtoPokeDexEntry("Don't touch it burns", 5, "Quilava"),
                "HotSonic", "Blaze", "Fire", false),
            new DoubleTypePokemon(new JohtoPokeDexEntry("Wooper even cuter than Pickachu (fight me after my Talk)", 56, "Wooper"),
                "WoopDiDoo", "Water Absorb", "Water", false, "Ground"),
            new Pokemon(new JohtoPokeDexEntry("Feraligatr is a Big Jaw Pokemon", 6, "Feraligatr"),
                "CrocoDoc", "Torrent", "Water", false),
            new DoubleTypePokemon(new KantoPokeDexEntry("Venusaur is big and healthy", 3, "Venusaur"),
                "PoisonReptile", "Overgrow", "Grass", true, "Poison")
        )
    );
  }
}