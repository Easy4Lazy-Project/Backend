package com.easy4lazy.proj.dao;

public interface VoteDao {
    /**
     *
     * @param contentId : question id
     * @param userId
     * @param tokens
     * @return    total question vote up
     */
    int voteQuestionUp(int contentId, int userId, String tokens);

    /**
     *
     * @param contentId
     * @param userId
     * @param tokens
     * @return   total question vote down
     */
    int voteQuestionDown(int contentId, int userId, String tokens);

    /**
     *
     * @param contentId      : answer id
     * @param userId
     * @param tokens     //verify if user still logs in
     * @return    total answer vote up
     */
    int voteAnswerUp(int contentId, int userId, String tokens);

    /**
     *
     * @param contentId
     * @param userId
     * @param tokens
     * @return       total answer vote down
     */
    int voteAnswerDown(int contentId, int userId, String tokens);

    /**
     *
     * @return      all questions vote up
     * required for the dashboard
     */
    int getTotalQuestionVoteUp();

    /**
     *
     * @return all questions vote down
     *      required for the dashboard
     */
    int getTotalQuestionVoteDown();

    /**
     *
     * @return all answers vote up
     *      required for the dashboard
     */
    int getTotalAnswerVoteUp();

    /**
     *
     * @return all answers vote down
     *      required for the dashboard
     */
    int getTotalAnswerVoteDown();


}
