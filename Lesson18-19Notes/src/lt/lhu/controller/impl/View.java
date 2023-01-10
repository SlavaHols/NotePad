package lt.lhu.controller.impl;

import lt.lhu.controller.Command;
import lt.lhu.controller.NotePerformance;
import lt.lhu.dal.exception.NewDAOException;
import lt.lhu.service.exception.NewServiceException;

public class View implements Command {
	private final char paramDelimeter = ' ';

	@Override
	public NotePerformance execute(String request) throws NewDAOException, NewServiceException {

		String performance = request.substring(request.indexOf(paramDelimeter) + 1);

		if (performance == "") {
			System.out.println("No data");
		} else {

			System.out.println(performance);
			System.out.println(">>>");

		}

		return new NotePerformance(10);

}
}
