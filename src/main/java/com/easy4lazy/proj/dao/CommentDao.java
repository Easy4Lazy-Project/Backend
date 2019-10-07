package com.easy4lazy.proj.dao;

import com.easy4lazy.proj.model.Answer;
import com.easy4lazy.proj.model.Comment;
import com.easy4lazy.proj.model.Question;

public interface CommentDao {

    /**
     * post a comment to the db
     * @param comment, userId, token, contentId CHECK: if user is logged in
     * @return {commentId:int, message:String} a json object
     *  commentId  : id of the content in the content table
     *
     *  ALSO, update commentCount of the question
     */
    String postComment(int userId, String token, int contentId, String comment);


    /**
     * returns all comments of a question
     *
     * @param userId          //this can be null
     * @param questionId : id of the content in the content table
     * @return [{
     *       id, contentId(this is the questionId), name of poster, body, creationDate
     *   }]  string jsonArray of all answers to a questions
     */
    String getQuestionComments(int userId, int questionId);

    /**
     * returns all comments of an answers
     *
     * @param userId            //this can be null
     * @param answerId : id of the content in the content table
     * @return [{
     *      contentId, name of poster, body, creationDate
     *      }]  string jsonArray of all answers to a questions
     */
    String getAnswerComments(int userId, int answerId);

    /**
     * user delete HIS/HER OWN comment       ONLY if there are no vote
     * @param userId
     * @param token //for isUserLoggedIn
     * @param contentId //id of the comment
     * @return { true/false, message}
     */
    String deleteComment(int userId, String token, int contentId);

    /**
     *
     * @return  the total numbers of comments
     * we need it for the dashboard
     */
    int getTotalCommentsCount();
}
