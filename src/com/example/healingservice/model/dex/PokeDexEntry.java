package com.example.healingservice.model.dex;

public interface PokeDexEntry {
  String getDescription();
  void setDescription(String description);
  int getNumber();
  void setNumber(int number);
  String getName();
  void setName(String name);

  int getNationalDexNumber();
}
