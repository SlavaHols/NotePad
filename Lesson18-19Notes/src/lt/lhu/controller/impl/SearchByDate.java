package lt.lhu.controller.impl;

import lt.lhu.controller.Command;
import lt.lhu.controller.NotePerformance;
import lt.lhu.dal.exception.NewDAOException;
import lt.lhu.extension.NoteHelper;
import lt.lhu.service.exception.NewServiceException;
import lt.lhu.service.impl.NotesFindServiceImpl;

public class SearchByDate implements Command {

	private final char paramDelimeter = ' ';

	@Override
	public NotePerformance execute(String request) throws NewServiceException, NewDAOException {

		String date = request.substring(request.indexOf(paramDelimeter));

		NotesFindServiceImpl service = new NotesFindServiceImpl();

		try {
			return new NotePerformance(10, NoteHelper.toString(service.findByDate(date)));      //The method findByDate(LocalDateTime) in  
                                                                                                // the type NotesFindServiceImpl is not applicable for the arguments (String)
		} catch (NewServiceException e) {
			return new NotePerformance(20, "Error!!!");
		}
	}
}

