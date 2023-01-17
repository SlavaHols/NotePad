package lt.lhu.controller;

import lt.lhu.service.exception.NewServiceException;

public class Controller {
	
	private final CommandProvider provider = new CommandProvider();
	private final char paramDelimeter = ' ';

	public NotePerformance executeTask(String request) throws NewServiceException  {
		String nameCommand;
		Command executionCommand;
		nameCommand = request.substring(0, request.indexOf(paramDelimeter));
		executionCommand = provider.getCommand(nameCommand);

		try {
			return executionCommand.execute(request);
		} catch (NewServiceException e) {
			throw new NewServiceException(e);
			
		}

	}
}
