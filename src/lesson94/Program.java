package lesson94;

import Entities.RentLesson94;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        RentLesson94[] vect = new RentLesson94[10];
        System.out.print("How many rooms will be rented?");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++){
           System.out.println("rent #" + i + ":");
           System.out.print("Name: ");
           sc.nextLine();
           String name = sc.nextLine();

           System.out.print("Email: ");
           String email = sc.next();
           System.out.print("Room: ");
           int roomNumber = sc.nextInt();
            System.out.println();
           //atribuindo a posicao do vetor com a p o sicapo passada pelo user
           vect[roomNumber] = new RentLesson94(name, email);
            System.out.println();

        }
        System.out.println();
        System.out.println("Busy rooms");
        //exibir so os ocupados
        for(int i = 0; i < 10; i++){
            if(vect[i] != null){
                System.out.println(vect[i]);
            }
        }


        sc.close();
    }
}
