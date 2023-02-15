package com.github.curriculeon;

public class MyNode<SomeType> {
    private SomeType data;
    private MyNode<SomeType> next;

    public MyNode() {
        data = null;
        next = null;
    }
    public MyNode(SomeType data) {
        setData(data);
        next = null;
    }

    public MyNode(SomeType data, MyNode<SomeType> next) {
        setData(data);
        setNext(next);
    }

    public SomeType getData() {
        return data;
    }

    public void setData(SomeType data) {
        this.data = data;
    }

    public MyNode<SomeType> getNext() {
        return next;
    }

    public void setNext(MyNode<SomeType> next) {
        try{
            this.next = next;}
        catch (Exception e){
            System.out.println("NOOOOO");
        }
    }
}
