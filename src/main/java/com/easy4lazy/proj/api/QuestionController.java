package com.easy4lazy.proj.api;

import com.easy4lazy.proj.model.Question;
import com.easy4lazy.proj.service.QuestionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RequestMapping("api/v1/content/q")
@RestController
@Api(value = " : Vote Controller Resource" )
public class QuestionController {
    private final QuestionService questionService;
    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }
    @ApiOperation(value = " : post Question Successful")
    @PostMapping(path="{uid}/{token}/{ques}/{subject}/{tags}")
    public String postQuestion(@PathVariable("uid") @Valid @NotNull int userId,
                               @PathVariable("token") @Valid @NotNull String token,
                               @PathVariable("ques") @Valid @NotNull String question,
                               @PathVariable("subject") String subject,
                               @PathVariable("tags") String tags
    ){
        return questionService.postQuestion(userId, token, question, subject, tags);
    }
    @ApiOperation(value = " : Returns  Question")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful get Question")
            }
    )
    @GetMapping(path="/get/{id}")
    public String getQuestion(@PathVariable("id") @Valid @NotNull int questionId){
        return questionService.getQuestion(questionId);
    }
    @ApiOperation(value = " : Returns All Questions")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful get All Questions")
            }
    )
    @GetMapping(path="/all")
    public String getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @ApiOperation(value = " : delete Question By ID")
    @DeleteMapping(path="/del/{uid}/{token}/{id}")
    String deleteQuestion(@PathVariable("uid") @Valid @NotNull int userId, @PathVariable("token") @Valid @NotNull String token,@PathVariable("id") @Valid @NotNull int contentId){
        return questionService.deleteQuestion(userId, token, contentId);
    }

    @ApiOperation(value = " : edit Question")
    @PutMapping(path="{uid}/{token}/{ques}/{subject}/{tags}")
    public String editQuestion(@PathVariable("uid") @Valid @NotNull int userId,
                               @PathVariable("token") @Valid @NotNull String token,
                               @PathVariable("ques") @Valid @NotNull String question,
                               @PathVariable("subject") String subject,
                               @PathVariable("tags") String tags){
        return questionService.editQuestion(userId, token, question, subject, tags);
    }

    @ApiOperation(value = " : Returns Total Questions Count")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful Returns  Total Questions Count")
            }
    )
    @GetMapping(path="/count")
    public int getTotalQuestionsCount(){
        return questionService.getTotalAnswersCount();
    }


}
