package com.easy4lazy.proj.api;

import com.easy4lazy.proj.model.Answer;
import com.easy4lazy.proj.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("easy4lazy/answers")
@RestController
public class AnswerController {

    private final AnswerService answerService;

    @Autowired
    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @PostMapping(path = "/postanswer")
    public Answer postAnswere(@RequestBody Answer answer){

        return answerService.postAnswer(answer);
    }

    @PutMapping(path = "/editanswer")
    public Answer editAnswer(@RequestBody Answer answer){
        return answerService.editAnswer(answer);
    }

    @DeleteMapping(path = "/deleteanswer")
    public void deleteAnswer(@RequestBody Answer answer){
        answerService.deleteAnswer(answer);
    }

    @GetMapping(path = "/getanswersofquestion")
    public List<Answer> getAnswersOfQuestion(@RequestBody Answer answer){
        System.out.println(answer.getContentId());
        return answerService.getAnswersOfQuestion(answer);
    }

    @GetMapping(path = "/totalnumberofanswers")
    public Integer getTotalNumberOfAnswers(@RequestBody Answer answer){
        return answerService.getTotalNumberOfAnswers(answer);
    }
}
