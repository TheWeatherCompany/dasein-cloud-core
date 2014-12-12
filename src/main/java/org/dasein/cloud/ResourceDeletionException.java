package org.dasein.cloud;

import javax.annotation.Nonnull;
import java.net.HttpURLConnection;

/**
 * Thrown when resource deletion is restricted
 * User: mgulimonov
 * Date: 08.06.2014
 */
public class ResourceDeletionException extends CloudException {

    public ResourceDeletionException(@Nonnull String msg) {
        super(CloudErrorType.GENERAL, HttpURLConnection.HTTP_BAD_REQUEST, "none", msg);
    }

}
