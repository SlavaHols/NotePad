package lt.lhu.dal;

import lt.lhu.dal.exception.NewDAOException;
import lt.lhu.dal.impl.FileNotesDAO;

public final class DAOProvider {
	private static final DAOProvider instance = new DAOProvider();

	private NotesDAO notesDAO;

	private DAOProvider() {
		try {
			notesDAO = new FileNotesDAO();       
			
		} catch (NewDAOException e) {
			
			throw new RuntimeException(" ");
		}
	}

	public NotesDAO getNotesDAO() {
		return notesDAO;
	}

	public static DAOProvider getInstance() {
		return instance;
	}

}
