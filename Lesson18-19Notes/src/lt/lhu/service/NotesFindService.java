package lt.lhu.service;

import java.util.Date;
import java.util.List;

import lt.lhu.entity.Note;
import lt.lhu.service.exception.NewServiceException;

public interface NotesFindService {

	List<Note> findByContent(String content) throws NewServiceException;

	List<Note> findByDate(Date date) throws NewServiceException;

}
