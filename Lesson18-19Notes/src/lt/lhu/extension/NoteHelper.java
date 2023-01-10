package lt.lhu.extension;

import java.util.List;

import lt.lhu.entity.Note;

public class NoteHelper {
	public static String toString(List<Note> records) {
		StringBuilder sb = new StringBuilder();
		for (Note note : records) {
			sb.append(note.getDate());
			sb.append(";");
			sb.append(note.getTitle());
			sb.append(";");
			sb.append(note.getContent());
			sb.append("\n");
		}
		return sb.toString();

	}
}
