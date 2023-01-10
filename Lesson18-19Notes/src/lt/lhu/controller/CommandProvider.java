package lt.lhu.controller;

import java.util.HashMap;
import java.util.Map;

import lt.lhu.controller.impl.Save;
import lt.lhu.controller.impl.SearchByContent;
import lt.lhu.controller.impl.SearchByDate;
import lt.lhu.controller.impl.SearchByTitle;
import lt.lhu.controller.impl.View;
import lt.lhu.controller.impl.WrongRequest;

public class CommandProvider {
	private final Map<NameCommand, Command> repository = new HashMap();

	CommandProvider() {
		repository.put(NameCommand.SAVE, new Save());
		repository.put(NameCommand.SEARCH_BY_TITLE, new SearchByTitle());
		repository.put(NameCommand.SEARCH_BY_DATE, new SearchByDate());
		repository.put(NameCommand.SEARCH_BY_CONTENT, new SearchByContent());
		repository.put(NameCommand.VIEW, new View());
		repository.put(NameCommand.WRONG_REQUEST, new WrongRequest());
	}

	Command getCommand(String name) {
		NameCommand nameCommand = null;
		Command command = null;

		try {
			nameCommand = NameCommand.valueOf(name.toUpperCase());
			command = repository.get(nameCommand);
		} catch (IllegalArgumentException e) {
			command = repository.get(NameCommand.WRONG_REQUEST);
		}
		return command;

}
}
