package org.designpattern.exercise.facade;

import java.util.*;

public class Util {
    public static Iterator sortIterator(Iterator iterator, Comparator comparator) {
        List list = new ArrayList();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }

        Collections.sort(list, comparator);
        return list.iterator();
    }

    public static void printList(Iterator iterator) {
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
