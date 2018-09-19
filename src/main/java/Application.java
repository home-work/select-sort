import java.util.Random;

public class Application {
    public static void main(String[] args) {
        int[] arr = createRandomArray(10);

        System.out.println("Mảng đã tạo:");
        displayArray(arr);
        System.out.println("\nMảng sau khi sắp xếp:");
        displayArray(selectSortArray(arr));
    }

    private static int[] createRandomArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 0;
        }
        return arr;
    }

    private static int[] selectSortArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    temp = min;
                    min = arr[j];
                    arr[j] = temp;
                }
            }
            arr[i] = min;
        }


        return arr;
    }

    private static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
