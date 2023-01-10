package lt.lhu.controller;

public class NotePerformance {
	private int position;

	private String performance;

	public NotePerformance() {
	}

	public NotePerformance(int position, String performance) {
		this.position = position;
		this.performance = performance;
	}

	public NotePerformance(int position) {
		this.position = position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getPosition() {
		return position;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	public String getPerformance() {
		return performance;

	}
}
