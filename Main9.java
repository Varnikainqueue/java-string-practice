import java.util.Scanner;
class Main9{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
       String res = "";
       for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);

        if(ch != ' '){
            res += ch;
        }
       }

       System.out.println(res);
        
        scn.close();
    }
    
}
