package homework1;
import java.util.Random;
public class task1 {
    public static void main(String[] args) {
        int i = generateRandomNumber();
        int n = getMostSignificantBit(i);
        System.out.println("Случайное число: " + i);
        System.out.println("Номер старшего значащего бита: " + n);
        int[] m1 = getMultiples(n, i);
        int[] m2 = getNonMultiples(n, i);
    }
    
    public static int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(2001);
    }

    public static int getMostSignificantBit(int num) {
        return 32 - Integer.numberOfLeadingZeros(num);
    }

    public static int[] getMultiples(int i, int n) {
        int[] multiples = new int[Short.MAX_VALUE - i + 1];
        int count = 0;

        for (int j = i; j <= Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                multiples[count] = j;
                count++;
            }
        }
        return multiples;
    }

    public static int[] getNonMultiples(int i, int n) {
        int[] nonMultiples = new int[i - Short.MIN_VALUE + 1];        
        int count = 0;

        for (int j = Short.MIN_VALUE; j <= i; j++) {
            if (j % n != 0 || n == 0) {
                nonMultiples[count] = j;
                count++;
            }
        }
        return nonMultiples;
    }
}