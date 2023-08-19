package lesson92;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();

        //crie
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        //ler vetores
    for (int i=0; i<n; i++){
        System.out.println("Dados da" + (i +1) + " a pessoa");
        System.out.print("Nome: ");
        nomes[i] = sc.next();

        System.out.print("Idade: ");
        idades[i] = Integer.parseInt(sc.next());

        System.out.print("Altura: ");
        alturas[i] = Double.parseDouble(sc.next());

    }


    double soma = 0.0;

    for(int i = 0; i< n; i++){
        soma = soma + alturas[i];
    }
    double mediaAlturas = soma / n;
    System.out.println();
    System.out.printf("Altura média: %.2f%n", mediaAlturas);

    int cont = 0;
    for(int i=0; i<n; i++){
        if(idades[i] < 16){
            cont = cont +1;
        }
    }

    double percent = cont * 100.0 / n;
    System.out.printf("Pessosa com menos de 16 anos: %.1f%%%n", percent);

        for(int i=0; i<n; i++){
            if(idades[i] < 16){
                System.out.println(nomes[i]);
            }
    }


    sc.close();



    }
}
