package com.github.curriculeon;

import java.util.Iterator;

public class MyLinkedList<SomeType> implements MyCollectionInterface<SomeType>{
    private MyNode<SomeType> baseNode;

    public MyLinkedList() {
        baseNode = new MyNode<SomeType>();
    }

    public MyLinkedList(SomeType... valuesToBePopulatedWith) {
        MyNode currentNode = new MyNode<>();
        for (SomeType adders : valuesToBePopulatedWith){
            MyNode nxtNode = new MyNode(adders);
            currentNode.setNext(nxtNode);
        }
    }

    @Override
    public void add(SomeType objectToAdd) {
        if (baseNode == null){
            baseNode = new MyNode<SomeType>(objectToAdd);
        }
        else if (baseNode.getData() == null){
            baseNode.setData(objectToAdd);
        }
        else{
        MyNode<SomeType> currentNode = baseNode;
        while (currentNode != null && currentNode.hasNext()){
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(new MyNode<>(objectToAdd, null));
        }
    }

    @Override
    public void remove(SomeType objectToRemove) {
        if (baseNode.getData().equals(objectToRemove)){
            baseNode = baseNode.getNext();
        }
        MyNode<SomeType> currentNode = baseNode;
        //if (currentNode != null){
            while(currentNode != null){
                if (currentNode.getData().equals(objectToRemove)){
                    if(currentNode.hasNext()){

                    }
                    else{
                        currentNode = null;
                    }
                }
                currentNode = currentNode.getNext();

            }
            /*
            while (currentNode.getData() != null && currentNode.hasNext() && !currentNode.getData().equals(objectToRemove)){
                if (currentNode.getData().equals(objectToRemove)){
                    if (currentNode.hasNext()){
                        currentNode.setNext(currentNode.getNext().getNext());
                    }
                    else{
                        currentNode.setNext(null);
                    }
                    return;
                }
                currentNode = currentNode.getNext();
            }

             */
        //}
    }

    @Override
    public void remove(int indexOfObjectToRemove) {}//Should not exist for linked lists

    @Override
    public SomeType get(int indexOfElement) {
        int index = 0;
        MyNode<SomeType> current = baseNode;
        while(current != null){
            if (index == indexOfElement){
                return current.getData();
            }
            index++;
            current = current.getNext();
        }

        return null;
    } //Should not exist for linked lists

    @Override
    public Boolean contains(SomeType objectToCheckFor) {
        if (baseNode != null){
            MyNode<SomeType> currentNode = baseNode;
            while (currentNode != null){
                if (currentNode.getData().equals(objectToCheckFor)){
                    return true;
                }
                currentNode = currentNode.getNext();
            }
        }
        return false;
    }

    @Override
    public Integer size() {
        MyNode<SomeType> currentNode = baseNode;
        int count = 0;
        while (currentNode != null){
            count++;
            currentNode = currentNode.getNext();
        }
        return count;
    }

    @Override
    public Iterator<SomeType> iterator() {
        return new MyLinkedListIterator<>(this);
    }

    private static class MyLinkedListIterator<SomeType> implements Iterator<SomeType> {
        private MyLinkedList<SomeType> list;
        private MyNode<SomeType> currentNode;

        public MyLinkedListIterator(MyLinkedList<SomeType> list) {
            this.list = list;
            this.currentNode = new MyNode<>();
            this.currentNode.setData(list.get(0)); // this is the head
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public SomeType next() {
            SomeType value = currentNode.getData();
            currentNode = currentNode.getNext();
            return value;
        }
    }
}
