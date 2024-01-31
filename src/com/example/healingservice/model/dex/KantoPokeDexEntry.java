package com.example.healingservice.model.dex;

import java.util.Objects;

public class KantoPokeDexEntry implements PokeDexEntry {
  private String description;
  private int number;
  private String name;

  public KantoPokeDexEntry(String description, int number, String name) {
    this.description = description;
    this.number = number;
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int getNationalDexNumber() {
    return getNumber();
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    KantoPokeDexEntry that = (KantoPokeDexEntry) object;
    return number == that.number && Objects.equals(description, that.description) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, number, name);
  }

  @Override
  public String toString() {
    return "KantoPokeDexEntry{" +
        "description='" + description + '\'' +
        ", number=" + number +
        ", name='" + name + '\'' +
        '}';
  }
}
