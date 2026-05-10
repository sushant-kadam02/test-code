// TODO: Bubble sort

public class BubbleSort {
    public static void main(String arg[]) {
        int arr[] = {3, 8, 2, 9, 1, 0, 6};

        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++ ) {
            for (int j = i; j < arr.length ; j++) {
                if(arr[i] > arr[j] ) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("sorted array : ");
        for (int num: arr ) {
            System.out.print(num+" ");
        }
    }
}
