
package org.dasein.cloud;

import java.math.BigDecimal;

import javax.annotation.Nonnull;

/**
 * Represents the current price of a specific kind of resource. This is used by getPrice() methods in different
 * support objects so you can quickly fetch the price of a of cloud resources without having to worry about pricing details or matrix. Fetching the status is a good way to check for large-scale state changes which may need to be
 * more frequent than detailed state changes.
 */

public abstract class AbstractPrice {
    private String resourceId;
    private String providerId;
    private BigDecimal price;

    public AbstractPrice(@Nonnull String provider, @Nonnull String id, @Nonnull BigDecimal price) {
    	providerId = provider;
        resourceId = id;
        this.price = price;
    }

    /**
     * @return the cloud provider's unique identifier for this resource
     */
    public @Nonnull String resourceId() {
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
    
    public @Nonnull abstract String priceDescription();

   
}
