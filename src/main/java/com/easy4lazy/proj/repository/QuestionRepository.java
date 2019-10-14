package com.easy4lazy.proj.repository;

import com.easy4lazy.proj.model.Question;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface QuestionRepository extends CrudRepository<Question, Integer> {
    List<Question> findAllByContentTypeId(Integer id);
    Integer countAllByContentTypeId(Integer contentId);

    @Query(value = "SELECT * FROM content WHERE content_type_id = 2 AND content_id = :contentId" +
            " UNION" +
            " SELECT * FROM content WHERE content_type_id = 3 AND content_id IN " +
            "(SELECT id FROM content WHERE content_type_id = 2 AND content_id = :secondContentId GROUP by content_type_id)", nativeQuery = true)
    List<Question> selectAnswersAndComments(@Param("contentId") Integer contentId, @Param("secondContentId") Integer secondContentId);

    @Query(value = "SELECT * FROM content where content_type_id = 3 and dtype = \"Comment\" and content_id = :contentId",
            nativeQuery = true)
    List<Question> selectCommentsOfQuestion(@Param("contentId") Integer contentId);
}
