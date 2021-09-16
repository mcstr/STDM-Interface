import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        TestClass test = new TestClass<Object>();

        test.array = new int[] {1,2,3,4,5,6,7,8,9,10};

        // test.arrayAusgeben(test.array);
        // test.arrayLength(test.array);
        test.arrayTotalCount(test.array);
    }
}
