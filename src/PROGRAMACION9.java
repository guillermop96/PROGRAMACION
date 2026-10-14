import java.util.Scanner;

public class PROGRAMACION9 {
    //EJERCICIO12
    //Hágase una aplicación que lea dos cadenas y las compare del siguiente modo:
    //a) Son iguales
    //b) La primera es menor que la segunda *
    //c) Son distintas
    //(CompararCadenas)
    //Escribe una palabra: **hola**
    //Escribe una palabra: **adios**
    //Son iguales: false
    //La primera es menor que la segunda: false
    //Son distintas: true
    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);
        System.out.println("Indica una palabra ... ");
        String palabra= lector.nextLine();
        System.out.println("Indica una palabra ... ");
        String segundapalabra= lector.nextLine();
        boolean comparariguales= palabra.equals(segundapalabra);//.equals() - comparar su similitud
        boolean compararlongitud=palabra.length()<segundapalabra.length();// .lenght() - comparar numero de caracteres
        System.out.println("¿Son iguales?"+comparariguales);
        System.out.println("¿La primera es menor que la segunda?"+compararlongitud);
        System.out.println("¿Son distintas?"+!comparariguales); // la exclamacion la niega
        lector.close();

    }
}
