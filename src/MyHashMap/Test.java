package MyHashMap;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        MyHashMap<String, Integer> hashMap = new MyHashMap<String, Integer>();

        System.out.println("put element");
        hashMap.put("first", 1);
        hashMap.put("second", 2);
        hashMap.put("third", 3);
        hashMap.put("fourth", 4);
        hashMap.put("fifth", 5);
        hashMap.put("sixth", 6);
        hashMap.put("seventh", 7);
        hashMap.put("eighth", 8);
        hashMap.put("ninth", 9);
        hashMap.put("ten", 10);
        System.out.println(hashMap);

        System.out.println("size of hashMap");
        System.out.println("hashMap.size() = " + hashMap.size());

        System.out.println("get element by key");
        System.out.println("hashMap.get = " + hashMap.get("ninth"));

        System.out.println("remove element by key");
        hashMap.remove("ten");
        System.out.println(hashMap);

        System.out.println("clear MyHashMap");
        hashMap.clear();
        System.out.println(hashMap);
    }
}
