import java.util.Scanner;
class Main3{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine().toLowerCase();
        int count=0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch>='0' && ch<='9'){
                count++;
            }

        }

        System.out.println("Digits count: " + count);
        scn.close();
    }
    
}
