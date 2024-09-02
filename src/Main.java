import java.util.Scanner;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nx------------------------------------------------x");
        System.out.println("|\033[40m--             Olá, eu sou o T1000            --\033[m|");
        System.out.println("--------------------------------------------------");
        System.out.println("| >Vim do futuro e vou te ajudar com...Cálculos! |");
        System.out.println("--------------------------------------------------");
        System.out.println("| >Posso te ajudar ?                             |");
        System.out.println("--------------------------------------------------");
        System.out.println("| \033[32m1 - Sim, Vamos nessa!\033[m                          |\n" +
                "| \033[31m2 - Não, cara!\033[m                                 |");
        System.out.print("| \033[40m> Sua Resposta: \033[m");
        int respA = teclado.nextInt();
        System.out.println("\nx------------------------------------------------x");

        teclado.nextLine(); // Consumir a nova linha deixada pelo nextInt()

        if (respA == 1) {
            System.out.println("Vamos lá então..." +
                    "\nDigite o símbolo da operação desejada:");
            System.out.println("x------------------------------------------------x");
            System.out.println("|\033[044m-                     MENU                     -\033[m|");
            System.out.println("--------------------------------------------------");
            System.out.println("| [+] -> SOMA\n" +
                    "| [-] -> SUBTRAÇÃO\n" +
                    "| [*] -> MULTIPLICAÇÃO\n" +
                    "| [/] -> DIVISÃO\n" +
                    "| [%] -> DIVISÃO MODULAR\n" +
                    "| [&] -> EXPONENCIAÇÃO\n" +
                    "| [$] -> RAIZ QUADRADA\n" +
                    "| [@] -> SENO + COSENO");
            System.out.print("| \033[40m> Sua Resposta: \033[m");
            char respB = teclado.nextLine().charAt(0);

            // Entrada de valores do usuário
            System.out.println("|________________________________________________|");
            System.out.println("|\033[44m>         Agora os valores da operação         <\033[m|");

            if (respB == '@' || respB == '$') {
                System.out.printf("| \033[40m> Digite o valor: \033[m");
                double n1 = teclado.nextDouble();
                System.out.println("x------------------------------------------------x");
                System.out.println("|\033[042m-                   resultado                 -\033[m|");
                System.out.println("|                                                |\n");

                switch (respB) {
                    case '@':
                        System.out.println("|\033[42m ->Resultado Seno:  " + (Math.sin(n1)) + "\033[m");
                        System.out.println("|\033[42m ->Resultado Cosseno:  " + (Math.cos(n1)) + "\033[m");
                        break;
                    case '$':
                        System.out.println("|\033[42m ->Resultado da Raiz:  " + (Math.sqrt(n1)) + "\033[m");
                        break;
                    default:
                        System.out.println("| \033[31m->Erro...Operação inválida.\033[m");
                        break;
                }
                System.out.println("x------------------------------------------------x");
            } else {
                System.out.printf("| \033[40m> Primeiro valor: \033[m");
                int n1 = teclado.nextInt();
                System.out.printf("\n| \033[40m> Segundo valor: \033[m");
                int n2 = teclado.nextInt();

                // Retorno dos resultados da operação com switch
                System.out.println("x------------------------------------------------x");
                System.out.println("|\033[042m-                   resultado                 -\033[m|");
                System.out.println("|                                                |\n");

                switch (respB) {
                    case '+':
                        System.out.println("|\033[42m ->Resultado da soma:  " + (n1 + n2) + "\033[m");
                        break;
                    case '-':
                        System.out.println("|\033[42m ->Resultado da subtração:  " + (n1 - n2) + "\033[m");
                        break;
                    case '*':
                        System.out.println("|\033[42m ->Resultado da Multiplicação:  " + (n1 * n2) + "\033[m");
                        break;
                    case '/':
                        if (n2 != 0) {
                            System.out.println("|\033[42m ->Resultado da divisão:  " + (n1 / (double)n2) + "\033[m");
                        } else {
                            System.out.println("\033[31mErro!...\nValor do divisor precisa ser diferente de 0!\033[m");
                        }
                        break;
                    case '%':
                        System.out.println("|\033[42m ->Resultado da Divisão Modular1:  " + (n1 % n2) + "\033[m");
                        break;
                    case '&':
                        System.out.println("|\033[42m ->Resultado da Exponenciação:  " + (Math.pow(n1, n2)) + "\033[m");
                        break;
                    default:
                        System.out.println("| \033[31m->Erro...Operação inválida.\033[m");
                        break;
                }
                System.out.println("x------------------------------------------------x");
            }
            System.out.println("\033[31m| >Encerrando o programa...                      |");
        } else {
            System.out.println("\033[41m| >I'll be back.                                 |\033[m");
        }
        teclado.close();
    }
}
