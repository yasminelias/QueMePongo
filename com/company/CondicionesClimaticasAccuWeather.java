package com.company;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class CondicionesClimaticasAccuWeather implements CondicionesClimaticas {
  private CondicionesClimaticasAccuWeather instancia;
  private LocalDateTime ultimaActualizacion = LocalDateTime.now();
  private AccuWeatherAPI apiClima = new AccuWeatherAPI();
  private List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");

  public <T> T obtenerCondiciones(String condicion){
    if(pasoTiempoLimite()){
      estadoDelTiempo("Buenos Aires, Argentina");
    }
    return (T) condicionesClimaticas.get(0).get(condicion);
  }

  private boolean pasoTiempoLimite() {
    return ultimaActualizacion.isBefore(LocalDateTime.now().minusHours(12));
  }

  @Override
  public void estadoDelTiempo(String ubicacion) {
    condicionesClimaticas = apiClima.getWeather(ubicacion);
  }

  public static CondicionesClimaticasAccuWeather getInstance(){
    if (instancia == null){
      instancia = new CondicionesClimaticasAccuWeather();
    }
    return instancia;
  }
}