import java.util.Scanner;
class Student{
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
      String str = scn.nextLine();

        String[] words = str.split("\\s+");
        for(int i=0; i<words.length; i++){
            String word = words[i];
            String res = "";

            for(int j = word.length()-1; j>=0; j--){res +=  word.charAt(j);

            }
            System.out.print(res + " ");

        }
        scn.close();

    }
}
