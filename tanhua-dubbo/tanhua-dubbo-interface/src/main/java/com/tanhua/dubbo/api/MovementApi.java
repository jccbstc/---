package com.tanhua.dubbo.api;

import com.tanhua.model.mongo.Movement;
import com.tanhua.model.vo.PageResult;

import java.util.List;

public interface MovementApi {

    String publish(Movement movement);

    PageResult findByUserId(Long userId, Integer page, Integer pagesize);

    List<Movement> findFriendMovements(Integer page, Integer pagesize, Long userId);

    List<Movement> randomMovements(Integer pagesize);

    List<Movement> findMovementsByPids(List<Long> pids);

    Movement findById(String movementId);

    PageResult findByUserId(Long uid, Integer state, Integer page, Integer pagesize);

    void update(String movementId, int state);
}
