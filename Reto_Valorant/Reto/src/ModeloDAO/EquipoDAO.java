package ModeloDAO;

import Modelo.Equipo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EquipoDAO {

    private List<Equipo> listaEquipos;

    public EquipoDAO() {
        this.listaEquipos = new ArrayList<>();
    }

    // Crear un equipo

    public void crearEquipo(Equipo equipo) {
        if (equipo != null) {
            listaEquipos.add(equipo);
            System.out.println("Equipo agregado exitosamente.");
        } else {
            System.out.println("Error: El equipo no puede ser nulo.");
        }
    }

    // Obtener todos los equipos del ArrayList

    public List<Equipo> obtenerTodosLosEquipos() {
        return new ArrayList<>(listaEquipos);
    }

    // Obtener equipo por codigo

    public Equipo obtenerEquipoPorCodigo(String codEquipo) {
        return listaEquipos.stream()
                .filter(equipo -> equipo.getCodEquipo().equalsIgnoreCase(codEquipo))
                .findFirst()
                .orElse(null);
    }

    // Actualizar o modificar un equipo

    public boolean actualizarEquipo(Equipo equipo) {
        for (int i = 0; i < listaEquipos.size(); i++) {
            if (listaEquipos.get(i).getCodEquipo().equalsIgnoreCase(equipo.getCodEquipo())) {
                listaEquipos.set(i, equipo);
                System.out.println("Equipo actualizado correctamente.");
                return true;
            }
        }
        System.out.println("Error: Equipo no encontrado.");
        return false;
    }

    // Eliminar un equipo

    public boolean eliminarEquipo(String codEquipo) {
        boolean removed = listaEquipos.removeIf(equipo -> equipo.getCodEquipo().equalsIgnoreCase(codEquipo));
        if (removed) {
            System.out.println("Equipo eliminado correctamente.");
        } else {
            System.out.println("Error: Equipo no encontrado.");
        }
        return removed;
    }
}
