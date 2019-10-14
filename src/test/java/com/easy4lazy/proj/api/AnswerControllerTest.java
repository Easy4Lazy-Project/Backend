package com.easy4lazy.proj.api;

import com.easy4lazy.proj.service.AnswerService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class AnswerControllerTest {
    @InjectMocks
    AnswerController answerController;

    AnswerService answerService = mock(AnswerService.class);

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void postAnswertest() {
        int useridM = 1;
        String tokenm = "xdcfvgbhnjmkjhgffgvhjk";
        int questionIdm = 22;
        String ansm = "yourAnswer";

        when(answerService.postAnswer(useridM, tokenm, questionIdm, ansm)).thenReturn("200");
        assertEquals("Test Post Answer", answerService.postAnswer(useridM, tokenm, questionIdm, ansm), "200");

    }
    @Test
    public void getQuestionAnswersTest() {
        int userId = 1;
        int questionId = 22;
        String controllerOutput = "Answer";
        when(answerService.getQuestionAnswers(userId, questionId)).thenReturn(controllerOutput);

        assertEquals("Test get Question Answers ", answerService.getQuestionAnswers(userId, questionId).length(), controllerOutput.length());

    }

    @Test
    public void getAnswersPerMonthTest() {
        int year = 2019;
        String ret = "{\"month\":10,\"count\":11}";

        when(answerService.getAnswersPerMonth(year)).thenReturn(ret);

        assertEquals("Test get Answers Per Month ", answerService.getAnswersPerMonth(year), ret);

    }
@Test
    public void getTotalAnswersCountTest(){
        int countEx=10;
        when(answerService.getTotalAnswersCount()).thenReturn(countEx);
        assertEquals("Test get Total Answers Count",answerService.getTotalAnswersCount(),countEx);
}

}