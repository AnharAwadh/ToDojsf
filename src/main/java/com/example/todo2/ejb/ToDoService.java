package com.example.todo2.ejb;

import com.example.todo2.data.Note;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class ToDoService {

private ArrayList<Note> list =new ArrayList<>();

public void addNote(String note){
    Note newNote = new Note();
    newNote.setContent(note);
    newNote.setIsDone(false);
    list.add(newNote);
}
public List<Note> getAllNote(){
    return list;
}

}
