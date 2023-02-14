package com.github.curriculeon;

public class MyMap<KeyType, ValueType> implements MyMapInterface<KeyType, ValueType> {
    private MyArrayList<KeyValue<KeyType, ValueType>> myArrayList;

    public MyMap() {
        this.myArrayList = new MyArrayList<>();
    }

    public MyMap(MyArrayList<KeyValue<KeyType, ValueType>> myArrayList) {
        this.myArrayList = myArrayList;
    }

    @Override
    public void put(KeyType key, ValueType value) {
        KeyValue keyValue = new KeyValue(key, value);
        myArrayList.add(keyValue);
    }

    @Override
    public ValueType get(KeyType key) {
        for (KeyValue<KeyType, ValueType> keyValue : myArrayList) {
            KeyType currentKey = keyValue.getKey();
            boolean isCorrectKey = currentKey.equals(key);
            if (isCorrectKey) {
                ValueType currentValue = keyValue.getValue();
                return currentValue;
            }
        }
        return null;
    }

    @Override
    public MySet<KeyType> getKeySet() {
        return null;
    }

    @Override
    public MyCollectionInterface<ValueType> getValues() {
        return null;
    }

    @Override
    public MySet<KeyValue<KeyType, ValueType>> getList() {
        return null;
    }

    @Override
    public MyMapInterface<ValueType, KeyType> invert() {
        return null;
    }
}
