package homework3;
import java.util.ArrayList;
import java.util.List;
public class task4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> oddNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }

        if (!oddNumbers.isEmpty()) {
            int min = oddNumbers.get(0);
            int max = oddNumbers.get(0);
            double sum = 0;

            for (int number : oddNumbers) {
                min = Math.min(min, number);
                max = Math.max(max, number);
                sum += number;
            }

            double average = sum / oddNumbers.size();

            System.out.println("Нечётные числа: " + oddNumbers);
            System.out.println("Минимальное значение: " + min);
            System.out.println("Максимальное значение: " + max);
            System.out.println("Среднее значение: " + average);
        } else {
            System.out.println("Список пуст после удаления чётных чисел");
        }
    }
        
}
