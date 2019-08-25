package pl.sdacademy.javapoz19programowanie1.javapoz19programowanie1;

public class BinarySearch {

    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearch();

        System.out.println(binarySearch.binarySearch(6, new int[]{1, 2, 3, 6, 7, 9}));
        System.out.println(binarySearch.binarySearch(7, new int[]{1, 2, 3, 6, 7, 9}));
        System.out.println(binarySearch.binarySearch(5, new int[]{1, 2, 5, 6, 7, 9, 10, 11, 15, 16, 19, 30, 45}));

    }

    public int binarySearch(int value, int[] numbers) {

        int left = 0;
        int right = numbers.length - 1;

        while (left != right) {
            int center = (left + right) / 2;
            if (numbers[center] <= value) {
                left = center;
            }
            if (numbers[center] >= value) {
                right = center;
            }
        }

        return value == numbers[left] ? left : -1;
    }
}
