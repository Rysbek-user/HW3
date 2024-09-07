import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {2.1, 2.2, -3.4, -9.8, 4.5, -6.3, -5.4, 3.4, 5.6, 3.4, 12.2, 34,3, -14.4, -13.3, 24.1};
        System.out.println("Ваш массив:" + Arrays.toString(numbers));
        boolean negative = false;
        double sum = 0.0;
        int count = 0;
        for (double number: numbers){
            if (!negative){
                if (number < 0){
                    negative = true;
                }
            }else {
                if (number > 0);{
                    sum += number;
                    count++;
                }
            }
        }
        if (count > 0){
            double summ = sum/count;
            System.out.println(sum + "/" + count +  " или " + summ);
        }
    }
}