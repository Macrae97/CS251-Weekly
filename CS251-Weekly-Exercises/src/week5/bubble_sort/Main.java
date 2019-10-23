package week5.bubble_sort;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        long start = System.nanoTime();

        List<Integer> listToSort = new ArrayList<>();
        listToSort.add(6);
        listToSort.add(10);
        listToSort.add(2);
        listToSort.add(8);
        listToSort.add(13);

        BubbleSort bubbleSort = new BubbleSort();

        bubbleSort.run(listToSort);

        long end = System.nanoTime();

        for (int i = 0; i < listToSort.size(); i++){
            System.out.print(listToSort.get(i) + ", ");
        }

        System.out.println("\nThe algorithm ran in " + (end -start) + " nanoseconds");

    }
}
