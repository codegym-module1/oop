package integer;

public class MyInteger {
    int value;

    public MyInteger() {
    }

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        if ((value % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOdd() {
        if ((value % 2) != 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isPrime() {
        for (int i = 2; i <= value; i++) {
            if ((value % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isEven(int value) {
        if ((value % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOdd(int value) {
        if ((value % 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPrime(int value) {
        for (int i = 2; i <= value; i++) {
            if ((value % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();

    }

    public boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInteger) {
        return this.value == myInteger.value;
    }

    public static int parseInt(char[] chars) {
        int value = 0;
        for (int i = 0, j = (int)Math.pow(10, chars.length - 1);
             i < chars.length; i++, j /= 10) {
            value += (chars[i]- 48) * j;
        }
        return value;
    }
}
