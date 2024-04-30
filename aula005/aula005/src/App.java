// o usuario deve digitar 5 numeros
// print a média dos numeros
// exibir na tela do maior para o menor numero

// media
// int[] numeros = {5,2, 8, 1, 6};
// Arrays.sort(numeros); 

// maior e menor
// int[] source = {5,2, 8, 1, 6};
// double result = 
// Arrays.stream(source).average().orElse(0);


import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    
    int arrays[] = new int[5];
    Scanner input = new Scanner(System.in);
    
    for (int i = 0; i <= 4; i++) {
        System.out.println("Digite um numero");
        int n = input.nextInt();
        arrays[i] = n;
    }

    float media = 0;
    for (int i : arrays){
        media += i;
    }

    media = media / arrays.length;
    System.out.println(media);

    System.out.println("--------------------------------");

    Arrays.sort(arrays);

    System.out.println(Arrays.toString(arrays));
    
    }
}




