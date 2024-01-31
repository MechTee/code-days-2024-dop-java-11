package com.example.healingservice.model.trainer;

import com.example.healingservice.model.pokemon.Pokemon;
import java.util.Objects;
import java.util.Set;

public class Trainer {
  private String name;

  private Set<Pokemon> pokemon;

  public Trainer(String name, Set<Pokemon> pokemon) {
    this.name = name;
    this.pokemon = pokemon;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Pokemon> getPokemon() {
    return pokemon;
  }

  public void setPokemon(Set<Pokemon> pokemon) {
    this.pokemon = pokemon;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Trainer trainer = (Trainer) object;
    return Objects.equals(name, trainer.name) && Objects.equals(pokemon, trainer.pokemon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pokemon);
  }

  @Override
  public String toString() {
    return "Trainer{" +
        "name='" + name + '\'' +
        ", pokemon=" + pokemon +
        '}';
  }
}
