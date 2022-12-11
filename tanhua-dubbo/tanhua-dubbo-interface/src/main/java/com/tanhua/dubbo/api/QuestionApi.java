package com.tanhua.dubbo.api;

import com.tanhua.model.domain.Question;

public interface QuestionApi {

    //根据用户id查询陌生人问题
    Question findByUserId(Long userId);

    void save(Question question);

    void update(Question question);
}
