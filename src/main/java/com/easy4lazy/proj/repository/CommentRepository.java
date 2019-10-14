package com.easy4lazy.proj.repository;

import com.easy4lazy.proj.model.Comment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentRepository extends CrudRepository<Comment, Integer> {
    List<Comment> findByContentTypeIdAndContentId(Integer contentTypeId, Integer contentId);
    Integer countAllByContentId(Integer contentId);
}
