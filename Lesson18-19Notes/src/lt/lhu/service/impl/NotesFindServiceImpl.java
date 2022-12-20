package lt.lhu.service.impl;

import java.util.Date;
import java.util.List;

import lt.lhu.dal.DAOProvider;
import lt.lhu.dal.NotesDAO;
import lt.lhu.dal.exception.NewDAOException;
import lt.lhu.dal.impl.FileNotesDAO;
import lt.lhu.entity.Note;
import lt.lhu.service.NotesFindService;
import lt.lhu.service.exception.NewServiceException;

public class NotesFindServiceImpl implements NotesFindService {

	@Override
	public List<Note> findByContent(String content) throws NewServiceException {

		if (content == null) {
			throw new NewServiceException("Content not found.");
		}
		try {

			DAOProvider provider = DAOProvider.getInstance();

			NotesDAO notesDAO = provider.getNotesDAO();

			List<Note> sourceList = notesDAO.load(); // лампочка : The value of the local variable sourceList is not used.
													

			return null;
		} catch (NewDAOException e) {
			throw new NewServiceException(e);
		}
	}

	@Override
	public List<Note> findByDate(Date date) throws NewServiceException {

		if (date == null) {
			throw new NewServiceException("Date not found. ");
		}
		try {

			DAOProvider provider = DAOProvider.getInstance();

			NotesDAO notesDAO = provider.getNotesDAO();

			List<Note> sourceList = notesDAO.load(); // лампочка : The value of the local variable sourceList is not used.
														

			return null;
		} catch (NewDAOException e) {
			throw new NewServiceException(e);
		}
	}
}