import java.util.Scanner;

public class PROGRAMACION4 {

    //EJERCICIO 6

    //Permítase introducir el valor con IVA de una compra con dos decimales
    // (la compra no puede ser superior a 500€ ni inferior a 0€)
    // el valor del IVA de dicha compra (valor entero entre 0 y 25%).
    // ¿Cuánto costó la compra sin IVA?
    // ¿Cuánto fue el IVA?
    // Muéstrese los resultados redondeados a dos decimales. (Compra)
    //*ENTRADA/SALIDA*
    //Valor de la compra (entre 0.00 y 500.00):**298,45**
    //IVA (entre 0 y 25%):**12**
    //Compra: 266.47
    //IVA: 31.98
    //298.45
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("¿cual es el valor de la compra?");
        double valorcompra= lector.nextDouble();
        System.out.println("¿que iva le aplicamos a la compra?");
        int iva = lector.nextInt();
        lector.close();
        double valoriva= valorcompra*iva/100;
        //otra opcion es : double iva = (float)lector.nextint()/100; - 0,25
        double compratotal= valorcompra-valoriva;
        System.out.printf("el valor total de la compra es %.1f\n",valorcompra);
        System.out.printf("el valor total sin iva de la compra es = %.1f\n",compratotal);
        System.out.printf("el total del iva es = %.1f\n ",valoriva);

    }

}
