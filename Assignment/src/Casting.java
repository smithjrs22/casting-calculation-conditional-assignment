public class Casting {
    public static void main(String[] args) throws Exception {
        //problem 1
        double a = 112.35;
        int b = (int)a; 
        System.out.println("Double: " + a);
        System.out.println("int: " + b);
        //problem 2
        String stringy = "49";
        int stringNum = Integer.parseInt(stringy);
        System.out.println("The string value is: " + stringy);
        System.out.println("The integer value is: " + stringNum);
    }
}
