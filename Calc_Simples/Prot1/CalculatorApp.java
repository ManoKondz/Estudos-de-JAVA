import java.util.InputMismatchException;
import java.util.Scanner;
public class CalculatorApp{
    public static void main(String[] args){
        Scanner tlcd = new Scanner(System.in);
        while (true){
            int opc = 0;
            System.out.println("[1] -> Adição");
            System.out.println("[2] -> Subtração");
            System.out.println("[3] -> Multiplicação");
            System.out.println("[4] -> Divisão");
            System.out.println("[0] -> Sair");
            opc = tlcd.nextInt();
            int num1 = 0;
            int num2 = 0;
            int res = 0;
            switch(opc){
                case 1:
                    // Script para adição
                    System.out.println("Qual o primeiro número?");
                    try {
                    num1 = tlcd.nextInt(); // Captura a entrada
                    } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número válido.");
                    tlcd.next(); // Limpa o buffer de entrada
                    continue;    // Volta para o início do loop 
                    }
                    System.out.println("Qual o segundo número?");
                    try {
                    num2 = tlcd.nextInt(); // Captura a entrada
                    } catch (InputMismatchException r) {
                    System.out.println("Entrada inválida. Por favor, insira um número válido.");
                    tlcd.next(); // Limpa o buffer de entrada
                    continue;    // Volta para o início do loop 
                    }
                    res = num1 + num2;
                    System.out.printf("%n%d + %d = %d%n", num1, num2, res);
                    break;
                case 2:
                    // Script para subtração
                    System.out.println("Qual o primeiro número?");
                    try {
                    num1 = tlcd.nextInt(); // Captura a entrada
                    } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número válido.");
                    tlcd.next(); // Limpa o buffer de entrada
                    continue;    // Volta para o início do loop
                    }  
                    System.out.println("Qual o segundo número?");
                    try {
                    num2 = tlcd.nextInt(); // Captura a entrada
                    } catch (InputMismatchException r) {
                    System.out.println("Entrada inválida. Por favor, insira um número válido.");
                    tlcd.next(); // Limpa o buffer de entrada
                    continue;    // Volta para o início do loop
                    }
                    res = num1 - num2;
                    System.out.printf("%n%d - %d = %d%n", num1, num2, res);
                    break;
                case 3:
                    // Script para multiplicação
                    System.out.println("Qual o primeiro número?");
                    try {
                    num1 = tlcd.nextInt(); // Captura a entrada
                    } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número válido.");
                    tlcd.next(); // Limpa o buffer de entrada
                    continue;    // Volta para o início do loop 
                    }
                    System.out.println("Qual o segundo número?");
                    try {
                    num2 = tlcd.nextInt(); // Captura a entrada
                    } catch (InputMismatchException r) {
                    System.out.println("Entrada inválida. Por favor, insira um número válido.");
                    tlcd.next(); // Limpa o buffer de entrada
                    continue;    // Volta para o início do loop
                    }
                    res = num1 * num2;
                    System.out.printf("%n%d x %d = %d%n", num1, num2, res);
                    break;
                case 4:
                    // Script para divisão
                    System.out.println("Qual o primeiro número?");
                    try {
                    num1 = tlcd.nextInt(); // Captura a entrada
                    } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número válido.");
                    tlcd.next(); // Limpa o buffer de entrada
                    continue;    // Volta para o início do loop  
                    }
                    System.out.println("Qual o segundo número?");
                    try {
                    num2 = tlcd.nextInt(); // Captura a entrada
                    } catch (InputMismatchException r) {
                    System.out.println("Entrada inválida. Por favor, insira um número válido.");
                    tlcd.next(); // Limpa o buffer de entrada
                    continue;    // Volta para o início do loop
                    }
                    if(num2 == 0){
                        System.out.println("Não é possível dividir por 0");
                        continue;
                    }
                    res = num1 / num2;
                    System.out.printf("%n%d \u00F7 %d = %d%n", num1, num2, res);
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    return; // Sai do loop e encerra o programa
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        }
    
    }
}