package LogicalPrograms.Arrays;

public class LargestElement {

    public void largestElement(int[] array) {
        for(int i=0; i<array.length; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 21, 50, 2, 43, 1};
        new LargestElement().largestElement(array);
        System.out.println("Largest Element is: "+array[0]);
    }
}
