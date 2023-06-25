//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class TriangularNumber {
    public static void main(String[] args) {
        System.out.print("введите натуральное число n =   ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int T_n = triangular(n);
        System.out.println("треугольное число вашего натурального числа n =  " + T_n);
        summa(T_n);
        multiplication(T_n);
    }

    public static int triangular(int n){
        return n * (n + 1) / 2;
    }

    public static void summa(int T_n) {
        int summ = 0;
        for (int i = 1; i <= T_n; i++) {
            summ += i;
        }
        System.out.println("сумму чисел от 1 до треугольного числа =  " + summ);
    }

    public static void multiplication(int T_n) {
        int composition = 1;
        for (int i = 1; i <= T_n; i++) {
            composition = composition * i;
        }
        System.out.println("произведение чисел от 1 до треугольного числа =  " + composition);
    }
}

