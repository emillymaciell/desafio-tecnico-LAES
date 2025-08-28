import java.util.Scanner;

public class VerificadorPalindromo {

    public boolean isPalindromo(String s) {
        String sLimpa = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int inicio = 0;
        int fim = sLimpa.length() - 1;

        while (inicio < fim) {
            if (sLimpa.charAt(inicio) != sLimpa.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VerificadorPalindromo verificador = new VerificadorPalindromo();

        String s = sc.nextLine();

        boolean resultado = verificador.isPalindromo(s);

        if (resultado) {
            System.out.println(" true");
        } else {
            System.out.println(" false");
        }

        sc.close();
    }
}
