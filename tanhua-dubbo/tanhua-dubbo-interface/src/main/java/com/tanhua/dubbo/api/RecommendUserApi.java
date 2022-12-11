package com.tanhua.dubbo.api;

import com.tanhua.model.mongo.RecommendUser;
import com.tanhua.model.vo.PageResult;

import java.util.List;

public interface RecommendUserApi {
    //查询今日佳人数据
    RecommendUser queryWithMaxScore(Long toUserId);

    PageResult queryRecommendUserList(Integer page, Integer pagesize, Long userId);

    RecommendUser queryByUserId(Long userId, Long userId1);

    List<RecommendUser> queryCardsList(Long userId, int i);
}
