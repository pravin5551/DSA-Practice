import java.util.*;

public class pract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.next();

        char[] ch1 = new char[str1.length()];
        char[] ch2 = new char[str2.length()];

        for (int i = 0; i < str1.length(); i++) {
            ch1[i] = str1.charAt(i);
            ch2[i] = str2.charAt(i);
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int count=0;
        for(int i=0;i<str1.length();i++){
            if(ch1[i] !=ch2[i]){
               count++;
            }
        }
        if(count==0){
            System.out.println(" Is anagram");
        }else{
            System.out.println("Not a anagram");
        }
        System.out.println(ch1);
        System.out.println(ch2);

    }
}
