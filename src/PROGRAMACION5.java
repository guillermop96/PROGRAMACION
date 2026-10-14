import java.util.Scanner;

public class PROGRAMACION5 {

    //EJERCICIO 7

    //Permítase introducir el valor del radio de una circuferencia con valores entre 0 y 100.
    // Obténgase la longitud de la circunferencia (2πr) y el área del circulo (πr2) .
    // (Circunferencia) NOTA El valor de PI se obtiene con Math.PI
    //
    //*ENTRADA/SALIDA*
    //
    //Escribe un radio entero: **15**
    //
    //Longitud de la circunferencia: 94.24777960769379
    //
    //Area de circulo: 706.8583470577034

    public static void main(String[] args){
        Scanner lector= new Scanner(System.in);
        System.out.println("Indica el radio de la circunferencia");
        double radio = lector.nextDouble();
        lector.close();
        double longitud= 2*Math.PI*radio;// 3,14 //(2πr)
        double area= Math.PI*Math.pow(radio,2); //radio al cuadrado  //(πr2)
        System.out.printf("la longitud de la circunferencia es = %.2f\n",longitud);
        System.out.printf("el area del circulo es = %.2f\n",area);
    }
}
