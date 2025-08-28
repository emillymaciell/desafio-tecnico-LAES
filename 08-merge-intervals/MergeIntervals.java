import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeIntervals {

    public int[][] unirIntervalos(int[][] intervals) {
        for (int i = 0; i < intervals.length - 1; i++) {
            for (int j = 0; j < intervals.length - i - 1; j++) {
                if (intervals[j][0] > intervals[j + 1][0]) {
                    int[] temp = intervals[j];
                    intervals[j] = intervals[j + 1];
                    intervals[j + 1] = temp;
                }
            }
        }

        List<int[]> listaUnida = new ArrayList<>();
        listaUnida.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] intervaloAtual = intervals[i];
            int[] ultimoIntervalo = listaUnida.get(listaUnida.size() - 1);

            if (intervaloAtual[0] <= ultimoIntervalo[1]) {
                if (intervaloAtual[1] > ultimoIntervalo[1]) {
                    ultimoIntervalo[1] = intervaloAtual[1];
                }
            } else {
                listaUnida.add(intervaloAtual);
            }
        }

        int[][] resultado = new int[listaUnida.size()][];
        for (int i = 0; i < listaUnida.size(); i++) {
            resultado[i] = listaUnida.get(i);
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MergeIntervals solucao = new MergeIntervals();

        System.out.println("informe a quantidade de intervalos: ");
        int qtd = sc.nextInt();
        int[][] intervals = new int[qtd][2];

        for (int i = 0; i < qtd; i++) {
            System.out.println("informe o início e o fim do intervalo " + (i + 1));
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        int[][] resultado = solucao.unirIntervalos(intervals);
        System.out.println(Arrays.deepToString(resultado));

        sc.close();
    }
}
