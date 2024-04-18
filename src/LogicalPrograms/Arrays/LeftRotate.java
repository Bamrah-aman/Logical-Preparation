package LogicalPrograms.Arrays;

public class LeftRotate {

    public void rotate(int[] array, int rotate) {
        //Left Rotate is similar to Right Rotate The order of
        //calling method is diffenet just call the first method at the last
        reverse(array, 0, rotate -1);
        reverse(array, rotate, array.length -1);
        reverse(array, 0, array.length - 1);
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
    public static void main(String[] args) {
        int[] array = {1,0, 4, 5, 7, 9};
        new LeftRotate().rotate(array, 2);
        for(int i : array) {
            System.out.print(i+" ");
        }
    }
}
