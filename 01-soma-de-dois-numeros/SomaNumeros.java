import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SomaNumeros {

    public int[] Soma(int[] nums, int target) {
        Map<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int numSomado = target - nums[i];

            if (mapa.containsKey(numSomado)) {
                return new int[] { mapa.get(numSomado), i };
            } else {
                mapa.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("sem solução");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SomaNumeros solucao = new SomaNumeros();
        System.out.println("informe a quantidade de números: ");
        int qtd = sc.nextInt();
        int[] nums = new int[qtd];

        System.out.println("informe os " + qtd + " números");
        for (int i = 0; i < qtd; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("informe o target: ");
        int target = sc.nextInt();

        int[] resultado = solucao.Soma(nums, target);

        System.out.println(Arrays.toString(resultado));

        sc.close();
    }
}
