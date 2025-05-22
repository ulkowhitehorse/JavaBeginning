package org.example.chapter13;

public class GenericMethodDemo {
    static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y) {
        if (x.length != y.length) return false;

        for(int i = 0; i < x.length; i++) {
            if(!x[i].equals(y[i]))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Integer[] nums = { 1, 2, 3, 4, 5};
        Integer[] nums2 = { 1, 2, 3, 4, 5};
        Integer[] nums3 = { 1, 2, 7, 4, 5};
        Integer[] nums4 = { 1, 2, 3, 4, 5, 6};

        if (arraysEqual(nums, nums))
            System.out.println("nums эквивалентен nums");

        if (arraysEqual(nums, nums3))
            System.out.println("nums эквивалентен nums3");

        if (arraysEqual(nums, nums4))
            System.out.println("nums эквивалентен nums4");

        if (arraysEqual(nums, nums2))
            System.out.println("nums эквивалентен nums2");

        Double[] dvals = {1.1, 2.2, 3.3, 4.4, 5.5};

//        if(arraysEqual(nums, dvals))
//            System.out.println("nums эквивалентен dvals");
    }
}

