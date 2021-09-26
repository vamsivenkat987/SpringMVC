package org.example.model;

import lombok.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class TodoData {
    private static int idValue =1;
    private final List<TodoItem> items = new ArrayList<>();

    public TodoData(){
        for (int i=1;i<11;i++){
            addItem(new TodoItem(i+" item", i+" details", LocalDate.now()));
        }
    }


    public List<TodoItem> getItems(){
        return Collections.unmodifiableList(items);
    }
    public void addItem(@NonNull TodoItem item){
//        if (item==null){
//            throw new NullPointerException("Data entered was null");
//        }
        item.setId(idValue);
        items.add(item);
        idValue++;
    }
    public void removeItem(int id){
        ListIterator<TodoItem> itemListIterator = items.listIterator();
        while (itemListIterator.hasNext()){
            TodoItem item = itemListIterator.next();
            if (item.getId() ==id){
                itemListIterator.remove();
                break;
            }
        }
    }
    public TodoItem getItem(int id){
        for (TodoItem item: items){
            if (item.getId() == id){
                return item;
            }
        }
        return null;
    }
    public void updateItem (@NonNull TodoItem updateItem){
        ListIterator<TodoItem> listIterator = items.listIterator();
        while (listIterator.hasNext()){
            TodoItem item = listIterator.next();
            if (item.equals(updateItem)){
                listIterator.set(updateItem);
                break;
            }
        }

    }
}
