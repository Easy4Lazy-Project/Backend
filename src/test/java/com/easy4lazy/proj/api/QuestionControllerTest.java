package com.easy4lazy.proj.api;


import com.easy4lazy.proj.service.QuestionService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class QuestionControllerTest {
    @InjectMocks
    QuestionController questionController;

    QuestionService questionService = mock(QuestionService.class);

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void postQuestionTest() {
        int userId = 1;
        String token = "xdfcghgvhjbkjnklmmhng";
        String question = "how to do this";
        String subject = "there is any other way ";
        String tags = "c#";
        when(questionService.postQuestion(userId, token, question, subject, tags)).thenReturn("200");

        assertEquals("Test post Question", questionService.postQuestion(userId, token, question, subject, tags), "200");

    }

    @Test
    public void getQuestiontest() {
        int questionIdm = 22;
        String result = "there is no way to run ! how";
        when(questionService.getQuestion(questionIdm)).thenReturn(result);
        assertEquals("Test get Question", questionService.getQuestion(questionIdm), result);
    }

    @Test
    public void getAllQuestionstest() {
        String result = "q1q1q1q1";
        when(questionService.getAllQuestions()).thenReturn(result);
        assertEquals("Test All get Question", questionService.getAllQuestions(), result);
    }

    @Test
    public void getTotalQuestionsCounttest() {
        int ret = 9;
        when(questionService.getTotalAnswersCount()).thenReturn(ret);
        assertEquals("Test get Total Answers Count", questionService.getTotalAnswersCount(), ret);
    }
}
