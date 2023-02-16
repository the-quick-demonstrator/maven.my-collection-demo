package com.github.curriculeon;

import java.util.Iterator;

public class MySet<SomeType> {
    private MyArrayList<SomeType> set;
    private SomeType[] array;
    int counter = 0;

    public MySet() {
        set = new MyArrayList<>();
        //array = (SomeType[]) new Object[10];
        //int counter = 0;
    }

    public MySet(SomeType[] valuesToBePopulatedWith) {//Object[] valuesToBePopulatedWith) {
        array = valuesToBePopulatedWith;
        int counter = array.length;

    }

    public void add(SomeType object){
        if (!this.contains(object)){
            if (counter >= array.length){
                SomeType [] update = (SomeType[]) new Object[array.length+5];
                System.arraycopy(array,0, update, 0,array.length);
                array = update;
                array[counter] = object;
            }
            else{
                array[counter] = object;
            }
            counter++;
        }
    }

    public void remove(SomeType objectToRemove) { // This should only remove one index
        SomeType [] update = (SomeType[]) new Object[array.length];
        int index = 0;
        boolean first = true;
        for (SomeType check: array){
            if (check == null){
                break;
            }
            if(!check.equals(objectToRemove) || !first){
                update[index] = check;
                index++;
            }
            else{
                first = false;
                counter--;
            }
        }
        array = update;

    }

    public SomeType get(int indexOfElement) {
        return null;
    } //Should not exist for a set

    public Boolean contains(SomeType objectToCheckFor) {
        for (SomeType check: array){
            if (check.equals(objectToCheckFor)){
                return true;
            }

        }
        return false;
    }

    public Integer size() {
        return counter;
    }

    public Iterator<SomeType> iterator() {
        return null;
    }

}
