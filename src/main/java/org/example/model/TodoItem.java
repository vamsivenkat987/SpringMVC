package org.example.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;


@Data
@EqualsAndHashCode(of = "id")
public class TodoItem {

    private int id;
    private String title;
    private String details;
    private LocalDate date;

    public TodoItem(String title, String details, LocalDate date) {
        this.title = title;
        this.details = details;
        this.date = date;
    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDetails() {
//        return details;
//    }
//
//    public void setDetails(String details) {
//        this.details = details;
//    }
//
//    public LocalDate getDate() {
//        return date;
//    }
//
//    public void setDate(LocalDate date) {
//        this.date = date;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof TodoItem)) return false;
//
//        TodoItem todoItem = (TodoItem) o;
//
//        return id == todoItem.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return id;
//    }
//
//    @Override
//    public String toString() {
//        return "TodoItem{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", details='" + details + '\'' +
//                ", date=" + date +
//                '}';
//    }
}
