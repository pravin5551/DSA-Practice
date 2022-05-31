import java.util.Scanner;

public class min_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int smaller = arr[0];
        int highest = arr[arr.length - 1];
        for (int j : arr) {
            if (j < smaller) {
                smaller = j;
            }
        }
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }
        System.out.println("Smaller = " + smaller + "Highest = " + highest);
    }
}
