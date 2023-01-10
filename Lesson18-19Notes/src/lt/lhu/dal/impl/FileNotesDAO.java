package lt.lhu.dal.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lt.lhu.dal.NotesDAO;
import lt.lhu.dal.exception.NewDAOException;
import lt.lhu.entity.Note;

public class FileNotesDAO implements NotesDAO {

	private List<Note> notes = new ArrayList<Note>();

	private static final String SOURCE_PATH = "/notes.txt";

	private static final int CREATION_DATE = 0;

	private static final int TITLE = 1;

	private static final int CONTENT = 2;

	private static final String EMPTY_STRING = "";

	public FileNotesDAO() throws NewDAOException {

		FileReader fileReader = null;
		BufferedReader bufferReader = null;
		try {
			fileReader = new FileReader(SOURCE_PATH);
			bufferReader = new BufferedReader(fileReader);
			String nextReadLine;

			while ((nextReadLine = bufferReader.readLine()) != null) {

				if (nextReadLine != EMPTY_STRING) {
					String[] data = nextReadLine.split(";");
					LocalDateTime dateTime = LocalDateTime.parse(data[CREATION_DATE]);
					Note note = new Note(dateTime, data[TITLE], data[CONTENT]);
					notes.add(note);
				}
			}
		} catch (IOException e) {
			throw new NewDAOException("Row can't be empty: ", e);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			bufferReader.close();                               // Unhandled exception type IOException
		}
	}

	@Override
	public List<Note> load() throws NewDAOException {
		return notes;
	}

	@Override
	public void save(Note note) throws NewDAOException {
		notes.add(note);
		File file = new File(SOURCE_PATH);
		try {
			BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(file, true));

			bufferWriter.write(LocalDateTime.now() + ";" + note.getTitle() + ";" + note.getContent() + "\n");
			bufferWriter.flush();
			bufferWriter.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());

		}

	}
}
