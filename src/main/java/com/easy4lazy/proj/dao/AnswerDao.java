package com.easy4lazy.proj.dao;

import com.easy4lazy.proj.model.Answer;
import com.easy4lazy.proj.model.Comment;
import com.easy4lazy.proj.model.Question;

public interface AnswerDao {


    /**
     * post a answer to the db
     * @param ans, userId, token CHECK: if user is logged in
     * @return {answerId:int, message:String} a json object
     *  answerId  : id of the content in the content table
     *
     *  ALSO, update answerCount of the question
     */
    String postAnswer(int userId, String token, Answer ans);

    /**
     * user edit HIS/HER OWN answer
     * @param userId
     * @param token //for isUserLoggedIn
     * @param answer //id of the comment
     * @return { true/false, message}
     */
    String editAnswer(int userId, String token, Answer answer);

    /**
     * user delete HIS/HER OWN answer
     * @param userId
     * @param token //for isUserLoggedIn
     * @param contentId //id of the answer
     * @return { true/false, message}
     */
    String deleteAnswer(int userId, String token, int contentId);

    /**
     *  return the answers to a question
     *  @param userId : id of the current  user to check myvote
     * @param questionId : id of the content in the content table
     * @return [{
     *      *       body, createdDate, id, name of user, tags, answerCount,commentCount, like, dislike,
     *      *      myvote e.g "like", "dislike" or ""
     *      * }]  string jsonArray of all answers to a questions
     */
    String getQuestionAnswers(int userId, int questionId);


    /**
     *
     * @return  the total numbers of answers
     * we need it for the dashboard
     */
    int getTotalAnswersCount();

}
