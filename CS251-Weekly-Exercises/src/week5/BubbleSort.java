package week5;

import java.util.Collections;
import java.util.List;

public class BubbleSort {

    public List<Integer> run(List<Integer> listToSort){

        int n = listToSort.size();

        for(int i = 0; i < n; i++){

            for(int j = 0; j < n-i-1; j++){
                if(listToSort.get(j) > listToSort.get(j+1)){
                    int temp = listToSort.get(j);
                    listToSort.set(j, listToSort.get(j+1));
                    listToSort.set(j+1, temp);

                    Collections.swap(listToSort, j, j+1);
                }
            }
        }

        return listToSort;
    }
}
