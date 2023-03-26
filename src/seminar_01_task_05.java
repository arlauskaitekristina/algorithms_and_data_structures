// Пишем алгоритм поиска нужного числа последовательности Фибоначчи, но в этот раз откажемся от рекурсии и воспользуемся циклом.
// F(1) = 1, F(2) = 1
// для n > 2 используем формулу: F(n) = F(n-1) + F(n-2)
public class seminar_01_task_05 {
    public static int fb (int num) {
        if (num <= 2) {
            return 1;
        } else {
            final int[] numbers = new int[num];
            numbers[0] = 1;
            numbers[1] = 1;
            for (int i = 2; i < numbers.length; i++) {
                numbers[i] = numbers[i - 1] + numbers[i - 2];
            }
            return numbers[num - 1];
        }
    }
}
