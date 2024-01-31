package com.example.healingservice.model.pokemon;

import com.example.healingservice.model.dex.PokeDexEntry;
import java.util.Objects;

public class Pokemon {

  private PokeDexEntry pokeDexEntry;
  private String nickName;

  private String ability;

  private String type;

  private boolean isHealed;

  public Pokemon(PokeDexEntry pokeDexEntry, String nickName, String ability, String type, boolean isHealed) {
    this.pokeDexEntry = pokeDexEntry;
    this.nickName = nickName;
    this.ability = ability;
    this.type = type;
    this.isHealed = isHealed;
  }

  public PokeDexEntry getPokeDexEntry() {
    return pokeDexEntry;
  }

  public void setPokeDexEntry(PokeDexEntry pokeDexEntry) {
    this.pokeDexEntry = pokeDexEntry;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public String getAbility() {
    return ability;
  }

  public void setAbility(String ability) {
    this.ability = ability;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public boolean isHealed() {
    return isHealed;
  }

  public void setHealed(boolean healed) {
    isHealed = healed;
  }

  public int getNationalDexNumber() {
    return this.pokeDexEntry.getNationalDexNumber();
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Pokemon pokemon = (Pokemon) object;
    return isHealed == pokemon.isHealed && Objects.equals(pokeDexEntry, pokemon.pokeDexEntry) &&
        Objects.equals(nickName, pokemon.nickName) && Objects.equals(ability, pokemon.ability) &&
        Objects.equals(type, pokemon.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pokeDexEntry, nickName, ability, type, isHealed);
  }

  @Override
  public String toString() {
    return "Pokemon{" +
        "pokeDexEntry=" + pokeDexEntry +
        ", name='" + nickName + '\'' +
        ", ability='" + ability + '\'' +
        ", type='" + type + '\'' +
        ", isHealed=" + isHealed +
        '}';
  }
}
