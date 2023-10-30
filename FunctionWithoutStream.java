import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class FunctionWithoutStream {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(4);
        numbers.add(7);
        numbers.add(2);
        numbers.add(10);
        Collections.sort(numbers);

        for (int num : numbers) {
            double sqrt = Math.sqrt(num);
            if (num % 2 == 0) {
                DecimalFormat df = new DecimalFormat("#.##");
                System.out.println("Number: " + num + " : " + df.format(sqrt));
            }
        }
    }
}