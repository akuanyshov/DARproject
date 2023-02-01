package Task7;

public class Method {
    public static double findMin(double x, double y, double z){
        return Math.min(Math.min(x,y), z);
    }
    public static double findAverage(double a, double b, double c){
        return (a+b+c)/3;
    }

    public static void findWord(String input){
        if(input.length() != 0) {
            int count = 0;
            count++;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    count++;
                }
            }
        }
    }
    public static int numberOf2s(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == 2) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public static double pentagon(double t){
        return ((1.25)*t*t*1.3773);
    }
    public static int sum(long f){
        int sum = 0;
        while(f!=0){
            sum+= f%10;
            f/=10;
        }
        return sum;
    }
}
