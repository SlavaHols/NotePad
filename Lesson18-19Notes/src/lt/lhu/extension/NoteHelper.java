package lt.lhu.extension;

import java.util.List;

import lt.lhu.entity.Note;

public class NoteHelper {

	public static String format(List<Note> records) {

		StringBuilder stringBuilder = new StringBuilder();

		for (Note note : records) {
			stringBuilder.append(note.getDate());
			stringBuilder.append(";");
			stringBuilder.append(note.getTitle());
			stringBuilder.append(";");
			stringBuilder.append(note.getContent());
			stringBuilder.append("\n");
		}
		return stringBuilder.toString();

	}
}
