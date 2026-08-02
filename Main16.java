import java.util.Scanner;
class Main16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String words[] = str.split(" ");

        for(int i = 0; i < words.length; i++) {
            String word = words[i];

            for(int j = word.length() - 1; j >= 0; j--) {
                System.out.print(word.charAt(j));
            }

            System.out.print(" ");
        }

        sc.close();
    }
}