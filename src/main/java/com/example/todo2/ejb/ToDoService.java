package com.example.todo2.ejb;

import com.example.todo2.data.Note;

import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class ToDoService {

    @PersistenceContext(type= PersistenceContextType.EXTENDED,unitName = "mysql")
    EntityManager em;

    @Transactional
    public void addNote(String note){
    Note newNote = new Note();
    newNote.setContent(note);
    newNote.setIsDone(false);
    em.persist(newNote);
    em.flush();
}
public List getAllNote(){
    return em.createQuery("Select t from " + Note.class.getSimpleName() + " t").getResultList();

}

    @Transactional
    public void udate(Note note) {
        em.merge(note);
        em.flush();
    }
}
