import java.util.Scanner;

public class PROGRAMACION8 {
    //EJERCICIO 11
    //Hágase una aplicación que lea un entero entre 0 y 100. Compruébese (mostrándose verdadero o falso) las siguientes condiciones:
    //a) Es par
    //b) Es mayor que 50
    //(CompararEntero)
    //*ENTRADA/SALIDA*
    //Escribe un entero entre 0 y 100: **55**
    //Par: false
    //Mayor que 50: true
    public static void main (String[] args){
        Scanner lector= new Scanner(System.in);
        System.out.println("Indica el numero a evaluar ... ");
        int numero= lector.nextInt();
        lector.close();
        boolean par= numero%2==0;
        boolean esmayor= numero>50;
        System.out.println("Es par : "+ par);
        System.out.println("¿Es mayor que 50? : "+ esmayor);

    }

}
