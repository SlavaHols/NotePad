package lt.lhu.controller;

import lt.lhu.dal.exception.NewDAOException;
import lt.lhu.service.exception.NewServiceException;

public class Controller {
	
	private final CommandProvider provider = new CommandProvider();
	private final char paramDelimeter = ' ';

	public NotePerformance executeTask(String request) throws NewDAOException, NewServiceException {
		String nameCommand;
		Command executionCommand;
		nameCommand = request.substring(0, request.indexOf(paramDelimeter));
		executionCommand = provider.getCommand(nameCommand);

		return executionCommand.execute(request);

	}
}
