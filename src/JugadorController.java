import Modelo.Jugador;
import Nacionalidades.Country;

import java.util.List;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Scanner;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JugadorController {

    private final JugadorDAO jugadorDAO;


    public JugadorController(JugadorDAO jugadorDAO) {
        this.jugadorDAO = new JugadorDAO();
    }


    public void dataValidation() {
        Jugador j = new Jugador();
        //j.setCodJugador() podemos autogenerarlo o teclear??

        j.setNombre(this.validarNomApeNik("Nombre", "Ingresa el nombre del jugador", "^[a-zA-ZñÑáéíóúÁÉÍÓÚüÜ]+ [a-zA-ZñÑáéíóúÁÉÍÓÚüÜ]+$"));
        j.setApellido(this.validarNomApeNik("Apellido", "Ingresa el apellido del jugador", "^[a-zA-ZñÑáéíóúÁÉÍÓÚüÜ]+ [a-zA-ZñÑáéíóúÁÉÍÓÚüÜ]+$"));
        j.setNacionalidad(this.validarNacionalidad("Nacionalidad", "¿En que pais nacio el jugador?", "^[a-zA-ZñÑ]+ [a-zA-ZñÑ]+$"));
    }


    public void agregarJugador(Jugador jugador) {
        jugadorDAO.agregar(jugador);
    }

    public void modificarJugador(String codJugador, Jugador nuevoJugador) {
        jugadorDAO.modificar(codJugador, nuevoJugador);
    }

    public void eliminarJugador(String codJugador) {
        jugadorDAO.eliminar(codJugador);
    }

    public List<Jugador> obtenerTodosLosJugadores() {
        return jugadorDAO.obtenerTodos();
    }

    public Jugador obtenerJugadorPorCodigo(String codJugador) {
        return jugadorDAO.obtenerPorCodigo(codJugador);
    }

    public String validarNomApeNik(String dato, String msj, String pat) {
        Scanner sc = new Scanner(System.in);
        boolean isValid = false;
        Pattern pattern = Pattern.compile(pat);
        String var = "";
        do {
            try {
                System.out.println(msj);
                var = sc.nextLine();
                Matcher matcher = pattern.matcher(var);
                if (matcher.matches()) {
                    isValid = true;
                } else {
                    System.out.println(dato + " no utiliza un formato valido");
                }

            } catch (NullPointerException e) {
                System.out.println("No se puede ingresar el" + dato + "vacio");
            }
        } while (!isValid);
        return var;
    }

    public String validarNacionalidad(String dato, String msj, String pat) {
        Scanner sc = new Scanner(System.in);
        boolean isValid = false;
        Pattern pattern = Pattern.compile(pat);
        String var = "";
        do {
            try {
                System.out.println(msj);
                var = sc.nextLine();
                Matcher matcher = pattern.matcher(var);
                if (matcher.matches()) {
                    var = getCodigoOSI(var);
                    if (var == null) {
                        System.out.println(dato + " No es correcta");
                    } else {
                        isValid = true;
                    }
                } else {
                    System.out.println(dato + " no utiliza un formato valido");
                }

            } catch (NullPointerException e) {
                System.out.println("No se puede ingresar el" + dato + "vacio");
            }
        } while (!isValid);
        return var;
    }

    public static String getCodigoOSI(String nombrePais) {
        for (Country pais : Country.values()) {
            if (pais.getName().equalsIgnoreCase(nombrePais)) {
                return pais.getThreeDigitsCode();
                // asi todos los jugadores tienen nacionalidad OSI (esp,fra,cro...)
            }
        }
        return null; //en caso de no encontrar devuelve null
    }


    public List<Jugador> obtenerJugadoresPorEquipo(int codEquipo) {
        return jugadorDAO.obtenerPorEquipo(codEquipo);
    }

}













