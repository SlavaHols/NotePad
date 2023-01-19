package lt.lhu.service;

import lt.lhu.service.impl.NotesCreateServiceImpl;
import lt.lhu.service.impl.NotesFindServiceImpl;
import lt.lhu.service.impl.NotesValidationServiceImpl;

public class ServiceProvider {
	
	private static final ServiceProvider instance = new ServiceProvider();

	private final NotesCreateService createService = new NotesCreateServiceImpl();
	private final NotesFindService findService = new NotesFindServiceImpl();
	private final NotesValidationService validService = new NotesValidationServiceImpl();

	private ServiceProvider() {
	}

	public static ServiceProvider getInstance() {
		return instance;
	}

	public NotesCreateService getNotesCreateService() {
		return createService;
	}

	public NotesFindService getNotesFindService() {
		return findService;
	}
	public NotesValidationService getNotesValidationService() {
		return validService;
	}

}
