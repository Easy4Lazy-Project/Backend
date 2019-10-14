package com.easy4lazy.proj.repository;

import com.easy4lazy.proj.model.Answer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnswerRepository extends CrudRepository<Answer, Integer> {
    List<Answer> findByContentTypeIdAndContentId(Integer contentTypeId, Integer contentId);
    Integer countAllByContentId(Integer contentId);

}
