package javaapplication14;

import java.util.Random;
import java.util.Scanner;
public class JavaApplication14 {

    public static void main(String[] args) {
        int i = 1;
        int Aprob = 0;
        int NoAprob = 0;
        int n;
        Random random = new Random();
        String[] materias = {"Programación", "Estructuras discretas", "Matematica", "Computación", "Computación y sociedad", "Humanismo"};
        String materia = materias[random.nextInt(materias.length)];
        System.out.println("Ingrese el número de estudiantes del curso");
        Scanner teclado = new Scanner(System.in);
        n = teclado.nextInt();
        while (i <= n) {
            String nombre;
            String cedula;
            String[] nombres = {"Juan", "Ana", "Carlos", "María", "Pedro", "Luisa", "Miguel", "Elena"};
            String[] apellidos = {"Gómez", "Fernández", "Martínez", "López", "Pérez", "Rodríguez", "Sánchez"};
            String nombreAleatorio = nombres[random.nextInt(nombres.length)];
            String apellidoAleatorio = apellidos[random.nextInt(apellidos.length)];
            nombre = nombreAleatorio + " " + apellidoAleatorio ;
            cedula = String.valueOf(new Random().nextInt(1000000000));
            double acd = (int)(Math.random()*10+1);
            double ape = (int)(Math.random()*10+1);
            double aa = (int)(Math.random()*10+1);

            double ACD = acd * 0.35;
            double APE = ape * 0.35;
            double AA = aa * 0.30;
            double porcentajeAcumulado = (ACD + APE + AA);
            // Verificar aprobación
            if (porcentajeAcumulado >= 7) {
                System.out.println("Estudiante :" + nombre);
                System.out.println("Con numero de cedula: " + cedula);
                System.out.println("Ha aprobado la materia: " + materia);
                Aprob ++;
            } else {
                System.out.println("Estudiante: " + nombre);
                System.out.println("Con numero de cedula: " + cedula);
                System.out.println("No ha aprobado la materia: " + materia);
                System.out.println(" Deberá rendir un examen de recuperación calficado sobre 3.5/10.");
                NoAprob ++;
            }
            i++;
        }
        System.out.println("ESTADISTICAS DEL CURSO");
        System.out.println("Estudiantes aprobados: " + Aprob);
        System.out.println("Estudiantes no aprobados: "+NoAprob);
    }
}
