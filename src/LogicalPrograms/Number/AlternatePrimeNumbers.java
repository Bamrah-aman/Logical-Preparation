package LogicalPrograms.Number;

public class AlternatePrimeNumbers {

    public void alternatePrimeNumbers(int range) {
        boolean flag = false;
        int counter = 2;
        for(int i=0; i<=range; i++) {
            if(i == 0 || i == 1){
                continue;
            }else {
                for(int j=2; j<i; j++) {
                    if(i % j == 0) {
                        flag = true;
                        break;
                    }
                }
            }
            if(flag == true) {
                flag = false;
            }else{
                if(counter % 2 == 0)
                System.out.print(i+" ");
                counter++;
            }
        }
    }
    public static void main(String[] args) {
        new AlternatePrimeNumbers().alternatePrimeNumbers(230);
    }
}
