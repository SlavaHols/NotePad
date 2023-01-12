package lt.lhu.view.impl;

public class View {
	public void view(String performance) {

		if (performance == null) {
			System.out.println("Record is empty");
		} else {

			System.out.println(performance);

		}
	}
}
