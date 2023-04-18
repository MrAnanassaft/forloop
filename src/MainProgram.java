public class MainProgram {
    public static void main(String[] args) {
        //printSomeNumbers();
        printNumbers(20,30);

        System.out.println(sumUp(20,30));
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

}
