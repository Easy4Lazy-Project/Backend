package com.easy4lazy.proj.dao;

public interface VoteDao {
    /**
     *
     * @param contentId : question id
     * @param userId
     * @param type
     * @param tokens
     * @return    total question vote up
     */
    int vote(int contentId, int userId, int type, String tokens);



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
