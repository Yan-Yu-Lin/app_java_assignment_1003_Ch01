public class Sample12 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        System.out.println("num1 and num2's math");
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));

        int a = 0;
        int b = 0;
        int c = 0;

        b = a++;
        c = ++a;
        System.out.println("value assign to b before +1, so b's value is " + b);
        System.out.println("value assign to c before +1, so c's value is " + c);
    }
}