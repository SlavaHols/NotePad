
package lt.lhu.controller;

public class NotePerformance {
	private int situation;

	private String performance;

	public NotePerformance() {
	}

	public NotePerformance(int situation, String performance) {
		this.situation = situation;
		this.performance = performance;
	}

	public NotePerformance(int situation) {
		this.situation = situation;
	}

	public void setSituation(int situation) {
		this.situation = situation;
	}

	public int getSituation() {
		return situation;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	public String getPerformance() {
		return performance;

	}
}