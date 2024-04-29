// Desafio  Instruções de controle - Gabriel Gomes Barbosa 

// Parte 01 letra A //////////////////////////////////////////////

// import java.util.Scanner;

// public class CelsiusParaFahrenheit {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Digite a temperatura em Celsius: ");
//         double celsius = scanner.nextDouble();
        
//         double fahrenheit = (celsius * 9 / 5) + 32;
        
//         System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
//     }
// }

// Parte 01 letra B //////////////////////////////////////////////

// public class Fatorial { 
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Digite um número inteiro positivo: ");
//         int numero = scanner.nextInt();
        
//         long fatorial = 1;
//         for (int i = 1; i <= numero; i++) {
//             fatorial *= i;
//         }
        
//         System.out.println("O fatorial de " + numero + " é: " + fatorial);
//     }
// }

// Parte 01 letra C //////////////////////////////////////////////

// import java.util.Scanner;

// public class MaximoEntreDoisNumeros {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Digite o primeiro número: ");
//         double numero1 = scanner.nextDouble();
//         System.out.print("Digite o segundo número: ");
//         double numero2 = scanner.nextDouble();
        
//         double maximo = Math.max(numero1, numero2);
        
//         System.out.println("O máximo entre " + numero1 + " e " + numero2 + " é: " + maximo);
//     }
// }


// Parte 2 //////////////////////////////////////////////

// A. System.out.println(i == 1);
// Isso imprimirá true se i for igual a 1, e false caso contrário. Como i é igual a 1, a saída será true.

// B. System.out.println(j == 3);
// Isso imprimirá true se j for igual a 3, e false caso contrário. Como j é igual a 2, a saída será false.

// C. System.out.println((i >= 1) && (j < 4));
// Isso imprimirá true se i for maior ou igual a 1 e j for menor que 4, e false caso contrário. Como i é igual a 1 (maior ou igual a 1) e j é igual a 2 (menor que 4), ambas as condições são verdadeiras, então a saída será true.

// D. System.out.println((m <= 99) & (k < m));
// Aqui, a expressão dentro do println usa o operador &, que é o AND bitwise. Isso significa que ambas as expressões dentro dos parênteses serão avaliadas, independentemente do resultado da primeira.
// Como m é igual a 2 e k é igual a 3, (m <= 99) é verdadeiro e (k < m) é falso. O resultado do AND bitwise entre true e false é false. Portanto, a saída será false.

// E. System.out.println((j >= i) || (k == m));
// Isso imprimirá true se j for maior ou igual a i ou se k for igual a m, e false caso contrário. Como j é igual a 2 (maior ou igual a i, que é 1), uma das condições é verdadeira, então a saída será true.

// F. System.out.println((k + m < j) | (3 - j >= k));
// Aqui, a expressão dentro do println usa o operador |, que é o OR bitwise. Isso significa que ambas as expressões dentro dos parênteses serão avaliadas, independentemente do resultado da primeira.
// (k + m < j) é false (pois k + m é 5 e j é 2, então 5 não é menor que 2) e (3 - j >= k) é true (pois 3 - j é 1 e 1 é maior ou igual a k, que é 3).
// O resultado do OR bitwise entre false e true é true. Portanto, a saída será true.

// G. System.out.println(!(k > m));
// Isso imprimirá true se k não for maior que m, e false caso contrário. Como k é igual a 3 e m é igual a 2, k é maior que m, então a negação de true é false. Portanto, a saída será false.


// Parte 3 //////////////////////////////////////////////

// "public class Printing 
// { 
//     public static void main(String[] args)
// {
    
//         for (int i = 1; i <= 10; i++)
//         {
//             for (int j = 1; j <= 5; j++){
//                 System.out.print('@');
//                 System.out.println();
//             }
            
//         }
// } 

// fim da classe Printing"

// Este programa em Java imprime o caractere @ 50 vezes em uma grade de 10 linhas e 5 colunas, há um problema com as chaves de fechamento no código fornecido

// A instrução System.out.println() dentro do loop interno deveria estar fora do loop interno para imprimir todos os caracteres @ na mesma linha antes de avançar para a próxima linha. Portanto, ela deve ser movida para fora do loop interno


// Parte 4 //////////////////////////////////////////////

// public class Figuras {
//     public static void main(String[] args) {
//         System.out.println("Figura A:");
//         for (int linha = 1; linha <= 5; linha++) {
//             for (int coluna = 1; coluna <= linha; coluna++) {
//                 System.out.print('*');
//             }
//             System.out.println();
//         }
        
//         System.out.println("\nFigura B:");
//         for (int linha = 5; linha >= 1; linha--) {
//             for (int coluna = 1; coluna <= linha; coluna++) {
//                 System.out.print('*');
//             }
//             System.out.println();
//         }
        
//         System.out.println("\nFigura C:");
//         for (int linha = 1; linha <= 5; linha++) {
//             for (int espaco = 1; espaco < linha; espaco++) {
//                 System.out.print(' ');
//             }
//             for (int coluna = linha; coluna <= 5; coluna++) {
//                 System.out.print('*');
//             }
//             System.out.println();
//         }
        
//         System.out.println("\nFigura D:");
//         for (int linha = 5; linha >= 1; linha--) {
//             for (int espaco = 1; espaco < linha; espaco++) {
//                 System.out.print(' ');
//             }
//             for (int coluna = linha; coluna <= 5; coluna++) {
//                 System.out.print('*');
//             }
//             System.out.println();
//         }
//     }
// }

// Parte 5 //////////////////////////////////////////////

// public class DivisivelPorSeteECinco {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 100; i++) {
//             if (i % 5 == 0 && i % 7 == 0) {
//                 System.out.println("O primeiro número divisível por 5 e 7 entre 1 e 100 é: " + i);
//                 break; // Termina a execução do loop
//             }
//         }
//     }
// }

