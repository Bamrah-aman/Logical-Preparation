package LogicalPrograms.Arrays;

public class FrequencyOfEachElement {

    public void frequencyOfElement(int[] array) {
        int counter = 1;

        for(int i=0; i<array.length; i++) {
            counter = 1;
            for(int j=i+1; j<array.length; j++) {
                if(array[i] == array[j] && array[j] != -1){
                    array[j] = -1;
                    counter++;
                }
            }
            if(!(array[i] == -1))
            System.out.println(array[i]+" "+counter);
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 1, 2, 3, 1, 10, 12};
        new FrequencyOfEachElement().frequencyOfElement(array);
    }
}
