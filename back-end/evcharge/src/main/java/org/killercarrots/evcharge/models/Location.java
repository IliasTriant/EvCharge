package org.killercarrots.evcharge.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Location {
    private String address;
    private String country;
    private SpatialCoordinates geo;

    public Location() {
        /***initialization_is_done_through_setters***/
    }
}
