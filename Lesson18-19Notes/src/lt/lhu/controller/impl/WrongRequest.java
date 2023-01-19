package lt.lhu.controller.impl;

import lt.lhu.controller.Command;
import lt.lhu.controller.NotePerformance;

public class WrongRequest implements Command {
	
	@Override
	public NotePerformance execute(String request)  {

		return new NotePerformance(20, "Error!!!");
	}
}
