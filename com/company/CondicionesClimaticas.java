package com.company;

public interface CondicionesClimaticas {
    public void estadoDelTiempo(String ubicacion);
    public <T> T obtenerCondiciones(String condicion);
}
