
package sortingalgorithms;


public class SortingAlgorithms {

    public static void main(String[] args) {

        int[] numbers = {10, 42, 59, 8, 72, 26, 2, 44, 79, 92};

        int[] bubbleArray = numbers.clone();
        int[] selectionArray = numbers.clone();
        int[] insertionArray = numbers.clone();

        System.out.println("Original Array:");
        printArray(numbers);

        bubbleSort(bubbleArray);
        System.out.println("\nBubble Sort:");
        printArray(bubbleArray);

        selectionSort(selectionArray);
        System.out.println("\nSelection Sort:");
        printArray(selectionArray);

        insertionSort(insertionArray);
        System.out.println("\nInsertion Sort:");
        printArray(insertionArray);
    }

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
