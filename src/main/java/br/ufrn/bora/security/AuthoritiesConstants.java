package br.ufrn.bora.security;

/**
 * Constants for Spring Security authorities.
 */
public final class AuthoritiesConstants {

    public static final String ADMIN = "ROLE_ADMIN";

    public static final String USER = "ROLE_USER";

    public static final String GENERAL_USER = "ROLE_GENERAL_USER";

    public static final String EVENT_PRODUCER = "ROLE_EVENT_PRODUCER";

    public static final String ANONYMOUS = "ROLE_ANONYMOUS";

    private AuthoritiesConstants() {}
}
