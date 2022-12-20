package lt.lhu.service;

import lt.lhu.entity.Note;
import lt.lhu.service.exception.NewServiceException;

public interface NotesCreateService {
	
	void add(Note n) throws NewServiceException;

}
