package LogicalPrograms.Arrays;

public class DuplicateElements {

    public void duplicate(int[] array) {
        for(int i=0; i<array.length; i++) {
            int counter = 1;
            for(int j=i+1; j<array.length; j++) {
                if(array[i] == array[j] && array[j] != -1) {
                    array[j] = -1;
                    counter++;
                }
            }
            if(counter > 1 && array[i] != -1) {
                System.out.print(array[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 3, 2, 10, 10, 1};
        new DuplicateElements().duplicate(array);
    }
}
