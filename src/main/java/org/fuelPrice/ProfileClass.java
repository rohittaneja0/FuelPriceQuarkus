package org.fuelPrice;

import org.openapitools.api.ProfileApi;
import org.openapitools.model.Profile;

public class ProfileClass implements ProfileApi {

    @Override
    public Profile profileGet() {
        return new Profile().userID("1");
    }

    @Override
    public Profile profilePost() {
        return new Profile();
    }
}
