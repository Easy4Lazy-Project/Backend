package com.easy4lazy.proj.api;

import com.easy4lazy.proj.service.AnswerService;
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


import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@WebMvcTest(value = AnswerController.class, secure = false)
public class AnswerControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
   private AnswerService answerService;
        @Test
    public void getAnswersPerMonthTest() throws Exception{
          String  controllerOutput="{}";

            when(answerService.getAnswersPerMonth( Mockito.anyInt())).thenReturn("{}");

            RequestBuilder requestBuilder=  MockMvcRequestBuilders.get("localhost:/api/v1/post/a/sapm/{}").accept(
                    MediaType.APPLICATION_JSON);

            MvcResult result = mockMvc.perform(requestBuilder).andReturn();

            System.out.println(result.getResponse());
            //String expected = "{id:Course1,name:Spring,description:10 Steps}";

            JSONAssert.assertEquals(controllerOutput, result.getResponse()
                    .getContentAsString(), false);

        }


//    @InjectMocks
//    AnswerController answerController;
//
//    AnswerService answerService = mock(AnswerService.class);
//
//    @Before
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    public void postAnswertest() {
//        int useridM = 1;
//        String tokenm = "xdcfvgbhnjmkjhgffgvhjk";
//        int questionIdm = 22;
//        String ansm = "yourAnswer";
//
//        when(answerService.postAnswer(useridM, tokenm, questionIdm, ansm)).thenReturn("200");
//        assertEquals("Test Post Answer", answerController.postAnswer(useridM, tokenm, questionIdm, ansm), "200");
//
//    }
//    @Test
//    public void getQuestionAnswersTest() {
//        int userId = 1;
//        int questionId = 22;
//        String controllerOutput = "Answer";
//        when(answerService.getQuestionAnswers(userId, questionId)).thenReturn(controllerOutput);
//
//        assertEquals("Test get Question Answers ", answerService.getQuestionAnswers(userId, questionId).length(), controllerOutput.length());
//
//    }
//
//    @Test
//    public void getAnswersPerMonthTest() {
//        int year = 2019;
//        String ret = "{\"month\":10,\"count\":11}";
//
//        when(answerService.getAnswersPerMonth(year)).thenReturn(ret);
//
//        assertEquals("Test get Answers Per Month ", answerService.getAnswersPerMonth(year), ret);
//
//    }
//@Test
//    public void getTotalAnswersCountTest(){
//        int countEx=10;
//        when(answerService.getTotalAnswersCount()).thenReturn(countEx);
//        assertEquals("Test get Total Answers Count",answerService.getTotalAnswersCount(),countEx);
//}

}