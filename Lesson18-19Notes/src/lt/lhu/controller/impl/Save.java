package lt.lhu.controller.impl;

import java.time.LocalDateTime;

import lt.lhu.controller.Command;
import lt.lhu.controller.NotePerformance;
import lt.lhu.dal.DAOProvider;
import lt.lhu.dal.NotesDAO;
import lt.lhu.dal.exception.NewDAOException;
import lt.lhu.entity.Note;


public class Save implements Command {

	private final char paramDelimeter = ' ';

	private static final int TITLE = 0;

	private static final int CONTENT = 1;

	@Override
	public NotePerformance execute(String request) throws NewDAOException {

		String dataRaw = request.substring(request.indexOf(paramDelimeter));

		String[] data = dataRaw.split(";");
		LocalDateTime dateTime = LocalDateTime.now();
		Note note = new Note(dateTime, data[TITLE], data[CONTENT]);

		DAOProvider provider = DAOProvider.getInstance();

		NotesDAO notesDAO = provider.getNotesDAO();

		try {
			notesDAO.save(note);
			return new NotePerformance(10, "OK");

		} catch (NewDAOException e) {
			return new NotePerformance(20, "Error!!!");
		}
	}
}
