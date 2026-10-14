import java.util.Scanner;

public class PROGRAMACION3 {

    //EJERCICIO 5
    // Hágase un programa que convierta segundos en horas, minutos y segundos.(Segundos)
    //*ENTRADA/SALIDA*
    //Número de segundos: **24973**
    //Horas: 6
    //Minutos: 56
    //Segundos: 13

    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("¿que cantidad de segundos quieres pasar a h:min:seg? ");
        int numerosegundos = lector.nextInt();
        lector.close();
        //1h -3600 seg
        //1h - 60 min
        //1min - 60 seg
        int horas = numerosegundos/3600;
        int segundosrestantes = numerosegundos%3600;// %3600 - seria el resto de dividir
        System.out.println("horas = "+ horas);
        int minutos = segundosrestantes/60;
        System.out.println("minutos = "+ minutos);
        int segundos = segundosrestantes%60;
        System.out.println("segundos = "+ segundos);

    }
}
