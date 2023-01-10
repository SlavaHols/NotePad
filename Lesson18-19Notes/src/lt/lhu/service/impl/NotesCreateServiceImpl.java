package lt.lhu.service.impl;

import lt.lhu.dal.DAOProvider;
import lt.lhu.dal.NotesDAO;
import lt.lhu.dal.exception.NewDAOException;
import lt.lhu.entity.Note;
import lt.lhu.service.NotesCreateService;
import lt.lhu.service.exception.NewServiceException;

public class NotesCreateServiceImpl implements NotesCreateService {

	@Override
	public void add(Note n) throws NewServiceException {

		DAOProvider provider = DAOProvider.getInstance();

		NotesDAO notesDAO = provider.getNotesDAO();

		NotesValidationServiceImpl validation = new NotesValidationServiceImpl();

		if (validation.dateValid(n.getDate()) & validation.titleValid(n.getTitle())
				& validation.contentValid(n.getContent())) {

			try {
				notesDAO.save(n);
			} catch (NewDAOException e) {
				throw new NewServiceException(e);
			}

		}

	}
}