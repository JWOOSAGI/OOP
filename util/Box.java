package util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Box <T>{
    private Map<String, T> box;

    public Box(){
        this.box = new HashMap<>();
    }
    public T put(String s, T t) {
        return box.put(s,t);
    }
    public T get(String s){
        return box.get(s);
    }
    public int size(){
        return box.size();
    }
    public void clear(){
        box.clear();
    }
    public void put(List<String> keys, Inventory<T> values){
        box = new HashMap<>();
        for(int i = 0 ; i<keys.size();i++){
            box.put(keys.get(i), values.get(i));
        }
        box.forEach((k,v)-> System.out.println(String.format("%s : %s",k,v)));
    }
}
