import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Jugador {
    String nombre;
    String posicion;
    int edad;
    int goles;

    Jugador(String nombre, String posicion, int edad) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.goles = 0;
    }
}

public class SimPartido {
    public static void main(String[] args) {
        List<Jugador> equipoA = generarEquipo("A", 3);
        List<Jugador> equipoB = generarEquipo("B", 3);

        int golesEquipoA, golesEquipoB;
        golesEquipoA = simularPartido(equipoA);
        golesEquipoB = simularPartido(equipoB);

        mostrarEstadisticas(golesEquipoA, golesEquipoB);

        if (golesEquipoA == golesEquipoB) {
            System.out.println("Empate. Se simularán los penales.");
            // Aquí puedes simular la tanda de penales y actualizar los resultados
        } else {
            String equipoGanador = (golesEquipoA > golesEquipoB) ? "Equipo A" : "Equipo B";
            System.out.println("Equipo ganador: " + equipoGanador);
        }
    }

    private static List<Jugador> generarEquipo(String nombreEquipo, int numJugadores) {
        List<Jugador> equipo = new ArrayList<>();
        for (int i = 1; i <= numJugadores; i++) {
            Jugador jugador = new Jugador(nombreEquipo + i, "Posición" + i, 20 + i);
            equipo.add(jugador);
        }
        return equipo;
    }

    private static int simularPartido(List<Jugador> equipo) {
        int goles = 0;
        for (Jugador jugador : equipo) {
            int golesJugador = new Random().nextInt(4);
            jugador.goles = golesJugador;
            goles += golesJugador;
        }
        return goles;
    }

    private static void mostrarEstadisticas(int golesEquipoA, int golesEquipoB) {
        System.out.println("ESTADÍSTICAS DEL PARTIDO:");
        System.out.println("Goles Equipo A: " + golesEquipoA);
        System.out.println("Goles Equipo B: " + golesEquipoB);
    }
}

