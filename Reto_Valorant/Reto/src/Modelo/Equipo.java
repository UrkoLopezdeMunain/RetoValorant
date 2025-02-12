package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Equipo {

    private String codEquipo;
    private String nombre;
    private LocalDate fechaFundacion;
    private int puntuacion;
    private ArrayList<Jugador> listaJugadores;

    public Equipo() {
        this.listaJugadores = new ArrayList<>();
    }

    public Equipo(String codEquipo, String nombre, LocalDate fechaFundacion, int puntuacion) {
        this.codEquipo = codEquipo;
        this.nombre = nombre;
        this.fechaFundacion = fechaFundacion;
        this.puntuacion = puntuacion;
    }

    public Equipo(String codEquipo, String nombre, LocalDate fechaFundacion, int puntuacion, ArrayList<Jugador> listaJugadores) {
        this.codEquipo = codEquipo;
        this.nombre = nombre;
        this.fechaFundacion = fechaFundacion;
        this.puntuacion = puntuacion;
        this.listaJugadores = listaJugadores;
    }

    public String getCodEquipo() {
        return codEquipo;
    }

    public void setCodEquipo(String codEquipo) {
        this.codEquipo = codEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public void agregarJugador(Jugador jugador) {
        this.listaJugadores.add(jugador);
    }

    public void eliminarJugador(Jugador jugador) {
        this.listaJugadores.remove(jugador);
    }
}
