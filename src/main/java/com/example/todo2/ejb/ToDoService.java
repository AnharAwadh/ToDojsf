package com.example.todo2.ejb;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class ToDoService {

private ArrayList<String> list =new ArrayList<>();

public void addNote(String note){

    list.add(note);
}
public List getAllNote(){
    return list;
}

}
