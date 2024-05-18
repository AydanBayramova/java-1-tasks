package module01.Part02.collections;

import java.util.*;

public class map {
    public static void main(String[] args) {
        Map<Integer,String> info=new HashMap<>();
        info.put(3,"guuy");
        info.entrySet();
       // System.out.println(info);
        Collection<String> birds=new ArrayList<>();
        System.out.println(birds.add("birds"));
        System.out.println(birds.add("birds"));
        System.out.println("------------------");
        birds.add("Aa");
        birds.add("Aa");
        System.out.println(birds);
        System.out.println("---------");
        System.out.println(birds.remove("Aa"));
        System.out.println(birds.remove("jj"));
        System.out.println("------------------------------");
        List<Integer> num=List.of(2,4);
        List<Integer> num2=List.of(4,2);
        System.out.println(num.equals(num2));
        System.out.println(num2.equals(num));
       Set<Integer> set1=Set.of(2,4);
        Set<Integer> set2=Set.of(4,2);
        System.out.println(set1.equals(set2));
        System.out.println("-------------------");
        var heights = new ArrayList<Integer>();
         heights.add(null);
        Integer h = heights.get(0);
        System.out.println("--------------------");
        var arraylist=new ArrayList<String>();
        arraylist.add("A");
      //  arraylist.add(" ");
        arraylist.add("Aa");
        for (String a : arraylist) {
            System.out.println(a);

        }
        var list=new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(5);
        list.remove(1);
        System.out.println(list.remove(Integer.valueOf(1)));
        System.out.println(list);
        System.out.println("-------------------------------------");
        Integer array[]=new Integer[]{2,3,4,5,6};
        List<Integer> numbers=Arrays.asList(array);
    List<Integer> numbers2=List.of(array);
    //List<Integer> numbers3=List.copyOf(array);
        System.out.println("-------------------");
        List<String> names=new ArrayList<>();
        names.add("aa");
        names.add("bgy");
        names.add("qq");
        Object[] arrayCreate=names.toArray();
        String[] arrayString=names.toArray(new String[0]);
        System.out.println(arrayString.length);
        System.out.println(arrayString.length);




    }
}
