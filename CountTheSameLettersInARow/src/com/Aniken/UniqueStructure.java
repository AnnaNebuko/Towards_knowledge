package com.Aniken;

public class UniqueStructure {

  String letter;
  Integer quantity;

  UniqueStructure(String letter) {
    this.letter = letter;
    quantity = 1;
  }

  void increment() {
    this.quantity++;
  }

  public String getLetter() {
    return letter;
  }

  @Override
  public String toString() {
    return "(\"" + letter + "\", " + quantity + ")";
  }

}

