public class homework_01 {
    // Управляющая программа
    public static void main(String args[]) {
        int arr[] = {312, 61, -13, 15, -6, 707};
        int arrlenght = arr.length;

        homework_01 ob = new homework_01();
        ob.heapsort(arr);

        System.out.println("Отсортированный список: ");
        printArray(arr);
    }

    void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
    public void heapsort(int arr[]) {
        int arrlenght = arr.length;

        for (int i = arrlenght / 2 - 1; i >= 0; i--)
            heapify(arr, arrlenght, i);

        for (int i = arrlenght - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    static void printArray(int arr[]) {
        int arrlenght = arr.length;
        for (int i = 0; i < arrlenght; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}

