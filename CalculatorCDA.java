package calculatorcda;

public class CalculatorCDA {
    String name = "Buddy";
    int keys = 19;

    public static void main(String[] args) {
        add(5,6);
        subtract(5,6);
        divide(10,2);
        multiply(1,10);
    }
    
    public static int add(int x, int y){
        int total = x + y;
        System.out.println(total);
        return total;
    }
    public static int subtract(int x, int y){
        int total = x - y;
        System.out.println(total);
        return total;
    }
    public static int divide(int x, int y){
        int total = x / y;
        System.out.println(total);
        return total;
    }
    public static int multiply(int x, int y){
        int total = x * y;
        System.out.println(total);
        return total;
    }
    
}
