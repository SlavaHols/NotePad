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

		if (n == null) {
			throw new NewServiceException("It's empty here");
		}
		try {

			DAOProvider provider = DAOProvider.getInstance();

			NotesDAO notesDAO = provider.getNotesDAO();

			notesDAO.save(n);
		} catch (NewDAOException e) {
			throw new NewServiceException(e);
		}

	}

}