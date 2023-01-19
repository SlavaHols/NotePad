package lt.lhu.controller.impl;

import lt.lhu.controller.Command;
import lt.lhu.controller.NotePerformance;
import lt.lhu.extension.NoteHelper;
import lt.lhu.service.NotesFindService;
import lt.lhu.service.ServiceProvider;
import lt.lhu.service.exception.NewServiceException;

public class SearchByDate implements Command {

	private final char paramDelimeter = ' ';

	@Override
	public NotePerformance execute(String request) {

		ServiceProvider serviceProvider = ServiceProvider.getInstance();
		NotesFindService notesFindService = serviceProvider.getNotesFindService();

		String date = request.substring(request.indexOf(paramDelimeter));

		try {
			return new NotePerformance(10, NoteHelper.format(notesFindService.findByTitle(date)));

		} catch (NewServiceException e) {
			return new NotePerformance(20, "Error!!!");
		}
	}
}
