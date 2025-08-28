import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arrayDeChars = s.toCharArray();

        for (int i = 0; i < arrayDeChars.length; i++) {
            char c = arrayDeChars[i];

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char topo = stack.pop();

                if (c == ')' && topo != '(') {
                    return (false);
                }
                if (c == ']' && topo != '[') {
                    return false;
                }
                if (c == '}' && topo != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidParentheses solucao = new ValidParentheses();

        System.out.println("informe os parênteses: ");
        String s = sc.nextLine();

        boolean resultado = solucao.isValid(s);
        System.out.println(resultado);

        sc.close();
    }
}
