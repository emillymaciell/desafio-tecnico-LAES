import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] resposta = new String[n];

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                resposta[i] = "fizzbuzz";
            } else if ((i + 1) % 3 == 0) {
                resposta[i] = "fizz";
            } else if ((i + 1) % 5 == 0) {
                resposta[i] = "buzz";
            } else {
                resposta[i] = String.valueOf(i + 1);
            }
        }

        System.out.println(java.util.Arrays.toString(resposta));
        sc.close();
    }
}
