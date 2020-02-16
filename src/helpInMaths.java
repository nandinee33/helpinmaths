import java.util.Scanner;

public class helpInMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        for (int j = 0; j < ch.length
                ; j = j + 2) {
            for (int i = j; i < ch.length; i = i + 2) {
                if (ch[j] > ch[i]) {

                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }

        }
        for (int k = 0; k < ch.length; k++) {
            System.out.print(ch[k]);
        }

    }

}

