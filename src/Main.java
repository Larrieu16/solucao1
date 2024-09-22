
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.print("Informe um número: ");

            n = sc.nextInt();

            if (isFibonacci(n)) {
                System.out.println(n + ": está na sequência de Fibonacci.");
            } else {
                System.out.println(n + ": não está na sequência de Fibonacci.");
            }
        }

        public static boolean isFibonacci(int n1) {
            int a = 0, b = 1;
            while (a < n1) {
                int temp = a;
                a = b;
                b = temp + b;
            }
            return a == n1; // Retorna verdadeiro se n estiver na sequência
        }
    }
