package org.dasein.cloud.network;

import javax.annotation.Nonnull;

/**
 * User: Eugene Yaroslavtsev
 * Date: 21.11.2014
 */
public class RouteTableGetOptions {

    private String routeTableId;
    private RouteState[] requiredStates = new RouteState[]{RouteState.ACTIVE};

    public static @Nonnull RouteTableGetOptions getInstance( @Nonnull String routeTableId ) {
        RouteTableGetOptions options = new RouteTableGetOptions();
        options.routeTableId = routeTableId;
        return options;
    }

    private RouteTableGetOptions() {
    }

    public @Nonnull String getRouteTableId() {
        return routeTableId;
    }

    public @Nonnull RouteState[] getRequiredStates() {
        return requiredStates;
    }

    public @Nonnull RouteTableGetOptions withRequiredStates( @Nonnull RouteState[] requiredStates ) {
        this.requiredStates = requiredStates;
        return this;
    }
}
