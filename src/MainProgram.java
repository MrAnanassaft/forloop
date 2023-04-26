public class MainProgram {
    public static void main(String[] args) {
        printSomeNumbers();
        printNumbers(20,30);

        System.out.println(sumUp(20,30));
        System.out.println(powerOfTwo(-1));
        System.out.println(sumUpPowerOfTwo(3));
        rectangleStars(10,10);
        rectangleStarsSave(2,3);
        triangleStars(5);
        System.out.println();
        printEvenNumbers(2,8);
        System.out.println(sumUpThree(2,12));
        starThing(8,6);

    }
    public static void printSomeNumbers(){
        for(int i = 6; i < 24; i++){
            System.out.println(i);
        }
    }
    public static void printNumbers(int start, int end){
        for(int i = start; i < end+1; i++){
            System.out.println(i);
        }
    }
    public static int sumUp(int start, int end){
        int a = 0;
        for(int i = start; i < end+1; i++){
            a = a + i;
        }
        return a;
    }

    public static int powerOfTwo(int p){
        if(p >= 0) {
            int number = 1;
            for (int i = 0; i < p; i++) {
                number = number * 2;
            }
            return number;
        }else{
            System.out.println("↓ this number must be greater or equal to 0");
            return p;
        }
    }

    public static int sumUpPowerOfTwo(int n){
        int end = 0;
        for(int i = 0; i < n+1; i++){
            end += powerOfTwo(i);
        }
        return end;
    }

    public static void rectangleStars(int width, int height){
        for(int i = 0; i < height; i++){
            System.out.print("\n");
            for(int j = 0; j < width ; j++){
                System.out.print("*");
            }
        }
    }

    public static void rectangleStarsSave(int width, int height){
        if(width > 0 && height > 0){
            rectangleStars(width,height);
        }
    }

    public static void triangleStars(int width){
        for(int i = 0; i < width; i++){
            System.out.println();
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
        }
    }

    public static void printEvenNumbers(int start, int end){
        for(int i = start; i <= end; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public static int sumUpThree(int von, int bis){
        int sum = 0;
        for(int i = von; i <= bis; i++){
            if(i % 3 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void starThing(int width, int height){
        for(int i = 1; i <= height; i++){
            System.out.println();
            if(i % 2 == 0){
                System.out.print("*");
            }else{
                for(int j = 1; j <= width ; j++){
                    System.out.print("*");
                }
            }
        }
    }
}
