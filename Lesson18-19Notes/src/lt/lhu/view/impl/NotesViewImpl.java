package lt.lhu.view.impl;

import java.util.List;

import lt.lhu.view.NoteView;

public class NotesViewImpl implements NoteView {     //The type NotesViewImpl must implement the inherited abstract method NoteView.view(List<Note>)

	@Override
	public void view(List<Note> records) {                   // The method view(List<Note>) of type NotesViewImpl must override or implement a supertype method

		if (records == null || records.size() == 0) {
			System.out.println("No records found");
		} else {
			for (int i = 0; i < records.size(); i++) {
				System.out.println(records.get(i).getDate());
				System.out.println(records.get(i).getTitle());
				System.out.println(records.get(i).getContent());
				System.out.println(">>>");

			}
		}
	}
}
