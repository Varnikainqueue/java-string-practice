import java.util.Scanner;
public class Practice{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        String res = str.toUpperCase();

        String[] arr = str.trim().split("\\s+");
        int r = arr.length;

        System.out.println(res);
        System.out.println(r);

        scn.close();


    }
}