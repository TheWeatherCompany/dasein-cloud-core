package org.dasein.cloud.compute;

/**
 * User: mgulimonov
 * Date: 28.05.2014
 */
public class VMFilter {

    private String subnetId;

    public static VMFilter getInstance(String subnetId) {
        return new VMFilter(subnetId);
    }

    protected VMFilter(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getSubnetId() {
        return subnetId;
    }
}
