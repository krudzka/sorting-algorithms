package pl.jwrabel.trainings.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubwrabel on 16.12.2016.
 */
public class InsertionSort implements SortingAlgorithm {
    public int[] sort(int[] data) {

        List<Integer> sortedList = new ArrayList<>();
        //insertion
        // jak chcemy wstawic indeks 10 pod 2-gi index w liscie
        // lista.add(2,10)


        for (int number : data) {
            if (sortedList.size() == 0) {
                sortedList.add(number);
            } else {
                for (int i = 0; i < sortedList.size(); i++) {
                    if (number <= sortedList.get(i)) {
                        sortedList.add(i, number);
                        break;
                    } else if (i == sortedList.size() - 1) {
                        sortedList.add(number);
                        break;
                    }


                }
            }
        }

        for (int i = 0; i < sortedList.size(); i++) {
            data[i] = sortedList.get(i);

        }
        return data;


    }

    @Override
    public String toString() {
        return "Insertion sort";
    }
}
