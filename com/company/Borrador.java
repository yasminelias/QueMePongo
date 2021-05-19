package com.company;

import java.util.List;

public class Borrador {
  TipoPrenda tipoPrenda;
  Material material;
  Trama trama = Trama.LISA;
  Color color;
  Color colorSecundario;
  List<Prenda> prendas;
  void cargarTipoPrenda(TipoPrenda tipo){
    this.tipoPrenda = tipo;
  }
  void cagarMaterial(Material material){
    this.material = material;
  }
  void cargarTrama(Trama trama){
    this.trama = trama;
  }
  void cargarColorPrincipal(Color color){
    this.color = color;
  }
  void cargarColorSecundario(Color colorSecundario){
    this.colorSecundario = colorSecundario;
  }

  Prenda crearPrenda(){
    return new Prenda(tipoPrenda,material,trama,color,colorSecundario);
  }
}
