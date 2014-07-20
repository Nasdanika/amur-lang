package org.nasdanika.amur.lang.causality;

public class CausalityException extends RuntimeException {

	public CausalityException(String message) {
		super(message);
	}

	public CausalityException(Throwable cause) {
		super(cause);
	}

	public CausalityException(String message, Throwable cause) {
		super(message, cause);
	}

	public CausalityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
