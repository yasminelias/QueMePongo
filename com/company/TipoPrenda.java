package com.company;

public class TipoPrenda{
  Categoria categoria;
  TipoDePrenda tipoDePrenda;
  public TipoPrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria categoria() {
    return this.categoria;
  }
}
