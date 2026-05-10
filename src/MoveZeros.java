import java.util.Arrays;

public class MoveZeros {



    public static void main(String[] args) {

        int array[] = {1,0,5,0,13,9};

        System.out.println("Moving zeros to at end of array ");

//        int array2[] = new int[array.length];
//        int incrementFlag = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] != 0) {
//                array2[incrementFlag] = array[i];
//                incrementFlag++;
//            }
//        }
//        if(incrementFlag != array2.length) {
//            for (int i = incrementFlag+1; i < array2.length; i++) {
//                array2[i] = 0;
//            }
//        }


        int insertPos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 ) {
                int tmp= array[insertPos];
                array[insertPos] = array[i];
                array[i] = tmp;
                insertPos++;
            }
        }

        //System.out.println("input array : "+ Arrays.toString(array));
        System.out.println("moved zero input array : "+ Arrays.toString(array));
//        System.out.println("outpuut array2 : "+ Arrays.toString(array2));



    }
}
