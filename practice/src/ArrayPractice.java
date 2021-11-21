public class ArrayPractice {
    public static void main(String[] args) {
        // System.out.println("test");
        // long[] arr=new long[4];
        /*long arr[]={1,2,3,4};
        for(int j=0;j<arr.length;j++)
            System.out.println(arr[j]);*/

      /*  int[][] arr=new int[4][];
        for(int i=0;i<4;i++){
           // System.out.println(arr[i]);
            arr[i]=new int[4];
            for(int j=0;j<3;j++){
            arr[i][j]=i+j;
                System.out.println(arr[i][j]);}
        }*/
        int arr[] = mergeArrays(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{1, 2, 3, 4, 5, 6, 7});
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int lengthArr1 = arr1.length;
        int lengthArr2 = arr2.length;
        int[] resultArray = new int[lengthArr1 + lengthArr2];
        int i = 0, j = 0, k = 0;

        while (i < lengthArr1 && j < lengthArr2) {
            if (arr1[i] < arr2[j])
                resultArray[k++] = arr1[i++];
            else resultArray[k++] = arr2[j++];

        }
        while (i < lengthArr1)
            resultArray[k++] = arr1[i++];
        while (j < lengthArr2)
            resultArray[k++] = arr1[j++];

        // write your code here
        return resultArray; // make a new resultant array and return your results in that
    }

    public static int[] removeEven(int[] arr) {
        int length = 0;
        int max = arr.length - 1;
        while (max >= 0) {

            if (arr[max] % 2 == 1)
                length++;

            max--;
        }
        int[] array = new int[length];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                array[j] = arr[i];
                j++;
            }
        }

        // Write - Your - Code- Here
        return array; // change this and return the correct result array
    }

}
