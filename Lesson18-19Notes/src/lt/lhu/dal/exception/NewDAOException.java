package lt.lhu.dal.exception;


@SuppressWarnings("serial")
public class NewDAOException extends Exception {
	
	public NewDAOException (String message) {
		super(message);
	}
	public NewDAOException () {
		super();
	}
	public NewDAOException (Exception e) {
		super(e);
	}
	public NewDAOException (String message, Exception e) {
		super(message, e);
	}

}
