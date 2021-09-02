package exceptions;

public class DataBaseException extends RuntimeException{
	
	public DataBaseException(String message, Throwable causa) {
		super(message, causa);
	}
	
	public DataBaseException(String message) {
		super(message);
	}

}
