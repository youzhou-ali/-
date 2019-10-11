package sort;

import collection.Node;

import java.util.List;

public class TreeSort implements sort{

    private int[] numbers;
    private Node n;

    public TreeSort(int[] numbers, Node n) {
        this.numbers = numbers;
        this.n = n;
    }

    //创建二叉树
    @Override
    public void sort() {
        long start = System.currentTimeMillis();
        for (int i : numbers){
            n.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("二叉树创建:" + (end - start) + "ms");
    }

    //排序
    @Override
    public int[] values() {
        List<Object> list = n.values();
        int[] sortedNumbers = new int[list.size()];
        for (int i = 0; i < sortedNumbers.length; i++) {
            sortedNumbers[i] = Integer.parseInt(list.get(i).toString());
        }
        return sortedNumbers;
    }
}
