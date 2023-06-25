//Вывести все простые числа от 1 до 1000

import java.util.ArrayList;
import java.util.List;

public class Simple {
    public static void main(String[] args) {
        int number = 100;
        List<Integer> simpleNumber = findSimpleNumber(number);
        for (Integer integer : simpleNumber) {
            System.out.printf( integer + "  " );
        }
    }
    public static List<Integer> findSimpleNumber(int number) {
        List<Integer> array = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;    // уменьшение кол-ва операций(optimization)
                }
            }
            if (simple) {
                array.add(i);
            }
        }
        return array;
    }
}



