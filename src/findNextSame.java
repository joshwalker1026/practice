public class findNextSame {


    public static int findNextSame(int n){
        int sum = 0;
        int result = n+1;
        sum = findNextSame.getSum(n);

        while (findNextSame.getSum(result)!=sum){
            result+=1;
        }

        return result;
    }

    static int getSum(int n) {
        int sum=0;

        while (n != 0) {
            sum +=n%10;
            n/=10;
        }
        return sum;
    }

    public static void main(String [] args) {

        for(int i=90; i<=100; i++) {
            System.out.println(findNextSame(i));
        }
    }

}
