import java.util.Arrays;
import java.util.Scanner;

public class reverse_array {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int temp;
        int initial_value = 0;
        int arr_size = arr.length-1;
        while(initial_value < arr_size){
           temp =  arr[initial_value];
           arr[initial_value] = arr[arr_size];
           arr[arr_size] = temp;
           initial_value++;
           arr_size--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
