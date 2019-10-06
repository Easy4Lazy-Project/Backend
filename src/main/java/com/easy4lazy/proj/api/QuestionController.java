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

    @PostMapping(path="/post/{id}/{token}")
    public String postQuestion(@PathVariable("id") @Valid @NotNull int userId, @PathVariable("token") @Valid @NotNull String token, @PathVariable("token") @Valid @NotNull @RequestBody Question question){
        return questionService.postQuestion(userId, token, question);
    }

    @GetMapping(path="/get/{id}")
    public String getQuestion(@PathVariable("id") @Valid @NotNull int questionId){
        return questionService.getQuestion(questionId);
    }

    @GetMapping()
    public String getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @DeleteMapping(path="/del/{uid}/{token}/{id}")
    String deleteQuestion(@PathVariable("uid") @Valid @NotNull int userId, @PathVariable("token") @Valid @NotNull String token,@PathVariable("id") @Valid @NotNull int contentId){
        return questionService.deleteQuestion(userId, token, contentId);
    }


    @PutMapping(path="/post/{id}/{token}")
    String editQuestion(@PathVariable("id") @Valid @NotNull int userId, @PathVariable("token") @Valid @NotNull String token, @PathVariable("token") @Valid @NotNull @RequestBody Question question){
        return questionService.editQuestion(userId, token, question);
    }

    @GetMapping()
    public int getTotalQuestionsCount(){
        return questionService.getTotalAnswersCount();
    }


}
