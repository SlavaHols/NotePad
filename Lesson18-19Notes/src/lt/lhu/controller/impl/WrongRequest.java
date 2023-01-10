package lt.lhu.controller.impl;

import lt.lhu.controller.Command;
import lt.lhu.controller.NotePerformance;
import lt.lhu.dal.exception.NewDAOException;
import lt.lhu.service.exception.NewServiceException;

public class WrongRequest implements Command {
	@Override
	public NotePerformance execute(String request) throws NewServiceException, NewDAOException {

		return new NotePerformance(20, "Error!!!");
	}
}
