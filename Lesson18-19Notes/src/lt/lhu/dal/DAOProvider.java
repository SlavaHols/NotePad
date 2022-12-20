package lt.lhu.dal;

	import lt.lhu.dal.impl.FileNotesDAO;

	public final class DAOProvider {
		private static final DAOProvider instance = new DAOProvider();
		
		private NotesDAO notesDAO = new FileNotesDAO() ;     //  не понял как это исправить :Unhandled exception type Exception
		
		
		private DAOProvider()  {}
		
		public NotesDAO getNotesDAO() {
			return notesDAO;
		} 
		
		public static DAOProvider getInstance() {
			return instance;
		}

	}


