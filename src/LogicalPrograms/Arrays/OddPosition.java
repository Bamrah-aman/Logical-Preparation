package LogicalPrograms.Arrays;

public class OddPosition {

    public void print(int[] array) {
        for(int i=0; i<array.length; i = i+2) {
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        new OddPosition().print(array);
    }
}
