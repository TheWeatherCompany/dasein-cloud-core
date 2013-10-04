/**
 * Copyright (C) 2009-2013 Dell, Inc.
 * See annotations for authorship information
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */

package org.dasein.cloud.identity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Date;

/**
 * Temporary API access keys for session-based access to a cloud provider.
 * @author Cameron Stokes (http://github.com/clstokes)
 * @since 2013-10-04
 */
public class TemporaryAccessKey {
    private String providerOwnerId;
    private String providerUserId;
    private byte[] secretPart;
    private String sharedPart;

    private String sessionToken;
    private long expiration;

    public TemporaryAccessKey() { }

    @Override
    public boolean equals(@Nullable Object ob) {
        if( ob == null ) {
            return false;
        }
        if( ob == this ) {
            return true;
        }
        if( !getClass().getName().equals(ob.getClass().getName()) ) {
            return false;
        }
        return sessionToken.equals(((TemporaryAccessKey)ob).sessionToken);
    }
    
    public @Nullable String getProviderOwnerId() {
        return providerOwnerId;
    }

    public void setProviderOwnerId(@Nullable String providerOwnerId) {
        this.providerOwnerId = providerOwnerId;
    }
    
    public @Nullable String getProviderUserId() {
        return providerUserId;
    }
    
    public void setProviderUserId(@Nonnull String uid) {
        providerUserId = uid;
    }

    public @Nullable byte[] getSecretPart() {
        return secretPart;
    }
    
    public void setSecretPart(@Nonnull byte[] secret) {
        secretPart = secret;
    }
    
    public @Nullable String getSharedPart() {
        return sharedPart;
    }
    
    public void setSharedPart(@Nonnull String shared) {
        sharedPart = shared;
    }

    public @Nonnull String getSessionToken() {
      return sessionToken;
    }

    public void setSessionToken( @Nonnull String sessionToken ) {
      this.sessionToken = sessionToken;
    }

    public @Nonnull long getExpiration() {
      return expiration;
    }

    public void setExpiration( @Nonnull long expiration ) {
      this.expiration = expiration;
    }

    @Override
    public @Nonnull String toString() {
        return sharedPart;
    }
}
