package lt.lhu.service;

import java.time.LocalDateTime;
import java.util.List;
import lt.lhu.entity.Note;
import lt.lhu.service.exception.NewServiceException;

public interface NotesFindService {
	
	List<Note> findByTitle(String title) throws NewServiceException;

	List<Note> findByContent(String content) throws NewServiceException;

	List<Note> findByDate(LocalDateTime date) throws NewServiceException;

}
