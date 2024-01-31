package com.example.healingservice.model.pokemon;

import com.example.healingservice.model.dex.PokeDexEntry;
import java.util.Objects;

public class DoubleTypePokemon extends Pokemon {

  private String secondType;

  public DoubleTypePokemon(PokeDexEntry pokeDexEntry, String nickName, String ability, String type, boolean isHealed,
                           String secondType) {
    super(pokeDexEntry, nickName, ability, type, isHealed);
    this.secondType = secondType;
  }

  public String getSecondType() {
    return secondType;
  }

  public void setSecondType(String secondType) {
    this.secondType = secondType;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    if (!super.equals(object)) {
      return false;
    }
    DoubleTypePokemon that = (DoubleTypePokemon) object;
    return Objects.equals(secondType, that.secondType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), secondType);
  }

  @Override
  public String toString() {
    return "DoubleTypePokemon{" +
        "pokeDexEntry=" + getPokeDexEntry() + '\'' +
        ", name='" + getNickName() + '\'' +
        ", ability='" + getAbility() + '\'' +
        ", type='" + getType()+ '\'' +
        ", isHealed=" + isHealed() +
        "secondType='" + secondType + '\'' +
        '}';
  }
}
