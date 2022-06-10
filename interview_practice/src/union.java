import java.util.Scanner;

public class union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOne = sc.nextInt();
        int sizeTwo = sc.nextInt();

        int arrOne[] = new int[sizeOne];
        for(int i=0;i<sizeOne;i++){
            arrOne[i] = sc.nextInt();
        }


        int arrTwo[] = new int[sizeTwo];
        for(int i=0;i<sizeTwo;i++){
            arrTwo[i] = sc.nextInt();
        }
        int unionCount = 0;
        for (int i = 0; i < sizeOne; i++) {
            for (int j = 0; j < sizeTwo; j++) {
                if(arrOne[i]==arrTwo[j]){
                    unionCount++;
                }
            }
        }
        System.out.println("No of ZUnion elements are " + unionCount);
    }
}
