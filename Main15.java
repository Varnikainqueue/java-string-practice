import java.util.Scanner;
class Main15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String words[] = str.split(" ");

        String res = "";

        for(int i = 0; i < words.length; i++){
            String word = words[i];

            res += Character.toUpperCase(word.charAt(0));
            
            res += word.substring(1).toLowerCase();

            res += " ";
        }

        System.out.println(res);
        sc.close();
    }
}