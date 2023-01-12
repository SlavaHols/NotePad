package lt.lhu.view.impl;

import java.util.List;

import lt.lhu.entity.Note;
import lt.lhu.view.NoteView;

public class NotesViewImpl implements NoteView {

	@Override
	public void view(List<Note> records) {
		if (records == null || records.size() == 0) {
			System.out.println("Record is empty");
		} else {
			for (int i = 0; i < records.size(); i++) {

				System.out.println(records.get(i).getDate());

				System.out.println(records.get(i).getTitle());

				System.out.println(records.get(i).getContent());

			}
		}
	}
}
