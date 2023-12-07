package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ConcurrentNavigableMap;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        int contEven = 0;

        System.out.println("Quantos numeros voce vai digitar: ");
        int n = ler.nextInt();
        double[] vetPar = new double[n];

        for (int i = 0; i < vetPar.length; i++){
            System.out.println("Digite um numero: ");
            vetPar[i] = ler.nextDouble();
        }

        for (int i = 0; i < vetPar.length; i++){
            if(vetPar[i] % 2 == 0){
                System.out.printf("EVEN NUNBERS: %.2f%n", vetPar[i]);
                contEven++;
            }
        }

        System.out.print("QUANTIDADE DE PARES: " + contEven);




        ler.close();
    }
}
