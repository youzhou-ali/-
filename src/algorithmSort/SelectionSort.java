package sort;

public class SelectionSort implements sort {
    int[] numbers;

    public SelectionSort(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void sort() {
        for (int j = 0; j < numbers.length - 1; j++) {
            for (int i = j + 1; i < numbers.length; i++) {
                if (numbers[i] < numbers[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    @Override
    public int[] values() {
        return numbers;
    }
}
