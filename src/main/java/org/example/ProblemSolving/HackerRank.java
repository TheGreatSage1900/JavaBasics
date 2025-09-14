package org.example.ProblemSolving;



import java.security.cert.CollectionCertStoreParameters;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HackerRank {



    public static List<String> getActiveTraders(List<String> totalTradersList){

        Map<String,Long> tradersMap =  totalTradersList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return tradersMap.entrySet().stream().filter(map -> (map.getValue() * 100.0) / totalTradersList.size() >= 5.0).map(Map.Entry::getKey).collect(Collectors.toList());
    }



    public static int getOrdersCount(List<Integer> orders, int availableQty){

        // input list of orders, available quantity

    // output how many orders can be done with the available quantity
        Collections.sort(orders);
        int count = 0;
        for(int order: orders){
            if(order <= availableQty){
                count++;
                availableQty-=order;
            }
            else{
                break;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getOrdersCount(new ArrayList<>(List.of(2,4,54)),50));
        System.out.println(getActiveTraders(new ArrayList<>(List.of(
                "apple", "apple", "apple", "apple",  // 4 times
                "banana", "banana", "banana", "banana",  // 4 times
                "orange", "orange", "orange", "orange", "orange", "orange", "orange", "orange",
                "orange", "orange", "orange", "orange", "orange", "orange", "orange", "orange",
                "orange", "orange", "orange", "orange", "orange", "orange", "orange", "orange",
                "orange", "orange", "orange", "orange", "orange", "orange", "orange", "orange",
                "orange", "orange", "orange", "orange", "orange", "orange", "orange", "orange",
                "orange", "orange", "orange", "orange", "orange", "orange", "orange", "orange",
                "orange", "orange", "orange", "orange", "orange", "orange", "orange", "orange",
                "orange", "orange", "orange", "orange", "orange", "orange", "orange", "orange",
                "orange", "orange", "orange", "orange", "orange", "orange", "orange", "orange",
                "orange", "orange", "orange", "orange", "orange", "orange", "orange", "orange",
                "orange", "orange", "orange", "orange", "orange", "orange", "orange", "orange",
                "orange", "orange"  // total 92 times
        ))));
    }

}
