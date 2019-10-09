import collection.Node;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int randoms[] = new int[]{67, 7, 30, 73, 10, 0, 78, 81, 10, 74};

        Node roots = new Node();
        for (int number : randoms) {
            roots.add(number);
        }
    }
}
