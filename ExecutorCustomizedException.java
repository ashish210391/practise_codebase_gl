package corejava.threads.executorservice;

public class ExecutorCustomizedException extends RuntimeException {

	public ExecutorCustomizedException(String errorMessage) {

		super(errorMessage);
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}

}
