import java.util.Scanner;

public class PROGRAMACION7 {
    //EJERCICIO 10
    //Se introducen los 5 dígitos de un número (decenas de mil, unidades de mil, centenas, decenas y unidades), y se obtiene el número correspondiente. (Numero)
    //*ENTRADA/SALIDA*
    //Decenas de mil: **7**
    //Unidades de mil: **9**
    //Centenas: **0**
    //Decenas: **5**
    //Unidades: **0**
    //Numero introducido: 79050
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica dmillar");
        int dmillar= lector.nextInt();
        System.out.println("Indica undmillar");
        int undmillar=lector.nextInt();
        System.out.println("Indica centenas");
        int centenas=lector.nextInt();
        System.out.println("Indica decenas");
        int decenas=lector.nextInt();
        System.out.println("Indica unidades");
        int unidades=lector.nextInt();
        lector.close();
        System.out.println("numero introducido es : "+ dmillar+undmillar+centenas+decenas+unidades);
        System.out.println( dmillar+undmillar+centenas+decenas+unidades);
        System.out.println("numero introducido es : "+ (dmillar+undmillar+centenas+decenas+unidades));

    }

}
