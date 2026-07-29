import java.util.Scanner;
class Main2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine().toLowerCase();
        int ConsonantCount = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                ConsonantCount++;
            }
        }

        }
        System.out.println("Consonant Count: " + ConsonantCount);
        scn.close();
    }
    
}
