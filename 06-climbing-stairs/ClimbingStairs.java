import java.util.Scanner;

public class ClimbingStairs {

    public int subindoEscadas(int n) {
        if (n <= 2) {
            return n;
        }

        int anterior = 1;
        int atual = 2;

        for (int i = 3; i <= n; i++) {
            int maneira = anterior + atual;

            anterior = atual;
            atual = maneira;
        }
        return atual;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClimbingStairs solucao = new ClimbingStairs();

        System.out.println("informe a quantidade de degraus: ");
        int n = sc.nextInt();

        int resultado = solucao.subindoEscadas(n);
        System.out.println("número de maneiras de subir ao topo: " + resultado);

        sc.close();
    }
}
