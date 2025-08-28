import java.util.Scanner;

public class MaximumSubarray {

    public int MaxSubarray(int[] nums) {
        int somaAtual = nums[0];
        int somaMaior = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (somaAtual < 0) {
                somaAtual = nums[i];
            } else {
                somaAtual = somaAtual + nums[i];
            }

            if (somaAtual > somaMaior) {
                somaMaior = somaAtual;
            }
        }
        return somaMaior;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaximumSubarray solucao = new MaximumSubarray();

        System.out.println("informe a quantidade de números: ");
        int qtd = sc.nextInt();
        int[] nums = new int[qtd];

        System.out.println("informe os " + qtd + " números");
        for (int i = 0; i < qtd; i++) {
            nums[i] = sc.nextInt();
        }

        int resultado = solucao.MaxSubarray(nums);
        System.out.println("maior soma: " + resultado);

        sc.close();
    }
}
