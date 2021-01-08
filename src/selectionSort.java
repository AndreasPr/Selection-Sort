/**
 * Created on 07/Jan/2021 to Selection-Sort
 */
public class selectionSort {


    private static void selectionSortAlgorithm(int[] arraySort){

        int minimum_index;
        for(int i = 0; i < arraySort.length - 1; i++){

            minimum_index = i;
            for(int j = i + 1; j<arraySort.length; j++){
                if(arraySort[j] < arraySort[minimum_index]){
                    minimum_index = j;
                }
            }

            int temp = arraySort[minimum_index];
            arraySort[minimum_index] = arraySort[i];
            arraySort[i] = temp;
        }

        for(int z = 0; z < arraySort.length; z++){
            System.out.println(arraySort[z]);
        }
    }

    public static void main(String args[]){
        int[] array = {63, 22, 78,45,3};
        selectionSortAlgorithm(array);
    }
}
