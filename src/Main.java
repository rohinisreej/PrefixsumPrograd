import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] prefixsum(int[] array) {
        for(int iterator=1;iterator<array.length;iterator++){
            array[iterator]+=array[iterator-1];
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        int[] array = new int[size];
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }

        System.out.println(Arrays.toString(prefixsum(array)));

    }


}