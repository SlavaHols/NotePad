package lt.lhu.controller;

public class Controller {
	
	private final CommandProvider provider = new CommandProvider();
	private final char paramDelimeter = ' ';

	public NotePerformance executeTask(String request)  {
		NotePerformance performance;
		String nameCommand;
		Command executionCommand;
		nameCommand = request.substring(0, request.indexOf(paramDelimeter));
		executionCommand = provider.getCommand(nameCommand);

		performance =  executionCommand.execute(request);
		return performance;
			
		}

	}

