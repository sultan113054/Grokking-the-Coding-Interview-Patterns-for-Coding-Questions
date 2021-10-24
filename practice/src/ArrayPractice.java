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
        int[] arr={1,2,3,4,5,6,7};
        arr=removeEven(arr);
       for(int i=0;i<arr.length;i++)
           System.out.println(arr[i]);
    }

    public static int[] removeEven(int[] arr) {
        int[] array=new int[arr.length-1];
        for(int i=0,j=0;i<arr.length;i++)
            if(arr[i]%2==1){
                array[j]=arr[i];
            j++;}

        arr=array;


        // Write - Your - Code- Here
        return arr; // change this and return the correct result array
    }
}
