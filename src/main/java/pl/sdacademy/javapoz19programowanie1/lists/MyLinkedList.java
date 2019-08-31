package pl.sdacademy.javapoz19programowanie1.lists;

public class MyLinkedList {

    private MyLinkedListItem head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(Integer value){
        MyLinkedListItem myLinkedListItem = new MyLinkedListItem(value);

        if(this.head == null){
            this.head = myLinkedListItem;
        } else {
            MyLinkedListItem lastItem = getLastItem();
            lastItem.nextItem = myLinkedListItem;
        }

        size++;
    }
// TODO - obsługa pełnej listy
//    TODO - obsłga błędnego indexu (ArrayIndexOutOfBoundException)
    public Integer get(int index){

       return getElement(index).value;
    }

    private MyLinkedListItem getElement(int index){
        MyLinkedListItem tmpItem = head;

        for (int i = 0; i < index; i++) {
            tmpItem = tmpItem.nextItem;
        }
        return tmpItem;
    }

    public void remove(int index){


//        Będzie trzeba użyć metody getElement
//        1.pobieramy poprzednik elementu index
        MyLinkedListItem toRemove = getElement(index);

//        2. pobieramy element do usunięcia
        MyLinkedListItem previous = getElement(index - 1);

//        3. zmieniamy nextvalue w poprzedniku na nextValue elementu, który usuwamy

        previous.nextItem = toRemove.nextItem;

//        4. w usuwanym elemencie nullujemy nextValue

        toRemove.nextItem = null;

        size--;
    }


    public void add(int index, Integer value){
        MyLinkedListItem toAdd = new MyLinkedListItem(value);
        MyLinkedListItem previousElement = getElement(index - 1);

        toAdd.nextItem = previousElement.nextItem;
        previousElement.nextItem = toAdd;

        size++;

    }

    public int size(){
        return size;
    }

    private MyLinkedListItem getLastItem() {
        MyLinkedListItem tmpItem = this.head;
        while (tmpItem.nextItem != null) {
            tmpItem = tmpItem.nextItem;
        }
        return tmpItem;
    }

    static class MyLinkedListItem{
        private Integer value;
        private MyLinkedListItem nextItem;

        public MyLinkedListItem(Integer value) {
            this.value = value;
        }
    }


}
