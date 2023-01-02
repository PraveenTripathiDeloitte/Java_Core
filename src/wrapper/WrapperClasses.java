package wrapper;

public class WrapperClasses {
    public static void main(String[] args) {
        int x = 100;
        String y = Integer.toString(x);

        Integer b = new Integer(y);
        b = Integer.valueOf(y);

        Integer c = new Integer(x);
        String d = c.toString();

        int e = Integer.parseInt(d);
    }
}
