package warmup;

public class Main {

    public static void main(String[] args) {
        // Your code here.
        System.out.println(sum(1000));

    }
    static int sum (int limit) {
        int total=0;
        for (int i = 1; i<limit; i++){
            if (i%3==0 || i%5==0){
                total+=i;
            }
        }
        return total;
    }
}
