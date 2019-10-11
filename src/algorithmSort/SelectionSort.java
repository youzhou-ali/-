package algorithmSort;

public class SelectionSort implements Sort {
    private int[] numbers;

    public SelectionSort(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void sort() {
//        for (int j = 0; j < numbers.length - 1; j++) {
//            for (int i = j + 1; i < numbers.length; i++) {
//                if (numbers[i] < numbers[j]) {
//                    int temp = numbers[j];
//                    numbers[j] = numbers[i];
//                    numbers[i] = temp;
//                }
//            }
//        }
        for (int j = 0; j < numbers.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < numbers.length; i++) {
                if (numbers[i] < numbers[min])
                    min = i;
            }
            int temp = numbers[j];
            numbers[j] = numbers[min];
            numbers[min] = temp;
        }
    }

    @Override
    public int[] values() {
        return numbers;
    }
}
