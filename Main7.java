import java.util.Scanner;
class Main7{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        String res = "";
        for(int i = str.length() - 1; i>=0; i--){
            res += str.charAt(i);
        }

        System.out.println("Reversed String: " + res);
        scn.close();
    }
    
}
