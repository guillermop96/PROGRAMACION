import java.util.Scanner;

public class PROGRAMACION6 {

    //EJERCICIO 9
    //Hágase una aplicación que permita introducir el número de bebidas y bocadillos comprados (valores entre 0 y 20).
    // Además se podrá introducir el precio de cada bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo (valor entre 0.00 € y 5.00 €).
    // También se podrá introducir el número de alumnos que realizaron la compra (valor entre 0 y 10).
    // Se mostrará el total de la compra (con el subtotal de las bebidas y de los bocadillos)
    // y la cantidad que debe pagar cada alumno redondeada a 2 decimales. (CosteBar)
    //Número de bebidas (entre 0 y 20): **3**
    //
    //Número de bocadillos (entre 0 y 20): **5**
    //
    //Precio de cada bebida (entre 0,00 y 3,00): **1,20**
    //
    //Precio de cada bocadillo (entre 0,00 y 3,00): **2,05**
    //
    //Número de alumnos (entre 1 y 10): **5**

      public static void main (String[] args){
          Scanner lector = new Scanner(System.in);
          System.out.println("¿Nº bocatas?");
          int Nºbocatas= lector.nextInt();
          System.out.println("¿Precio del bocata?");
          double preciobocata= lector.nextDouble();
          System.out.println("¿Nº bebidas?");
          int Nºbebidas= lector.nextInt();
          System.out.println("¿Precio de la bebida?");
          double preciobebida= lector.nextDouble();
          System.out.println("¿Cuantas personas sois?");
          int personas= lector.nextInt();
          lector.close();
          double preciobocatastotal= preciobocata*Nºbocatas;
          double preciobebidastotal= preciobebida*Nºbebidas;
          double totalcompra= preciobebidastotal+preciobocatastotal;
          double precioindividual= totalcompra/personas;
          System.out.println("ARTICULO\t\t\tCANTIDAD\t\tCOSTE\t\t\t\tTOTAL");// (\t)para imprimirlo de forma horizontal
          System.out.printf("%s\t\t\t\t%d\t\t\t\t%.2f\t\t\t\t\t%.2f\n", "bebidas" ,Nºbebidas,preciobebida,preciobebidastotal);
          // %s para nombres %d numeros %.2f decimal
          System.out.printf("%s\t\t\t\t%d\t\t\t\t%.2f\t\t\t\t\t%.2f\n", "bocatas" ,Nºbocatas,preciobocata,preciobocatastotal);
          System.out.printf("%s\t\t\t\t%d\t\t\t\t%.2f\t\t\t\t\t%.2f\n", "compra" ,Nºbocatas+Nºbebidas, 0.0, totalcompra);
      }
}
