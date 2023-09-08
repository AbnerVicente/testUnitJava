import java.util.ArrayList;
import java.util.List;
import  java.util.Scanner;
import  org.junit.Test;
import static org.junit.Assert.*;
public class main {


    public static void main(String[] args) {
        menu();

    }

    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t BIENVENIDO A UN TES DE PRUEBAS UNITARIAS! \n");
        System.out.println("\t 1 Test de igualdad entre objetos " );
        System.out.println("\t 2 Test de Suma basica " );
        System.out.println("\t 3 Test de validacion de variables " );
        System.out.println("\t 4 Salir del Programa " );

        System.out.println("Elija una opción (1-4):");
        int opcion = scanner.nextInt();


        switch (opcion) {
            case 1:
                System.out.println("\t\t Test de igualdad entre objetos");

                igualdatObjetosTest("Abner", "Abner");

                break;
            case 2:
                System.out.println("\t\t Test de Suma basica");
                sumaTest(5,6);
                break;
            case 3:
                System.out.println("\t\t  Test de guardar en listas");
                guardarRegistroTest();
                break;
            case 4:
                System.out.println("\t\t  Saliendo del Programa");

                break;
            default:
                System.out.println("Opción no válida");
        }



    }

    @Test
    public static  void igualdatObjetosTest(String palabra1, String palabra2) {
        assertEquals(palabra1, palabra2);
        System.out.println("\t\t *** TEST COMPLETADO CON EXITO ***\n");
        menu();
    }

    @Test
    public static void sumaTest(int numer1, int numero2){
        int resultado = sumar(5,15);
        assertEquals(20, resultado);
        System.out.println("*** TEST COMPLETADO CON EXITO   -> la suma es correcta "+ resultado + " *** \n");
        menu();
    }
    public static int sumar(int numero1, int numero2){
         return  numero1 + numero2;
    }

    @Test
    public static void guardarRegistroTest(){
        List<String> listaPersona = new ArrayList<>();
        assertTrue(listaPersona.isEmpty());
        System.out.println("\t\t *** Validacion correcta de la variable lista *** ");

        // Crear registros y agregarlos a la lista
        listaPersona.add("Registro 1");


        System.out.println("\t\t *** Registro insertado con exito *** ");
        menu();
    }
}






