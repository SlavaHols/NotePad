package lt.lhu.view.impl;

public class View {
	public void view(String performance) {

		if (performance == null) {
			System.out.println("No records found");
		} else {

			System.out.println(performance);
			System.out.println(">>>>>");

		}
	}
}
