package LogicalPrograms.Basic;

public class ArmstrongNumberSeries {

    public void armstrongNumber(int series) {
        for(int i=0; i<series; i++) {
            int length = String.valueOf(i).length();
            String numberToString = String.valueOf(i);
            int spare = 0;
            for(int j=0; j<length; j++) {
                spare = (int) (spare + Math.pow(Character.getNumericValue(numberToString.charAt(j)), length));
            }
            if(spare == i) {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {

        new ArmstrongNumberSeries().armstrongNumber(100000);
    }
}
