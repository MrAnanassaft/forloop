public class MainProgram {
    public static void main(String[] args) {
        printSomeNumbers();
        printNumbers(20,30);

        System.out.println(sumUp(20,30));
        System.out.println(powerOfTwo(2));
        System.out.println(sumUpPowerOfTwo(3));
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



}
