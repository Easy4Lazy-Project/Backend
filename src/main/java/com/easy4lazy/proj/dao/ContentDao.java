package com.easy4lazy.proj.dao;

import com.easy4lazy.proj.model.Answer;
import com.easy4lazy.proj.model.Comment;
import com.easy4lazy.proj.model.Question;

public interface ContentDao {
    /**
     * post a question to the db
     * @param question, userId, token CHECK: if user is logged in
     * @return {questionId:int, message:String} a json object
     *  questionId  : id of the content in the content table
     */
    String postQuestion(int userId, String token, Question question);

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
     * post a question to the db
     * @param comment, userId, token CHECK: if user is logged in
     * @return {commentId:int, message:String} a json object
     *  commentId  : id of the content in the content table
     *
     *  ALSO, update commentCount of the question
     */
    String postComment(int userId, String token, Comment comment);

    /**
     *  return the question with the id
     * @param questionId : id of the content in the content table
     * @return @return {
     *      *      subject, body, createdDate, id, name of user, tags, answerCount,commentCount like, dislike,
     *      *      myvote e.g "like", "dislike" or ""
     *      * } a json array string of all questionsa Question class as json string
     */
    String getQuestion(int questionId);

    /**
     * returns all questions
     * @return [{
     *      subject, body, createdDate, id, name of user, tags, answerCount, like, dislike,
     *      myvote e.g "like", "dislike" or ""
     * }] a json array string of all questions
     */
    String getAllQuestions();

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
     * returns all comments of a question
     * @param questionId : id of the content in the content table
     * @return [{
     *       id, contentId(this is the questionId), name of poster, body, creationDate
     *   }]  string jsonArray of all answers to a questions
     */
    String getQuestionComments(int questionId);

    /**
     * returns all comments of an answers
     * @param answerId : id of the content in the content table
     * @return [{
     *      contentId, name of poster, body, creationDate
     *      }]  string jsonArray of all answers to a questions
     */
    String getAnswerComments(int answerId);
}
