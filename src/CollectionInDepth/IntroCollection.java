package CollectionInDepth;

import java.awt.*;
import java.util.ArrayList;

class container<T extends Number>{
    T value;
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show(){

        System.out.println(value.getClass().getName());

    }
    public void demo(ArrayList<? extends T> obj){

    }

}


public class IntroCollection{

     public static void main(String[] args){

         //Container<Integer> obj=new Container<>();
         //obj.show();


     }

}
