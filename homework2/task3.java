package homework2;
public class task3 {
    public static void main(String[] args) {
        String str = new String(new char[10000]).replace('\0', 'a');
        StringBuilder sb = new StringBuilder(str);

        long startTime = System.currentTimeMillis();
        String newStr = str.replace('a', 'A');
        long endTime = System.currentTimeMillis();
        System.out.println("Время выполнения замены символов с использованием String: " + (endTime - startTime) + " милисекунд");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a') {
                sb.setCharAt(i, 'A');
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения замены символов с использованием StringBuilder: " + (endTime - startTime) + " милисекунд");
    }
}
