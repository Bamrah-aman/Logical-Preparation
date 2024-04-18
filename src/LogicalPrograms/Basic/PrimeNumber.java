package LogicalPrograms.Basic;

public class PrimeNumber {

    public void primeNumber(int length) {
        boolean flag = false;
        for(int i=2; i<length; i++){
            for(int j=2; j<i; j++) {
                if(i <= 1);
                else {
                    if (i % j == 0) {
                        flag = true;
                        break;
                    }
                }
            }
            if(flag){
                flag = false;
            }else {
                System.out.print(i+" ");
                flag = false;
            }
        }
    }

    public static void main(String[] args) {
        new PrimeNumber().primeNumber(100);
    }
}
