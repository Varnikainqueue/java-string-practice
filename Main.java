import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine().toLowerCase();
        int vowel_count=0;
        for(int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowel_count++;

            }
        }
        System.out.println("Vowel Count: " + vowel_count);
        scn.close();
    }
}