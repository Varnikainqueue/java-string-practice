import java.util.Scanner;
class Main13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            if(str.indexOf(ch) != i)
                continue;

            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == ch)
                    count++;
            }

            System.out.println(ch + " : " + count);
        }

        sc.close();
    }
}