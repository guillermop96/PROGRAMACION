import java.util.Scanner;

public class PROGRAMACION1 {

    //EJERCICIO 8

    //Hágase una aplicación que permita realizar conversiones de temperaturas entre grados
    //centígrados, farenheit y kelvin (los resultados se muestran redondeados a dos decimales). (Temperaturas)

    //Grados centigrados: **15,70**
    //Farenheit: 60,26 Kelvin: 288,85
    //Grados Farenheit: **45,32**
    //Centigrados: 7,4 Kelvin: 280,55
    //Grados Kelvin: **345,23**
    //Centigrados: 72,08 Farenheit: 161,74

    public static void main (String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el numero de grados cº");
        double gradosC = lector.nextDouble();
        double gradosF = (9* gradosC) / 5.0 + 32;
        double gradosK = gradosC + 273.15;
        System.out.printf("Vas a pasar C = %2.f\n", gradosC);
        System.out.printf("Los grados en F son %.2f\n y en K son %2.f\n",gradosF,gradosK);
        System.out.println("Indica el numero de grados F");
        gradosF= lector.nextDouble();
        gradosC= (5*(gradosF-32))/9;
        gradosK=gradosC+273.15;
        System.out.printf("Vas a pasar %2.f F\n", gradosC);
        System.out.printf("Los grados en C son %.2f\n y en K son %2.f\n",gradosC,gradosK);
        System.out.println("Indica el numero de grados K");
        gradosK= lector.nextDouble();
        gradosF=9*(gradosF-273.13)/5 + 32;
        gradosC= gradosF-273.13;
        System.out.printf("Vas a pasar %2.f F\n", gradosC);
        System.out.printf("Los grados en C son %.2f\n y en F son %2.f\n",gradosC,gradosF);
        lector.close();

    }

    }
