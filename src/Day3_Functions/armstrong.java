package Day3_Functions;

public class armstrong {
    static void main(String[] args) {
        for (int i = 100; i < 1000 ; i++) {
            if(i == armStrong(i)){
                System.out.println(i);
            }
        }
    }

    static int armStrong(int num){
        int result = 0;
        while(num > 0){
            int rem = num % 10;
            result = result + (rem*rem*rem);
            num /= 10;
        }
        return  result;
    }
}
