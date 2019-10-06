package com.easy4lazy.proj.api;

import com.easy4lazy.proj.model.Answer;
import com.easy4lazy.proj.service.AnswerService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RequestMapping("api/v1/post/a")
@RestController
public class AnswerController {
    private final AnswerService answerService;

    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @PostMapping(path="/post/{id}/{token}")
    public String postAnswer(@PathVariable("uid") @Valid @NotNull int userId, @PathVariable("token") @Valid @NotNull String token, @Valid @NotNull @RequestBody Answer ans){
        return answerService.postAnswer(userId, token, ans);
    }


    @PutMapping(path="/post/{id}/{token}")
    public String editAnswer(@PathVariable("uid") @Valid @NotNull int userId, @PathVariable("token") @Valid @NotNull String token, @Valid @NotNull @RequestBody Answer answer){
        return answerService.editAnswer(userId, token, answer);
    }


    @DeleteMapping(path="/del/{uid}/{token}/{id}")
    public String deleteAnswer(@PathVariable("uid") @Valid @NotNull int userId, @PathVariable("token") @Valid @NotNull String token, @PathVariable("id") @Valid @NotNull int contentId){
        return answerService.deleteAnswer(userId, token, contentId);
    }


    @GetMapping(path="/get/{uid}/{token}/{id}")
    public String getQuestionAnswers(@PathVariable("id") @Valid @NotNull int userId, @PathVariable("id") @Valid @NotNull int questionId){
        return answerService.getQuestionAnswers(userId, questionId);
    }
    @GetMapping(path="/count")
    public int getTotalAnswersCount(){
        return answerService.getTotalAnswersCount();
    }
}
