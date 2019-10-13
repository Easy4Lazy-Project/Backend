package com.easy4lazy.proj.api;

import com.easy4lazy.proj.model.Answer;
import com.easy4lazy.proj.service.AnswerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


@RestController
@RequestMapping("api/v1/post/a")
@CrossOrigin
@Api(value = ": Answer Controller Resource" )
public class AnswerController {

    private final AnswerService answerService;
    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @ApiOperation(value = " : post Answer Success")
    @PostMapping(path="{uid}/{token}/{qid}/{Answer}")
    public String postAnswer(@PathVariable("uid") @Valid @NotNull int userId,
                             @PathVariable("token") @Valid @NotNull String token,
                             @PathVariable("qid") @Valid @NotNull int questionId,
                             @PathVariable("Answer") @Valid @NotNull String ans){
        return answerService.postAnswer(userId, token, questionId, ans);
    }

    @ApiOperation(value = " : Edit Answer Success")
    @PutMapping(path="{uid}/{token}/{qid}/{Answer}")
    public String editAnswer(@PathVariable("uid") @Valid @NotNull int userId,
                             @PathVariable("token") @Valid @NotNull String token,
                             @PathVariable("qid") @Valid @NotNull int questionId,
                             @PathVariable("Answer") @Valid @NotNull String ans){
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
   @ApiOperation(value = " : Returns answer count")
   @ApiResponses(
           value = {
                   @ApiResponse(code = 100, message = "100 is the message"),
                   @ApiResponse(code = 200, message = "Successful count Answer")
           }
   )
    @GetMapping(path="/count")          // we need this for our dashboard
    public int getTotalAnswersCount(){
        return answerService.getTotalAnswersCount();
    }

    @GetMapping(path="/sapm/{year}")
    public String getAnswersPerMonth(@PathVariable("year") @NotNull int year){
        return answerService.getAnswersPerMonth(year);
    }
}
