package calcularidadeemjava;

import java.util.Scanner;

public class CalculadoraIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int anoAtual = input.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = input.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.println("A idade é: " + idade + " anos.");

        input.close();
    }
}
