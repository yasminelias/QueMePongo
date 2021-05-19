package com.company;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class SugerenciaDeAtuendo {

  private ArrayList<Prenda> prendasSuperiores = new ArrayList();
  private ArrayList<Prenda> prendasInferiores = new ArrayList();
  private ArrayList<Prenda> calzados = new ArrayList();
  //private Integer tempActual = 0; ESTO PUEDE QUE SE REEMPLAZE POR UN METODO PARA CONSULTAR DIRECTAMENTE A LA API

  public ArrayList<Prenda> generarSugerencia(){
    ArrayList<Prenda> sugerencia = new ArrayList();
    sugerencia.add(prendasSuperioresAcordes().get(0));
    sugerencia.add(prendasInferioresAcordes().get(0));
    sugerencia.add(calzadosAcordes().get(0));

    return sugerencia;
  }

  private ArrayList<Prenda> prendasSuperioresAcordes(){
    return (ArrayList<Prenda>) prendasSuperiores.stream().filter(p -> p.adecuada(CondicionesClimaticasAccuWeather.getInstance().obtenerCondiciones("Temperature"))).collect(Collectors.toList());
  }

  private ArrayList<Prenda> prendasInferioresAcordes(){
  }

  private ArrayList<Prenda> calzadosAcordes(){
  }
}
