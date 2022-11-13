package com.example.todo2.view;


import com.example.todo2.ejb.ToDoService;
import lombok.*;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
@AllArgsConstructor
@NoArgsConstructor
@Data
@Named("todocontroller")
public class ToDoController {

    @Inject
    private ToDoService toDoService;

    private String todoInput;



    public void  addNote(String s){

      toDoService.addNote(s);

    }

    public List<String> getAllNote(){
        return toDoService.getAllNote();
    }

}
