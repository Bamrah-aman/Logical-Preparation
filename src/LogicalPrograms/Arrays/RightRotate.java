package LogicalPrograms.Arrays;

public class RightRotate {

    public static void main(String[] args) {
        int[] array = {1, 2, 21, 4, 5};
        new RightRotate().rotate(array, 3);
        for(int i : array) {
            System.out.print(i+" ");
        }
    }

    private void rotate(int[] array, int rotate) {
        //Making the two sublist by swapping the element
        reverse(array, 0, array.length - 1);
        for(int i : array) {
            System.out.println(i+" ");
        }
        //Now swapping the element in subarray i.e. start 0 and end rotate-1
        reverse(array, 0, rotate-1);
        //Now again swapping the elements in subarray i.e. start rotate and end array.length -1
        reverse(array, rotate, array.length -1);

    }

    public void reverse(int[] array, int start, int end) {
        while(start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}

