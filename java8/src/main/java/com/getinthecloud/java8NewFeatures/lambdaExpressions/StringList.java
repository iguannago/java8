package com.getinthecloud.java8NewFeatures.lambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by davicres on 28/03/2016.
 */
public class StringList {

    private List<String> arrayList = Arrays.asList("Zafra", "MyLittleOne","Fatima", "David");

    public void sort() {
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
    }

    public void sortLambda() {
        Collections.sort(arrayList, (a, b) -> b.compareTo(a)); //just one code line!
    }

    public List<String> getArrayList() {
        return arrayList;
    }

    public static void main(String[] args) {
        StringList stringList = new StringList();
        System.out.println("before sorting: " + stringList.getArrayList());
        stringList.sort();
        System.out.println("after sorting: " + stringList.getArrayList());
    }
}
