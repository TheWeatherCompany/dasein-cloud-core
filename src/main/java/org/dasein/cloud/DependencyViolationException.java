package org.dasein.cloud;

import javax.annotation.Nonnull;
import java.net.HttpURLConnection;

/**
 * Exception is used to detect resources dependency violation during remove process
 * User: mgulimonov
 * Date: 24.05.2014
 */
public class DependencyViolationException extends CloudException {
    public DependencyViolationException(@Nonnull String msg) {
        super(CloudErrorType.GENERAL, HttpURLConnection.HTTP_BAD_REQUEST, "none", msg);
    }
}
