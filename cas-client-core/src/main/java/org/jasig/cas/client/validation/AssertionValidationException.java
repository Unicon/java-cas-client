package org.jasig.cas.client.validation;

/**
 * Thrown when assertion validation fails.
 *
 * @author Misagh Moayyed
 */
public class AssertionValidationException extends TicketValidationException {
    private static final long serialVersionUID = 6304299836257355593L;

    /**
     * Constructs an exception with the supplied message.
     *
     * @param string the message
     */
    public AssertionValidationException(final String string) {
        super(string);
    }

    /**
     * Constructs an exception with the supplied message and chained throwable.
     *
     * @param string the message
     * @param throwable the original exception
     */
    public AssertionValidationException(final String string, final Throwable throwable) {
        super(string, throwable);
    }

    /**
     * Constructs an exception with the chained throwable.
     * @param throwable the original exception.
     */
    public AssertionValidationException(final Throwable throwable) {
        super(throwable);
    }
}
