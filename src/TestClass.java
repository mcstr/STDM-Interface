import java.lang.reflect.Array;
import java.util.Enumeration;

public class TestClass<E> implements ArrayInterface, Enumeration {
    public int[] array = new int[10]; 
    public int counter = 0;


    @Override
    public boolean hasMoreElements(){
      return this.counter < this.array.length;
    };

    @Override
    public Object nextElement() {
        return Array.get(this.array, counter++);

    };

    @Override
    public void arrayAusgeben(int[] array) {
        this.counter = 0;
        while(this.hasMoreElements()) {
            Integer i = (Integer) nextElement();
            System.out.println(i);
        }
    };

    @Override
    public void arrayLength(int[] array) {
        System.out.println(array.length);
    };

    @Override
    public void arrayTotalCount(int[] array) {
        this.counter = 0;
        int result = 0;
        while (this.hasMoreElements()) { 
            result += (Integer) nextElement();
        }
        System.out.println(result);

    };

}