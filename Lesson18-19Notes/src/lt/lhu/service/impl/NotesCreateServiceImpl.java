package lt.lhu.service.impl;

import lt.lhu.dal.DAOProvider;
import lt.lhu.dal.NotesDAO;
import lt.lhu.dal.exception.NewDAOException;
import lt.lhu.entity.Note;
import lt.lhu.service.NotesCreateService;
import lt.lhu.service.exception.NewServiceException;

public class NotesCreateServiceImpl implements NotesCreateService {

	@Override
	public void add(Note note) throws NewServiceException {

		DAOProvider provider = DAOProvider.getInstance();

		NotesDAO notesDAO = provider.getNotesDAO();

		NotesValidationServiceImpl validation = new NotesValidationServiceImpl();

		if (validation.dateValid(note.getDate()) & validation.titleValid(note.getTitle())
				& validation.contentValid(note.getContent())) {

			try {
				notesDAO.save(note);
			} catch (NewDAOException e) {
				throw new NewServiceException(e);
			}

		}

	}
}