package Item38;

public class Test {

    public static void main(String[] args) {
        double x = 3.5;
        double y = 4.3;
        test(ExtendOperation.class, x, y);
    }

    private static <T extends Enum<T> & Operation> void test(//신박하다.. 이런거 처음봤다...
        Class<T> opEnumType, double x, double y) {
        for (Operation op : opEnumType.getEnumConstants()) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }
}
