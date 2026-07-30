import java.util.Scanner;
class Main8{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        String res = "";
        for(int i= str.length() - 1; i>=0; i--){
            res += str.charAt(i);
        }

        if(res.equals(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

        scn.close();

    }
    
}
