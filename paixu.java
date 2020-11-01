import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class paixu {


    public static void sort(ArrayList<Number> list)
    {
        Collections.sort(list, new Comparator<Number>() {
            @Override
            public int compare(Number o1, Number o2)  {if(o1.doubleValue()>o2.doubleValue()) {return 1; }
            return -1;
            }
        });
    }

    public static void main(String[] args){
        ArrayList<Number> l1=new ArrayList<Number>();
        l1.add(1);
        l1.add(15);
        l1.add(2);
        l1.add(8);
        sort(l1);
        System.out.println(l1);

    }

}
