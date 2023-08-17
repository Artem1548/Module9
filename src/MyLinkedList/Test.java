package MyLinkedList;

import MyArrayList.MyArrayList;

public class Test {
    public static void main(String[] args) {
        int count = 1000000;
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        System.out.println("Add elements");
        for (int i = 0; i <= count; i++) {
            list.add(i);
        }
        list.add(null);
        System.out.println("list.size = " + list.size());
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(" + count + ") = " + list.get(count));
        list.remove(count / 2);
        System.out.println("list.size() = " + list.size());
        list.clear();
        System.out.println("list.size() = " + list.size());
    }
}
