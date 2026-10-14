public class INICIO {

    public static void main(String[] args) {
            //Ejercicio 1
            String nombre = "Ana";
            int edad = 25;
            String ciudad = "Madrid";
            System.out.println(nombre + edad + ciudad);


            System.out.println(nombre);
            System.out.println(edad);
            System.out.println(ciudad);
            //Ejercicio 2

            int x = 0;
            System.out.println(x);
            System.out.println(x+5);
            System.out.println(x+10);
            System.out.println(x+15);

            int y = 0;
            System.out.println(y);
            y=5;
            System.out.println(y);
            y=10;
            System.out.println(y);
            y=15;
            System.out.println(y);
            //Ejercicio 3

            String Name = "Carlos";
            System.out.println("Nombre : "+ Name);
            int age = 30;
            System.out.println("Edad : "+ age);
            boolean esestudiante =( age==30 );
            System.out.println("¿Es estudiante? : " + esestudiante);
            double altura = 1.75f;
            System.out.println("Altura : " + altura);
            char inicial = 'C';
            System.out.println("Inicial : " + inicial);
            //Ejercicio 4

            String titulo = "Don Quijote de la Mancha";
            String autor = "Miguel de Cervantes";
            int año = 1605;
            int paginas = 863;
            boolean disponible = (titulo == "Don Quijote de la Mancha");
            System.out.println("Titulo : " + titulo);
            System.out.println("Autor : " + autor);
            System.out.println("Año de publicación : " + año);
            System.out.println("Numero de paginas : " + paginas);
            System.out.println("¿Disponible en la biblioteca? : " + disponible);
            //Ejercicio 5

            final String aplicacion = "MiApp";
            String version = "1.0.0";
            final double valor = 3.14159;
            String name = "Laura";
            int nivel = 1;
            int puntuacion = 0;
            System.out.println("Aplicacion : " + aplicacion);
            System.out.println("Version : " + version);
            System.out.println("Valor de PI : " + valor);
            System.out.println("Usuario actual : " + name);
            System.out.println("Nivel : " + nivel);
            System.out.println("Puntuacion : " + puntuacion);
            name= "Miguel";
            nivel= 2;
            puntuacion=150;
            System.out.println("Usuario actualizado : " + name);
            System.out.println("Nivel actualizado : " + nivel);
            System.out.println("Puntuacion actualizado: " + puntuacion);


    }
}
