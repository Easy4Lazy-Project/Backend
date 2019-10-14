package com.easy4lazy.proj.api;

import com.easy4lazy.proj.model.Question;
import com.easy4lazy.proj.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RequestMapping("easy4lazy/questions")
@RestController
public class QuestionController {

    private  final  QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping(path = "/postquestion" )
    public Question postQuestion(@RequestBody Question q){
        return  questionService.postQuestion(q);
    }

    // if we want to use (findById) method from repository we should return and (Optional) data type
    @GetMapping(path = "/getqestion")
    public Optional<Question> getQuestion(@RequestBody Question q){
        return questionService.getQuestion(q);
    }

    @GetMapping(path = "/getallquestion")
    public List<Question>getAllQuestions(@RequestBody Question q){
        return questionService.getAllQuestions(q);
    }

    @DeleteMapping(path = "/deletequestion")
    public void deleteQuestion(@RequestBody Question question){
        questionService.deleteQuestion(question);
    }

    @PutMapping(path = "/editquestion")
    public Question editQustion(@RequestBody Question question){
         return questionService.editQuestion(question);
    }

    @GetMapping(path = "/totalnumberofquestions")
    public Integer getTotalNumberOfQuestions(Question question){
        return questionService.getTotalNumberOfQuestion(question);
    }

    @GetMapping(path = "/getquestionanswersandcomments")
    public List<Question> getQuestionAnswerAndComment(@RequestBody Question question){
        return questionService.getQuestionAnswerAndComment(question);
    }
}
