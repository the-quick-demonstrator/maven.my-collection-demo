package com.github.curriculeon;

import java.util.Iterator;

public class MyArrayList<SomeType> implements MyCollectionInterface<SomeType>{
    public MyArrayList() {
    }

    public MyArrayList(SomeType[] valuesToBePopulatedWith) {
    }

    @Override
    public void add(SomeType objectToAdd) {
        // TODO
    }

    @Override
    public void remove(SomeType objectToRemove) {
        // TODO
    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        // TODO
    }

    @Override
    public SomeType get(int indexOfElement) {
        return null;// TODO
    }

    @Override
    public Boolean contains(SomeType objectToCheckFor) {
        return null;// TODO
    }

    @Override
    public Integer size() {
        return null;// TODO
    }

    @Override
    public Iterator<SomeType> iterator() {
        return new MyArrayListIterator<>(this);
    }

    public static class MyArrayListIterator<SomeType> implements Iterator<SomeType> {
        private MyArrayList<SomeType> list;
        private int currentIndex;

        public MyArrayListIterator(MyArrayList<SomeType> list) {
            this.list = list;
            this.currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < list.size();
        }

        @Override
        public SomeType next() {
            return list.get(currentIndex++);
        }
    }
}
