import java.util.Arrays;
import java.util.Scanner;

public class sort_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp =arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
