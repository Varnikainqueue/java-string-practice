import java.util.Scanner;
class Main5{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(!((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9') || (ch==' '))){
                count++;
            }
        }

        System.out.println("Special Character count: " + count);
        scn.close();
    }
    
}
