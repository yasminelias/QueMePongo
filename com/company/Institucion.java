package com.company;
import static java.util.Objects.requireNonNull;
public class Institucion {
  String nombre;
  Uniforme uniforme;

  public Institucion(String nombre, Uniforme uniforme) {
  {
    this.nombre = requireNonNull(nombre,"fala agregar el nombre");
    this.uniforme = requireNonNull(uniforme,"fala agregar el uniforme");
  }
}
}
