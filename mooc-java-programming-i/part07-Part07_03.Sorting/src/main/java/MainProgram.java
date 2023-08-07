import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        MainProgram.sort(array);
    }

    public static int smallest(int[] array){
        // write your code here

        int small = array[0];

        for(Integer i: array){
            if(i<small)
                small=i;
        }

        return small;
    }

    public static int indexOfSmallest(int[] array){
        // write your code here
        int small = array[0];
        int index = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]<small){
                small=array[i];
                index=i;
            }
        }
        return index;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int small = table[startIndex];
        int index = startIndex;
        for(int i=startIndex;i<table.length;i++){
            if(table[i]<small){
                small=table[i];
                index=i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for(int i=0;i<array.length;i++){
            int index = indexOfSmallestFrom(array,i);
            swap(array,index,i);
            System.out.println(Arrays.toString(array));
        }
    }

}
