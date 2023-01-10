package lt.lhu.main;

import lt.lhu.controller.Controller;
import lt.lhu.controller.NotePerformance;


public class Main {
	public static void main(String[] args) throws Exception {
		Controller controller = new Controller();

		NotePerformance performance = controller.executeTask("save New title from controller; Content from controller");
		controller.executeTask("VIEW " + performance.getPerformance());

		performance = controller.executeTask("SEARCH_BY_TITLE ");
		controller.executeTask("VIEW " + performance.getPerformance());

		performance = controller.executeTask("SEARCH_BY_CONTENT ");
		controller.executeTask("VIEW " + performance.getPerformance());

		performance = controller.executeTask("SEARCH_BY_DATE ");
		controller.executeTask("VIEW " + performance.getPerformance());


	}
}
