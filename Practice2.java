import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine().toLowerCase();

        String sb = new StringBuilder(str).reverse().toString();
        
    

        if(str.equals(sb)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

        scn.close();
    }
    
}
