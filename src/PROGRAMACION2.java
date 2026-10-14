import java.util.Scanner;

public class PROGRAMACION2 {

    //EJERCICIO 4
    //Unos amigos entra en un bar que ofrece las bebidas a 1,25€ y los bocadillos a 2,05€.
    // El camarero les pregunta cuántas bebidas y bocadillos quieren.
    // Calcula el coste de la consumición, mostrando primero el coste de las bebidas y de los bocadillos. (Bar)

    //ENTRADA/SALIDA
    //Número de bebidas: 3
    //Número de bocadillos: 5
    //Coste de las bebidas: 3.75
    //Coste de los bocadillos: 10.25
    //Coste consumición: 14.0

    public static void main(String[] args){
        Scanner lector = new Scanner(System.in); //inicio de entrada valores en la consola
        final double preciobocata = 2.05; // final double - para valores fijos
        final double preciobebida = 1.25;
        System.out.println("¿cuantas bebidas quieres?");
        int numerobebidas = lector.nextInt(); // entrada de valores
        System.out.println("¿cuantas bocatas quieres?");
        int numerobocatas = lector.nextInt();
        lector.close(); // cierre de entrada valores en la consola
        double costebebidas = numerobebidas*preciobebida; //calculo de numero y precio por unidad
        double costebocatas = numerobocatas*preciobocata;
        double costetotal = costebebidas+costebocatas;
        System.out.println("el coste total de las bebidas es= "+costebebidas);
        System.out.println("el coste total de los bocatas es= "+costebocatas);
        System.out.println("el coste total es de= "+costetotal);
    }

}
