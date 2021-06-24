import java.util.Scanner;

public class op {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        int num1;
        int num2;
        
        System.out.print("Informe o primeiro número: ");
        num1 = entrada.nextInt();
        
        System.out.print("Informe o segundo número: ");
        num2 = entrada.nextInt();
        
        System.out.println();
        System.out.println("Adição: " + num1 + " + " + num2 + " = " + (num1 + num2) );
        System.out.println("Subtração: " + num1 + " - " + num2 + " = " + (num1 - num2) );
        System.out.println("Multiplicação: " + num1 + " * " + num2 + " = " + (num1 * num2) );
        System.out.println("Divisão: " + num1 + " / " + num2 + " = " + (num1 / num2) );
        
        
    }
}
