/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jugador;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Partido {

    public int generarEdad() {
        int num = (int) (Math.random() * 100);
        if (num < 29 && num > 27) {
            return num;
        } else {
            while (!(num <= 29 && num >= 27)) {
                num = (int) (Math.random() * 100);
            }

            return num;
        }
    }

    public int generarGoles() {

        Random random = new Random();

        int numeroGoles = random.nextInt(3);
        return numeroGoles;
    }

    public void simularPenales() {

        Random random = new Random();
        int penalesGlobales = 0;
        int penalesGlobales2 = 0;
        System.out.println("\nTANDA DE PENALES");
        for (int i = 1; i <= 5; i++) {
            int penalesLocal = random.nextInt(2);
            int penalesVisitante = random.nextInt(2);
            System.out.println("Patea A penal " + i);
            if (penalesLocal == 1) {
                System.out.println("GOL");
            } else {
                System.out.println("FALLO");
            }
            System.out.println("Patea B penal " + i);
            if (penalesVisitante == 1) {
                System.out.println("GOL");
            } else {
                System.out.println("FALLO");
            }
            penalesGlobales += penalesLocal;
            penalesGlobales2 += penalesVisitante;
        }
        if (penalesGlobales > penalesGlobales2) {
            System.out.println("Gana equipo A en penales");
        } else {
            System.out.println("Gana equipo B en penales");
        }
    }

    public int generarJugadores(String paralelo1) {

        int golesTotales = 0;
        int goles_Jugador = 0;
        System.out.println("\nEQUIPO " + paralelo1 + "\n");
        System.out.println("NOMBRE" + "\t   |\tPOSICION" + "    |\tEDAD" + " |\tGOLES");
        int nro_Jugadores = 11;
        for (int i = 1; i <= nro_Jugadores; i++) {
            goles_Jugador = generarGoles();
            System.out.println("Jugador " + paralelo1 + i + "\tPosicion " + i + "\t" + generarEdad() + "\t" + goles_Jugador);
            golesTotales += goles_Jugador;
        }
        return golesTotales;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Partido partido = new Partido();
        int equipoLocal = partido.generarJugadores("A");
        int equipoVisitante = partido.generarJugadores("B");
        System.out.println("\nESTADISTICA DE PARTIDO");
        System.out.println("Goles de equipo A = " + equipoLocal);
        System.out.println("Goles de equipo B = " + equipoVisitante);
        if (equipoLocal > equipoVisitante) {

            System.out.println("El equipo ganador es el A");
        } else {
            if (equipoLocal == equipoVisitante) {
                partido.simularPenales();
            } else {
                System.out.println("El equipo ganador es el B");
            }

        }
    }

}
