import java.util.Scanner;
class Main6{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        String res = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch>='a' && ch<='z'){
                res += (char)(ch - 32);
            }
            else if(ch>='A' && ch<='Z'){
                res += (char)(ch + 32);
            }
            else{
                res += ch;
            }
        }

        System.out.println("Before Toggle: " + str);
        System.out.println("After Toggle: " + res);

        scn.close();
    }
    
}
