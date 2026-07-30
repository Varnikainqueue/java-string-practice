import java.util.Scanner;
class Main11{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char o = scn.next().charAt(0);
        char n = scn.next().charAt(0);

        // String res = str.replace(o, n);
        String res = "";
         for(int i=0; i<str.length(); i++){
             char ch = str.charAt(i);

             if(ch == o){
                 res += n;
             }
             else{
                res += ch;
             }
        
         }
        System.out.println(res);
        scn.close();
    }
    
}
