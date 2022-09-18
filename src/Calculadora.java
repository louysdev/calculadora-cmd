import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String datos = "";
        String opc = "";
        int num1, num2;

        System.out.println("\n Calculadora: \n");
        System.out.println("Comandos:");
        System.out.println("+ : Para sumar");
        System.out.println("- : Para restar");
        System.out.println("* : Para multipliicar");
        System.out.println("/ : Para dividir \n");

        System.out.print("Ingrese aqui: \n");
        num1 = entrada.nextInt();
        System.out.println("");
        num2 = entrada.nextInt();
        opc = entrada.next();

        switch (opc){
            case "+":
                System.out.println("Suma");
                break;
        }

    }
}