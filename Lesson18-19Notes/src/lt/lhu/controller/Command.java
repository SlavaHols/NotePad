package lt.lhu.controller;

import lt.lhu.dal.exception.NewDAOException;
import lt.lhu.service.exception.NewServiceException;

public interface Command {
	
	public NotePerformance execute (String request) throws NewDAOException, NewServiceException;

}
