public class Sample11 {
    public static void main(String[] args) {
        System.out.println("1+2 equal" + (1+2));
        System.out.println("3*4 equal" + (3*4));

        int num1 = 2;
        int num2 = 3;
        int sum = num1 + num2;

        System.out.println("variable num1's value is " + num1);
        System.out.println("variable num2's value is " + num2);
        System.out.println(sum);
        num1 = num1 +1;
        System.out.println("variable num1's value is now" + num1);
    }
}