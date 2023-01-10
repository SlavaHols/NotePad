package lt.lhu.controller.impl;

import lt.lhu.controller.Command;
import lt.lhu.controller.NotePerformance;
import lt.lhu.dal.exception.NewDAOException;
import lt.lhu.extension.NoteHelper;
import lt.lhu.service.exception.NewServiceException;
import lt.lhu.service.impl.NotesFindServiceImpl;

public class SearchByTitle implements Command {
	private final char paramDelimeter = ' ';

	@Override
	public NotePerformance execute(String request) throws NewDAOException, NewServiceException {

		String title = request.substring(request.indexOf(paramDelimeter));

		NotesFindServiceImpl service = new NotesFindServiceImpl();

		try {
			return new NotePerformance(10, NoteHelper.toString(service.findByTitle(title)));

		} catch (NewServiceException e) {
			return new NotePerformance(20, "Error!!!");
		}
	}
}
