package pl.jwrabel.trainings.algorithms.sorting;

import java.util.Arrays;

/**
 * Created by jakubwrabel on 16.12.2016.
 */
public class BubbleSort implements SortingAlgorithm {
    public int[] sort(int[] data) {

        for (int i = 0; i < data.length; i++) {


            boolean swapped = false; //optymalizacja zeby nie robic kolejnych przejsc petli
            for (int j = 0; j < data.length - 1-i; j++) {


                if (data[j] > data[j + 1]) {
                    int x = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = x;
                    swapped = true;
                }
            }
            if (!swapped) {
                return data;
            }
        }
     return data;
    }


    @Override
    public String toString() {
        return "Bubble sort";
    }
}
