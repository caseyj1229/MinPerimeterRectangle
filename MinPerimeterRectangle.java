public class MinPerimeterRectangle {
    public static int solution(int N) {
        double sqrt = Math.sqrt(N);
        int x = (int) sqrt;
        if(Math.pow(sqrt,2) == Math.pow(x,2)){
            return x*4;
        }

        int perimeter = Integer.MAX_VALUE;

        for(int i = 1; i*i < N; i++){
            if(N%i == 0){
                perimeter = Math.min(perimeter, (2*((N/i) + i)));
            }
        }

        return perimeter;
    }
}
