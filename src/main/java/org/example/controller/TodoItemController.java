package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.model.TodoData;
import org.example.model.TodoItem;
import org.example.service.TodoItemService;
import org.example.utils.AttributeNames;
import org.example.utils.Mappings;
import org.example.utils.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Slf4j
@Controller
public class TodoItemController {
    private final TodoItemService todoItemService;
    @Autowired
    public TodoItemController(TodoItemService todoItemService){
        this.todoItemService = todoItemService;
    }

    @ModelAttribute
    public TodoData todoData(){
        return todoItemService.getData();
    }
    @GetMapping(Mappings.ITEMS)
    public String Items(){
        return ViewNames.ITEMS;
    }
    @GetMapping(Mappings.DELETEITEM)
    public String deleteItem(@RequestParam int id){
        todoItemService.removeItem(id);
        return "redirect:/"+Mappings.ITEMS;
    }

    @GetMapping(Mappings.ADDITEM)
    public String addEditItem(@RequestParam(required = false,defaultValue = "-1") int id, Model model){
        log.info("editing id = {}",id);
        TodoItem todoItem = todoItemService.getItem(id);
        if (todoItem==null){
            todoItem = new TodoItem("","", LocalDate.now());
        }
        model.addAttribute(AttributeNames.TODOITEM,todoItem);
        return ViewNames.ADDITEM;
    }
    //bgcolor="#05fafa"
    @PostMapping(Mappings.ADDITEM)
    public String processItem(@ModelAttribute(AttributeNames.TODOITEM) TodoItem todoItem){
        log.info("todoItem from form = {}",todoItem);
        if (todoItem.getId()==0){
            todoItemService.addItem(todoItem);
        }else {
            todoItemService.updateItem(todoItem);
        }
        return "redirect:/"+Mappings.ITEMS;
    }
    @GetMapping(Mappings.VIEWITEM)
    public String viewItem(@RequestParam int id , Model model){
        TodoItem todoItem=todoItemService.getItem(id);
        model.addAttribute(AttributeNames.TODOITEM,todoItem);
        return ViewNames.VIEWITEM;
    }
}
