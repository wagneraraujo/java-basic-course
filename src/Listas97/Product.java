package Listas97;

import java.util.ArrayList;
import java.util.List;

public class Product {
    public static void main(String[] args){

        //
        List<String> list = new ArrayList<>();

        list.add("Wag");
        list.add("Jose");
        list.add("Teste");
        list.add("Maria");

        //add element in e specif position
        list.add(2, "Andrieli");

        //size list
        System.out.println(list.size());

        //remove item list
        list.remove("Teste");

        //remove for predicato
        list.removeIf(x -> x.charAt(0) == 'M');

        //search position element
        System.out.println("Index of Wag: " + list.indexOf("Wag"));

        //filter
        //converto para stream, faço a operacao e depois volto para lista
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').toList();

        //search element list with predicated or return null
        String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
        System.out.println("Search with predicted: " + name);




        for(String names : list){
            System.out.println(names);
        }

        for(String names : result){
            System.out.println("Started names J");
            System.out.println(names);
        }
    }
}
