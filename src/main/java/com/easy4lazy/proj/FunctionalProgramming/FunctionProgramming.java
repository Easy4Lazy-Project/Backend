package com.easy4lazy.proj.FunctionalProgramming;

import com.easy4lazy.proj.model.*;

import java.util.List;
import java.util.Map;

public class FunctionProgramming {

    //1-user per Month
    /**
     *
     * @param year
     * @param LUser
     * @return
     */
    public Map<Integer,Integer> userPerMonth(int year, List<User> LUser){

        return null;
    }

    //2-questions Per Month
    /**
     *
     * @param LQuestions
     * @return {map <Months,numUser>}
     */
    public Map<Integer,Integer> questionsPerMonth(List<Question> LQuestions)
    {

   return null;
    }

    //3-top Ten Users Vote

    /**
     *
     * @param LUsers
     * @param LVotes
     * @param K
     * @return
     */
    public List<User> topUsersVote (List<User> LUsers, List<Vote> LVotes, int K)
    {
        return null;
    }

    //4-top Ten Users On Question
    /**
     *
     * @param LUsers
     * @param LQuestions
     *  @param K
     * @return to ten users depend on list of  Question
     */
    public  List<User> topUsersOnQuestion(List<User> LUsers,List<Question> LQuestions,int K )
    {
        return null;
    }
    //5-Average Of Answers Per Questions

    /**
     *
     * @param LQuestions
     * @param LAnswers
     * @return
     */
    public Map<Question,Double> AverageOfAnswersPerQuestions(List<Question> LQuestions, List<Answer>LAnswers)
    {
        return null;
    }

    //6-Questions Without Answers
    /**
     *
     * @param LQuestions
     * @return
     */
    public List<Question> QuestionsWithoutAnswers (List<Question> LQuestions)
    {
        return null;
    }

    //7-Average Of Answers Per User Per Month
    /**
     *
     * @param LAnswers
     * @param year
     * @return Map<Month,Avarage></>
     */
    public Map<Integer,Double> AverageOfAnswersPerUserPerMonth(List<Answer>LAnswers,Integer year)
    {
     return null;
    }

    //8-Moderate on Bad Word
    /**
     *
     * @param content
     * @return  String without bad word
     */
    public  String ModerateBadWord( String content)
    {
        return null;
    }
    //9-Moderate (Repeated)

    /**
     *
     * @param content
     * @return string without Repeat Like testtest... ->test...
     */
    public  String  ModerateRepeated( String content ){
        return null;
    }

    //10-top K Questions by vote
    /**
     *
     * @param LQuestion
     * @return to K order by vote
     */
    public List<Question> TopKQuestionsbyVote( List<Question> LQuestion)
    {
        return null;
    }
    //11- Top K tags
    /**
     *
     * @param LTages
     * @return List of top K Tages
     */
    public List<String> TopKTages(List<String> LTages)
    {
        return null;
    }
    //12- Answer Per Month

    /**
     *
     * @param LAnswers
     * @return Map< Answercount,Month></>
     */
    public Map<Integer,Integer> AnswerPerMonth (List<Answer>LAnswers)
    {
        return null;
    }
    //13-Comment Per Month

    /**
     *
     * @param LComments
     * @return Map< Commentcount,Month></>
     */
    public Map<Integer,Integer> CommentPerMonth (List<Comment>LComments)
    {
        return null;
    }

    //14-Search
    /**
     *
     * @param LQuestions
     * @param KeyWord
     * @return List of Questions have this Key word
     */
    public List<Question> Search(List<Question> LQuestions,String KeyWord){
        return null;
    }

    //15-My Top K Questions
    /**
     *
     * @param MyUser
     * @param K
     * @return List of Questions with limit K
     */
    public List<Question> MyTopKQuestions(User MyUser,int K)
    {
        return null;
    }
}
