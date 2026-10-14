import java.util.Scanner;

public class PROGRAMACION {

    //Ejercicio3
        //Hágase un programa que lea dos variables enteras y obtenga las siguientes operaciones:
        //a) Suma
        //b) Resta
        //c) Multiplicación
        //d) División entera
        //e) Resto
        //f) División real
        //g) Resto real
        //(Operaciones)

    public static void main (String[] args){
            Scanner lector = new Scanner(System.in);
            System.out.println("introduce el primer operando");
            int operando1 = lector.nextInt();
            System.out.println("introduce el segundo operando");
            int operando2 = lector.nextInt();
            lector.close();
            int suma = operando2+operando1;
            int resta = operando1-operando2;
            int mutiplicacion = operando2*operando1;
            int division = operando1/operando2;
            int modulo = operando1%operando2;// es el resto
            double divireal = (double)operando1/operando2;//division con decimales
            double moduloreal = (double)operando1%operando2;
            // se pone el double en uno de los operadores porque son 2 numeros enteros
            //printf no tiene salto de linea , por eso ponemos \n
            //sino seria System.out.println("la suma de "+operando1+" y "+operamdo2+" los valores es " + suma);
            // d - numeros enteros s- palabras  f- numero con decimales
            System.out.println("la suma de los valores es " + suma);
            System.out.printf("la resta de %d y %d es %d\n",operando1,operando2,resta);
            System.out.printf("la multiplicacion de %d y %d es %d\n",operando1,operando2,mutiplicacion);
            System.out.printf("la division de %d y %d es %d\n",operando1,operando2,division);
            System.out.printf("el modulo de %d y %d es %d\n",operando1,operando2,modulo);
            System.out.printf("la division real de %d y %d es %.2f\n",operando1,operando2,divireal);
            System.out.printf("el modulo real de %d y %d es %.2f\n",operando1,operando2,moduloreal);
            // %.2f - para que el resultado se vea con 2 decimales
    }
}
