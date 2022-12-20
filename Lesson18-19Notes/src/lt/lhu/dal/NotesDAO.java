 package lt.lhu.dal;

import java.util.List;

import lt.lhu.dal.exception.NewDAOException;
import lt.lhu.entity.Note;

public interface NotesDAO {
	
    List<Note> load() throws NewDAOException;
    
    void save(Note note) throws NewDAOException;
}


