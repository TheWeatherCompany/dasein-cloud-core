package org.dasein.cloud.network;

/**
 * User: Eugene Yaroslavtsev
 * Date: 21.11.2014
 */
public enum  RouteState {
    ACTIVE, BLACKHOLE;

    public static RouteState fromValue( String state ) {
        for( RouteState routeState : RouteState.values() ) {
            if( routeState.name().equals(state) ) {
                return routeState;
            }
        }
        throw new IllegalArgumentException("Illegal RouteState: " + state);
    }

}
