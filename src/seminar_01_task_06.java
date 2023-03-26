import java.util.Date;


public class seminar_01_task_06 {
    public static void test () {
        for (int i = 10; i <= 50; i = i + 10) {
            Date startDate = new Date();
            fbLine(i);
            Date endDate = new Date();
            long lineDuration = endDate.getTime() - startDate.getTime();
            startDate = new Date();
            fbRecursive(i);
            endDate = new Date();
            long recursiveDuration = endDate.getTime() - startDate.getTime();
            System.out.printf("i: %s, line duration: %s, recursive duration:%s%n", i, lineDuration, recursiveDuration);
        }
    }
}


