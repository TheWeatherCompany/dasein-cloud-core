
package org.dasein.cloud;

import java.math.BigDecimal;

import javax.annotation.Nonnull;

/**
 * Represents the current price of a specific kind of resource. This is used by getPrice() methods in different
 * support objects so you can quickly fetch the price of a of cloud resources without having to worry about pricing details or matrix. Fetching the status is a good way to check for large-scale state changes which may need to be
 * more frequent than detailed state changes.
 */

public abstract class CloudPrice {
	protected String regionId;
    protected String resourceId;
    protected String providerId;
    protected BigDecimal price;

    /**
     * @return the cloud provider's unique identifier for this resource
     */
    public @Nonnull String getResourceId() {
        return resourceId;
    }
    
    /**
     * @return the cloud provider's region the price belongs to
     */
    public @Nonnull String getRegionId() {
        return resourceId;
    }

    /**
     * @return the current status of the target resource
     */
    public @Nonnull String getProviderId() {
        return providerId;
    }
    
    public @Nonnull BigDecimal getPrice() {
        return price;
    }
    
    public @Nonnull abstract String getPriceDescription();

   
}
