package week5.exercises;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Collections;
import java.util.List;

public class EmpiricalAnalysis {

    public void run(int n){

        long start = System.nanoTime();

        int[] l = new int[n];

        for(int i = 0; i < n; i++){
            l[i] = (i-1);
        }

        for(int i = 0; i < l.length; i++){
            System.out.print(l[i] + ", ");
        }

        long end = System.nanoTime();

        System.out.println("\nThe algorithm ran in " + (end - start) + " nanoseconds with " + n + " values.");

    }
}
