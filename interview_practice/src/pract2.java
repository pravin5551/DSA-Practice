public class pract2 {
    public static void main(String[] args) {
        char[] ch = {'4', '4'};
        String[] str = {">", "<", "<", ">", ">"};
        char[] ch1 = new char[str.length];
        int pair = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = i; j < str.length;j++) {
                if(str[i].equals(">") && str[j].equals("<")){
                    pair ++;
                }
            }
        }
        System.out.println(pair);
    }
}
