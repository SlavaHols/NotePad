package lt.lhu.service;

import java.time.LocalDateTime;

import lt.lhu.service.exception.NewServiceException;

public interface NotesValidationService {

	boolean titleValid(String title) throws NewServiceException;

	boolean contentValid(String content) throws NewServiceException;

	boolean dateValid(LocalDateTime date) throws NewServiceException;

}
