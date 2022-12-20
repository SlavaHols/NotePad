package lt.lhu.service.exception;

public class NewServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	public NewServiceException() {
		super();
	}

	public NewServiceException(String message) {
		super(message);
	}

	public NewServiceException(Exception e) {
		super(e);
	}

	public NewServiceException(String message, Exception e) {
		super(message, e);
	}
}
