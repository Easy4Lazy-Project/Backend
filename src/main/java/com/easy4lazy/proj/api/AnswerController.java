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

    @PostMapping(path="{uid}/{token}/{qid}/{ans}")
    public String postAnswer(@PathVariable("uid") @Valid @NotNull int userId,
                             @PathVariable("token") @Valid @NotNull String token,
                             @PathVariable("qid") @Valid @NotNull int questionId,
                             @PathVariable("ans") @Valid @NotNull String ans){
        return answerService.postAnswer(userId, token, questionId, ans);
    }


    @PutMapping(path="{uid}/{token}/{qid}/{ans}")
    public String editAnswer(@PathVariable("uid") @Valid @NotNull int userId,
                             @PathVariable("token") @Valid @NotNull String token,
                             @PathVariable("qid") @Valid @NotNull int questionId,
                             @PathVariable("ans") @Valid @NotNull String ans){
        return answerService.editAnswer(userId, token, questionId, ans);
    }

   /**  this functionalities is disabled for now   *****
    @DeleteMapping(path="/del/{uid}/{token}/{id}")
    public String deleteAnswer(@PathVariable("uid") @Valid @NotNull int userId, @PathVariable("token") @Valid @NotNull String token, @PathVariable("id") @Valid @NotNull int contentId){
        return answerService.deleteAnswer(userId, token, contentId);
    }


    @GetMapping(path="/get/{uid}/{token}/{id}")
    public String getQuestionAnswers(@PathVariable("id") @Valid @NotNull int userId, @PathVariable("id") @Valid @NotNull int questionId){
        return answerService.getQuestionAnswers(userId, questionId);
    }

    ****/

    @GetMapping(path="/count")          // we need this for our dashboard
    public int getTotalAnswersCount(){
        return answerService.getTotalAnswersCount();
    }
}
