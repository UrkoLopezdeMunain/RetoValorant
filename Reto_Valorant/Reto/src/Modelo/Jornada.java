package Modelo;

import java.time.LocalDate;

public class Jornada {
    private int numJornada;
    private LocalDate fechaInicio;

    public Jornada(int numJornada, LocalDate fechaInicio) {
        this.numJornada = numJornada;
        this.fechaInicio = fechaInicio;
    }

    public Jornada() {
    }

    public int getNumJornada() {
        return numJornada;
    }

    public void setNumJornada(int numJornada) {
        this.numJornada = numJornada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}
