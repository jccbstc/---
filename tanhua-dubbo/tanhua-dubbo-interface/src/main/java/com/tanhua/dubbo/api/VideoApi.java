package com.tanhua.dubbo.api;

import com.tanhua.model.mongo.Video;
import com.tanhua.model.vo.PageResult;

import java.util.List;

public interface VideoApi {
    String save(Video video);

    List<Video> findMovementsByVids(List<Long> vids);

    List<Video> queryVideoList(int i, Integer pagesize);

    PageResult findByUserId(Integer page, Integer pagesize, Long uid);
}
