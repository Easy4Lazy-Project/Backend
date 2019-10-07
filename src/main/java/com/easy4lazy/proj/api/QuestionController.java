package com.easy4lazy.proj.api;

import com.easy4lazy.proj.model.Question;
import com.easy4lazy.proj.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RequestMapping("api/v1/content/q")
@RestController
public class QuestionController {
    private final QuestionService questionService;
    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping(path="{uid}/{token}/{ques}/{subject}/{tags}")
    public String postQuestion(@PathVariable("uid") @Valid @NotNull int userId,
                               @PathVariable("token") @Valid @NotNull String token,
                               @PathVariable("ques") @Valid @NotNull String question,
                               @PathVariable("subject") String subject,
                               @PathVariable("tags") String tags
    ){
        return questionService.postQuestion(userId, token, question, subject, tags);
    }

    @GetMapping(path="/get/{id}")
    public String getQuestion(@PathVariable("id") @Valid @NotNull int questionId){
        return questionService.getQuestion(questionId);
    }

    @GetMapping(path="/all")
    public String getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @DeleteMapping(path="/del/{uid}/{token}/{id}")
    String deleteQuestion(@PathVariable("uid") @Valid @NotNull int userId, @PathVariable("token") @Valid @NotNull String token,@PathVariable("id") @Valid @NotNull int contentId){
        return questionService.deleteQuestion(userId, token, contentId);
    }


    @PutMapping(path="{uid}/{token}/{ques}/{subject}/{tags}")
    public String editQuestion(@PathVariable("uid") @Valid @NotNull int userId,
                               @PathVariable("token") @Valid @NotNull String token,
                               @PathVariable("ques") @Valid @NotNull String question,
                               @PathVariable("subject") String subject,
                               @PathVariable("tags") String tags){
        return questionService.editQuestion(userId, token, question, subject, tags);
    }

    @GetMapping(path="/count")
    public int getTotalQuestionsCount(){
        return questionService.getTotalAnswersCount();
    }


}
