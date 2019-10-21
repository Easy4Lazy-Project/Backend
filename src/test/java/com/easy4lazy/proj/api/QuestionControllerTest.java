package com.easy4lazy.proj.api;


import com.easy4lazy.proj.service.QuestionService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@WebMvcTest(value = QuestionController.class, secure = false)
public class QuestionControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    QuestionService questionService ;



    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public  void getSearchTest() throws Exception{
        String  controllerOutput="{}";
        when(questionService.search( Mockito.anyString())).thenReturn("{}");
        RequestBuilder requestBuilder=  MockMvcRequestBuilders.get("localhost:/api/v1/content/q/search/C").accept(
                MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        System.out.println( result.getResponse());

        JSONAssert.assertEquals(controllerOutput, result.getResponse()
                .getContentAsString(), false);


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
