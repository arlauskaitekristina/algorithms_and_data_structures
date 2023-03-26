import java.util.Date;
public class seminar_02_task_01 {
    // Сортировка пузырьком
    public static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int help = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = help;
                }
            }
        }
    }

    // Сортировка выбором
    public static void directSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int posMin = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[posMin]) {
                    posMin = j;
                }
            }

            if (posMin != i) {
                int help = numbers[posMin];
                numbers[posMin] = numbers[i];
                numbers[i] = help;
            }
        }
    }

    // Сортировка вставками
    public static void insertSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            for (int j = i; j > 0; j--) {
                if (numbers[j] < numbers[j - 1]) {
                    int help = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = help;
                } else {
                    break;
                }
            }
        }
    }

    //Бинарный поиск
    public static int BinarySearch(int[] numbers, int value) {
        int left = 0, right = numbers.length - 1;
        while (right - left > 1) {
            int mid = (left + right) / 2;
            if (numbers[mid] < value)
                left = mid;
            else
                right = mid;
        }
        if (numbers[left] == value)
            return left;
        if (numbers[right] == value)
            return right;
        return -1;
    }

    public static void main(String[] args) {
        int n = 100000;
        int[] numbers = new int[n];
        //int[] numbers2 = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = (int) (Math.random() * 10000);
            //numbers2[i] = numbers[i];
        }
    }

    public class MergeSort {
        static int N = 100000;
        final static int[] buff = new int[N];

        public static void sort(int[] numbers) {
            sort(numbers, 0, numbers.length - 1);
        }

        // Сортировка слиянием
        private static void sort(int[] numbers, int l, int r) {
            if (l == r)
                return;
            int m = (l + r) / 2;
            sort(numbers, l, m);
            sort(numbers, m + 1, r);

            int i = l, j = m + 1, pos = l;
            while (i <= m && j <= r) {
                if (numbers[i] < numbers[j]) {
                    buff[pos] = numbers[i];
                    i++;
                } else {
                    buff[pos] = numbers[j];
                    j++;
                }
                pos++;
            }
            while (i <= m) {
                buff[pos] = numbers[i];
                pos++;
                i++;
            }
            while (j <= r) {
                buff[pos] = numbers[j];
                pos++;
                j++;
            }
            for (int k = l; k <= r; k++)
                numbers[k] = buff[k];
        }
    }
}