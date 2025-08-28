import java.util.Scanner;

public class BestTimeStock {

    public int lucroMax(int[] prices) {
        int lucroMaximo = 0;
        int precoMinimo = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < precoMinimo) {
                precoMinimo = prices[i];
            } else if ((prices[i] - precoMinimo) > lucroMaximo) {
                lucroMaximo = (prices[i] - precoMinimo);
            }
        }
        return lucroMaximo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BestTimeStock solucao = new BestTimeStock();

        System.out.println("informe a quantidade de dias: ");
        int qtd = sc.nextInt();
        int[] prices = new int[qtd];

        System.out.println("informe os " + qtd + " preços");
        for (int i = 0; i < qtd; i++) {
            prices[i] = sc.nextInt();
        }

        int resultado = solucao.lucroMax(prices);
        System.out.println(resultado);

        sc.close();
    }
}
