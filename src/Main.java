import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для разворота :");
        String text = scanner.nextLine();
        System.out.println("Исходная строка : " + text);
        System.out.println("Развернутая строка : " + getReverseString(text));
        System.out.println("Время выполнения 1000 повторений = " + getExecutionTime(1000, text) + " мс");
        System.out.println("Время выполнения 10 000 повторений = " + getExecutionTime(10000, text) + " мс");
        System.out.println("Время выполнения 100 000 повторений = " + getExecutionTime(100000, text) + " мс");
    }

    public static String getReverseString(String text) {
        StringBuilder builder = new StringBuilder();
        builder.append(text);
        return  builder.reverse().toString();
    }

    public static long getExecutionTime (int repeatCount, String text) {
        long startTime = System.currentTimeMillis();
        int count = 1;
        while(count <= repeatCount) {
            getReverseString(text);
            count += 1;
        }
        return System.currentTimeMillis() - startTime;
    }
}
