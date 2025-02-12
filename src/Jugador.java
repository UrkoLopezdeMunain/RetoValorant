package Modelo;

import java.time.LocalDate;

public class Jugador {
    private int codJugador;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private LocalDate fechaNacimiento;
    private int Sueldo;
    private String rol;
    private String nickname;
    private Equipo equipo;

    public Jugador(int codJugador, String nombre, String apellido, String nacionalidad, LocalDate fechaNacimiento, int sueldo, String rol, String nickname, Equipo equipo) {
        this.codJugador = codJugador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        Sueldo = sueldo;
        this.rol = rol;
        this.nickname = nickname;
        this.equipo = equipo;
    }

    public Jugador(int codJugador, String nombre, String apellido, String nacionalidad, LocalDate fechaNacimiento, int sueldo, String rol, String nickname) {
        this.codJugador = codJugador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        Sueldo = sueldo;
        this.rol = rol;
        this.nickname = nickname;
    }

    public Jugador() {
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getCodJugador() {
        return codJugador;
    }

    public void setCodJugador(int codJugador) {
        this.codJugador = codJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int sueldo) {
        Sueldo = sueldo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
