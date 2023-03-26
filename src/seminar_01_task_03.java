//Необходимо написать алгоритм поиска всех доступных комбинаций для количества кубиков K с
// количеством граней N.
// Вариант 1: количество кубиков может быть строго ограничено (4 кубика, например)
// Вариант 2: либо их количество будет динамическим (N задает пользователь)
//Определить сложность полученного варианта решения
public class seminar_01_task_03 {
    public static void main(String[] args) {

    }

    public static int combinationCount(int faces) {
        int count = 0;
        for (int i = 1; i <= faces; i++) {
            for (int j = 1; j <= faces; j++) {
                for (int k = 1; k <= faces; k++) {
                    for (int l = 1; l <= faces; l++) {
                        count++;
                    }
                }
            }
        }
        return count;
    }


    public static int combonationCount(int count, int faces) {
        if (count > 0) {
            return recursiveCunter(1, count, faces);
        } else {
            return 0;
        }
    }

    private static int recursiveCunter(int depth, int maxDepth, int faces) {
        int count = 0;
        for (int i = 1; i <= faces; i++) {
            if (depth == maxDepth) {
                count++;
            } else {
                count += recursiveCunter(depth + 1, maxDepth, faces);
            }
        }
        return count;
    }
}




















