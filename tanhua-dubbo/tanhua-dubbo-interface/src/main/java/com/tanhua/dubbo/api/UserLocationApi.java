package com.tanhua.dubbo.api;

import java.util.List;

public interface UserLocationApi {
    Boolean updateLocation(Long userId, Double longitude, Double latitude, String address);

    List<Long> queryNearUser(Long userId, Double valueOf);
}
