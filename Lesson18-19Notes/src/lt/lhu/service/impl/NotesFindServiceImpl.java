package lt.lhu.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lt.lhu.dal.DAOProvider;
import lt.lhu.dal.NotesDAO;
import lt.lhu.dal.exception.NewDAOException;

import lt.lhu.entity.Note;
import lt.lhu.service.NotesFindService;
import lt.lhu.service.exception.NewServiceException;

public  class NotesFindServiceImpl implements NotesFindService {

	@Override
	public List<Note> findByTitle(String title) throws NewServiceException {

		DAOProvider provider = DAOProvider.getInstance();

		NotesDAO notesDAO = provider.getNotesDAO();

		List<Note> sourceList;
		try {
			sourceList = notesDAO.load();

		} catch (NewDAOException e) {

			throw new NewServiceException(e);
		}

		List<Note> foundData = new ArrayList<>();

		NotesValidationServiceImpl validation = new NotesValidationServiceImpl();

		if (validation.titleValid(title)) {

			for (Note Note : sourceList) {

				if (Note.getTitle().contains(title)) {

					foundData.add(Note);
				}
			}
		}
		return foundData;
	}

	@Override
	public List<Note> findByContent(String content) throws NewServiceException {

		DAOProvider provider = DAOProvider.getInstance();

		NotesDAO notesDAO = provider.getNotesDAO();

		List<Note> sourceList;

		try {
			sourceList = notesDAO.load();

		} catch (NewDAOException e) {

			throw new NewServiceException(e);
		}
		List<Note> foundData = new ArrayList<>();

		NotesValidationServiceImpl validation = new NotesValidationServiceImpl();

		if (validation.contentValid(content)) {

			for (Note Note : sourceList) {

				if (Note.getContent().contains(content)) {
					foundData.add(Note);
				}
			}
		}
		return foundData;
	}

	@Override 
	
	public List<Note> findByDate(LocalDateTime date) throws NewServiceException {

		DAOProvider provider = DAOProvider.getInstance();

		NotesDAO notesDAO = provider.getNotesDAO();

		List<Note> sourceList;
		try {
			sourceList = notesDAO.load();

		} catch (NewDAOException e) {

			throw new NewServiceException(e);
		}
		List<Note> foundData = new ArrayList<>();

		NotesValidationServiceImpl validation = new NotesValidationServiceImpl();
		if (validation.dateValid(date) & validation.dateValid(date)) {
			for (Note Note : sourceList) {

				if (Note.getDate().equals(date)) {
					foundData.add(Note);
				}
			}
		}
		return foundData;
	}
}