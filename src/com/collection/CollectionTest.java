package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionTest {
    public static void main(String[] args) {
        List<Integer>  list=new ArrayList();
        list.add(19);
        list.add(20);
        list.add(22);
  list.forEach(elements -> System.out.println(elements));
    }

}
