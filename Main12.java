import java.util.Scanner;
class Main12{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char c = scn.next().charAt(0);

        String res = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch != c){
                res += ch;
            }
        }

        System.out.println(res);
        scn.close();
    }
    
}
