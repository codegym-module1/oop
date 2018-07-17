package integer;

public class MyIntegerTest {
    public static void main(String[] args) {
        MyInteger soNgauNhien = new MyInteger(15);
        System.out.println(soNgauNhien.getValue() + " is prime? " + soNgauNhien.isPrime());
        System.out.println(soNgauNhien.getValue() + " is even? " + soNgauNhien.isEven());
        System.out.println(soNgauNhien.getValue() + " is odd? " + soNgauNhien.isOdd());
    }
}
