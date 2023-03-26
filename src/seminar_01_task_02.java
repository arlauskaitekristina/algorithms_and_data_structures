
import java.util.ArrayList;
import java.util.List;

public class seminar_01_task_02 {
    public static void main(String[] args) {

    }

    public static List<Integer> findSimpleNumbers(int lastNumber) {
        List<Integer> result = new ArrayList<>();
        boolean simple = true;
        for (int i = 1; i <= lastNumber; i++) {
            simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                result.add(i);
            }
        }
        return result;
    }
}
