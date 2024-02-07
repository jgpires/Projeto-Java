import java.util.Scanner;

public class Questao_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o segundo número para somar: ");
        int segundoNumero = scanner.nextInt();

        int resultado = soma(10, segundoNumero);

        System.out.println("O primeiro número é 10");
        System.out.println("O segundo número é " + segundoNumero);
        System.out.println("A soma dos dois números é: " + resultado);

        scanner.close();
    }

    public static int soma(int primeiroNumero, int segundoNumero) {
        int soma = primeiroNumero + segundoNumero;
        return soma;
    }
}


