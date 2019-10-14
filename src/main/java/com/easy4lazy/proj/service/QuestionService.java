package com.easy4lazy.proj.service;

import com.easy4lazy.proj.repository.QuestionRepository;

import com.easy4lazy.proj.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public Question postQuestion(Question q){
        return questionRepository.save(q);
    }

    public Optional<Question> getQuestion(Question question){
        return questionRepository.findById(question.getId());
    }

    public List<Question> getAllQuestions(Question question){
        return questionRepository.findAllByContentTypeId(question.getContentTypeId());
    }

    public void deleteQuestion(Question question){
        questionRepository.deleteById(question.getId());
    }

    public Question editQuestion(Question question){
        return questionRepository.save(question);
    }

    public Integer getTotalNumberOfQuestion(Question question){
        return questionRepository.countAllByContentTypeId(question.getContentTypeId());
    }

    public List<Question> getQuestionAnswerAndComment(Question question){
        List<Question> result = new ArrayList<>();
        Optional<Question> ques = getQuestion(question);

        if(ques.isPresent()){
            Question findedQuestion = ques.get();
            result.add(findedQuestion);
            result.addAll(questionRepository.selectCommentsOfQuestion(findedQuestion.getId()));
            result.addAll(questionRepository.selectAnswersAndComments(findedQuestion.getId(), findedQuestion.getId()));
        }
        else{
            System.out.println("Question not found!");
        }
        return result;
    }
}
