package org.jasig.cas.client.validation;

/**
 * Executes additional proceesses on the retrieved assertion
 * to ensure compliance with the application requirements.
 *
 * @author Misagh Moayyed
 */
public interface AssertionValidator {

    /**
     * Validate the given assertion.
     * @param assertion retrieved and constructed once the ticket is validated.
     * @throws AssertionValidationException throws on failures
     */
    void validate(Assertion assertion) throws AssertionValidationException;
}
