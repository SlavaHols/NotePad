package lt.lhu.service.impl;

import java.time.LocalDateTime;

import lt.lhu.service.NotesValidationService;
import lt.lhu.service.exception.NewServiceException;

public class NotesValidationServiceImpl implements NotesValidationService {

	@Override

	public boolean titleValid(String title) throws NewServiceException {
		if (title != null & title != " " & title != "") {
			return true;
		}
		throw new NewServiceException("Title is not found.");
	}

	@Override

	public boolean contentValid(String content) throws NewServiceException {
		if (content != null & content != " " & content != "") {
			return true;
		}
		throw new NewServiceException("Content is not found.");
	}

	@Override

	public boolean dateValid(LocalDateTime date) throws NewServiceException {
		if (date != null) {
			return true;
		}
		throw new NewServiceException("Set date.");
	}

}
