import java.text.DecimalFormat;
import java.util.List;

public class FunctionWithStream {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(8, 4, 7, 2, 11);
        numbers.stream()
                .sorted()
                .map(num -> {
                    double sqrt = Math.sqrt(num);
                    return new Object[]{num, sqrt};
                })
                .filter(arr -> (int)arr[0] % 2 == 0) 
                .forEach(arr -> {
                    DecimalFormat df = new DecimalFormat("#.##");
                    System.out.println("Number: " + arr[0] + " : " + df.format(arr[1]));
                });
    }
}