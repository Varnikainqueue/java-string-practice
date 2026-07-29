import java.util.Scanner;
class Main4{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == ' '){
                count++;
            }
        }
        System.out.println("Spaces count: " + count);
        scn.close();
 
    }
    
}
