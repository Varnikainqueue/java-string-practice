import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char c = scn.next().charAt(0);

        int count=0;
        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch == c){
               count++;
            }
        }
        System.out.println(count);

        scn.close();
    }
    
}
