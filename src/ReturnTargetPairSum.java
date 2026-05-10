// TODO: Return pair in sorted array with Target sum of 26

public class ReturnTargetPairSum {
    public static void main(String[] args) {
        int arr[] = {7, 9, 11, 15, 25};
        int i = 0;
        int j = arr.length - 1;

        int target = 26;

        while (arr[i]+arr[j] != target) {
        if (arr[i]+arr[j] > target) {
            j--;
        } else if (arr[i]+arr[j] < target) {
            i++;
        }
        }
        System.out.println("The sum of pairs are arr["+i+"] and arr["+j+"]" );
    }
}
