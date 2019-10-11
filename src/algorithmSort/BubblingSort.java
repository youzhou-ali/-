package algorithmSort;

public class BubblingSort implements Sort {
    private int[] numbers;

    public BubblingSort(int[] numbers) {
        this.numbers = numbers;
    }

    //冒泡排序算法
    @Override
    public void sort() {
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers.length - j - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
    }

    @Override
    public int[] values() {
        return numbers;
    }
}
