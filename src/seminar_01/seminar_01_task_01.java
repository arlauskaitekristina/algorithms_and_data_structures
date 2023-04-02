package seminar_01;

// Необходимо написать алгоритм, считающий сумму всех чисел от 1 до N. Согласно свойствам линейной сложности,
// количество итераций цикла будет линейно изменяться относительно изменения размера N.
// Решение должно иметь сложность O(N)
// Для решения надо воспользоваться циклом
public class seminar_01_task_01 {
    public static void main(String[] args) {
        System.out.println(sum(500000));
    }

    public static int sum(int lastNumber) {
        int sum = 0;
        for (int i = 1; i <= lastNumber; i++) {
            sum += i;
        }
        return sum;
    }
}