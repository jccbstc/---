package com.tanhua.dubbo.api;

import com.tanhua.model.enums.CommentType;
import com.tanhua.model.mongo.Comment;

import java.util.List;

public interface CommentApi {
    Integer save(Comment comment1);

    List<Comment> findComments(String movementId, CommentType comment, Integer page, Integer pagesize);

    Boolean hasComment(String movementId, Long userId, CommentType like);

    Integer delete(Comment comment);
}
