import java.util.*;

public class CollectionDemos {


    public void example1()
    {
        List list=new ArrayList<>();
        Integer num1=123;//Integer.valueOf("123");// new Integer(123);
        list.add(123);
    }

    public void setsExample()
    {
        Set<String> set=new TreeSet<>();
        set.add("Chief Ozzy De Great, 1st");
        set.add("Maj. Gen Buhari");
        set.add("WBT Ajayi");

        Set<Integer> numbas=new TreeSet<>();
        numbas.add(123);
        numbas.add(234);
    }

}


