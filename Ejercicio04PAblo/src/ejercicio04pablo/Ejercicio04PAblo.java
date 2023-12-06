
package ejercicio04pablo;
import java.util.Scanner;
public class Ejercicio04PAblo {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int numSecreto = (int) (Math.random() * 100) + 1;
        int intentos = 9;
        int intentos2 = 1, numEntregado, pista1;
        boolean si = false, si1 = true;
        String pista3 = null; 
        String opcion = null;
        System.out.println("Adivina el numero");
        do{
                while (intentos >= 0){
                System.out.println("Ingresa un numero");
                numEntregado = tc.nextInt();
                if (numEntregado == numSecreto){
                    si = true;
                    break; 
                } else if (intentos == 0)
                    break; 
                System.out.println("Incorrecto, quieres pistas? (si/no)");
                pista3 = tc.next();
                if (pista3.equals("si")){
                    intentos--;
                    System.out.println("Selecciona la pista que quieres ver:");
                    System.out.println("[1] pista si el numero es mayor o menor");
                    System.out.println("[2] pista si el numero es par o impar");
                    System.out.println("[3] pista si el numero es o no primo");
                    System.out.println("[4] pista si el numero pertenece a la serie de fibonacci");
                    System.out.println("[5] pista si el numero es multiplo de n");
                    pista1 = tc.nextInt();
                
                    switch(pista1){
                        case 1:
                            if ((numSecreto < numEntregado) && (pista3.equals("si" ))){
                                System.out.println("EL NUMERO ES MENOR");
                            } else if ((numSecreto > numEntregado) && (pista3.equals("si"))){
                                System.out.println("EL NUMERO ES MAYOR");
                            }
                            break;
                        case 2:
                            if ((numSecreto % 2 == 0) && (pista3.equals("si")))
                                System.out.println("EL NUMERO ES PAR");
                            else if ((numSecreto % 2 != 0) && (pista3.equals("si")))
                                System.out.println("EL NUMERO ES IMPAR");
                            break;
                            case 3:
                                if (numSecreto == 1)            
                                si1 = false;
                            for (int i = 2; i < numSecreto; i++) {
                            if ((numSecreto % i) == 0)
                                si1 = false;
                            }
                            if (si1 && (pista3.equals("si")))
                                System.out.println("EL NUMERO ES PRIMO");
                            else if ((si1 == false) && (pista3.equals("si")))
                                System.out.println("EL NUMERO NO ES PRIMO");
                            break;
                        case 4:
                            if ((esNumeroFibonacci(numEntregado)) && (pista3.equals("si"))) //Se invoca la funcion al final de codigo
                                System.out.println("EL NUMERO PERTENECE A LA SERIE DE FIBONACCI");
                            else if ((esNumeroFibonacci(numEntregado) == false) && (pista3.equals("si"))) 
                                System.out.println("EL NUMERO NO PERTENECE A LA SERIE DE FIBONACCI");
                            break;
                        case 5:
                            if (numEntregado % 3 == 0 && pista3.equals("si"))
                                System.out.println("MULTIPLO DE 3"); 
                            else if ((numEntregado % 5 == 0) && (pista3.equals("si")))
                                System.out.println("MULTIPLO DE 5");
                            else if ((numEntregado % 7 == 0) && (pista3.equals("si")))
                                System.out.println("MULTIPLO DE 7");
                            break;
                        default:
                            System.out.println("Opcion incorrecta!");
                    }
                }
                
                System.out.println("Te quedan: " + intentos + " intentos");
                intentos--;
                intentos2++;
            }
            if (si)
                System.out.println("Numero correcto lo lograste en " + intentos2 + " intentos");
            else{
                System.out.println("perdiste");
                System.out.println("EL NUMERO ERA " + numSecreto);
            }
            System.out.println("Quieres volver a jugar? (si/no)");
            opcion = tc.next();
        } while (opcion.equals("si"));
        System.out.println("Nos vemos");
    }
    public static boolean esNumeroFibonacci(int var) {
        if (var < 0) {
            return false;
        }
        int num1 = 0;
        int num2 = 1;
        while (num1 < var) {
            int num3 = num1;
            num1 = num2;
            num2 = num3 + num2;
        }
        return num1 == var;
    }
}
        // TODO code application logic here
    
    

