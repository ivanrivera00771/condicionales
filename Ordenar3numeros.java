package ordenar3numeros;

import java.util.Scanner;

public class Ordenar3numeros {

    public static void main(String[] args) {
        //PEDIR TRES NUMEROS Y MOSTRARLOS ORDENADOS DE MAYOR A MENOR.
        int numero1;
        int numero2;
        int numero3;

        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITA EL PRIMER NUMERO");
        numero1 = entrada.nextInt();
        System.out.println("DIGITA EL SEGUNDO NUMERO");
        numero2 = entrada.nextInt();
        System.out.println("DIGITA EL TERCER NUMERO");
        numero3 = entrada.nextInt();

        if ((numero1 > numero2) && (numero2 > numero3)) {
            System.out.println("El ORDEN ES :" + numero1 + "-" + numero2 + "-" + numero3);
        } else if ((numero1 > numero3) && (numero3 > numero2)) {
            System.out.println("EL ORDEN ES : " + numero1 + "-" + numero3 + "-" + numero2);
        } else if ((numero2 > numero1) && (numero1 > numero3)) {
            System.out.println("EL ORDEN ES : " + numero2 + "-" + numero1 + "-" + numero3);
        } else if ((numero2 > numero3) && (numero3 > numero1)) {
            System.out.println("EL ORDEN ES : " + numero2 + "-" + numero3 + "-" + numero1);
        } else if ((numero3 > numero1) && (numero1 > numero2)) {
            System.out.println("EL ORDEN ES : " + numero3 + "-" + numero1 + "-" + numero2);
        } else if ((numero3 > numero2) && (numero2 > numero1)) {
            System.out.println("EL ORDEN ES : " + numero3 + "-" + numero2 + "-" + numero1);
        }
    }

}
