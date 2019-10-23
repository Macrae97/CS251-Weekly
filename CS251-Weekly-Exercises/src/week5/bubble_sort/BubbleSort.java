package week5.bubble_sort;

import java.util.Collections;
import java.util.List;

public class BubbleSort {

    public void run(List<Integer> listToSort){

        int n = listToSort.size();

        for(int i = 0; i < n; i++){

            for(int j = 0; j < n-i-1; j++){
                if(listToSort.get(j) > listToSort.get(j+1)){

                    Collections.swap(listToSort, j, j+1);
                }
            }
        }
    }
}
