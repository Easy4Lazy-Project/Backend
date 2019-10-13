package com.easy4lazy.proj.api;

 ;
 import com.easy4lazy.proj.service.CommentService;
 import org.junit.Before;
 import org.junit.Test;
  import org.mockito.InjectMocks;
 import org.mockito.MockitoAnnotations;
 import static org.mockito.Mockito.when;
 import static org.junit.Assert.*;
 import static org.mockito.Mockito.mock;
 import static org.mockito.Mockito.when;


public class CommentControllerTest {

    @InjectMocks
    CommentController commentController;

    CommentService commentService=mock(CommentService.class);

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getQuestionCommentstest(){
        int userId=1;
        int questionId=22;
        String retQ="q1q2q3q4";
        when(commentService.getQuestionComments(userId,questionId)).thenReturn(retQ);
        assertEquals("Test get Question Comments", commentService.getQuestionComments(userId, questionId),retQ);
    }

@Test
    public void postCommentTest(){
   int userId=1;
   String token="xdfcgvhbjnk";
   int contentId=22;
   String comment="hello";
   when(commentService.postComment(userId,token,contentId,comment)).thenReturn("200");
   assertEquals("",commentService.postComment(userId,token,contentId,comment),"200");

}
}
