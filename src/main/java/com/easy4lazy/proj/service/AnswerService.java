package com.easy4lazy.proj.service;

import com.easy4lazy.proj.repository.AnswerRepository;
import com.easy4lazy.proj.model.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {

    AnswerRepository answerRepository;

    @Autowired
    public AnswerService(AnswerRepository answerRepository){
        this.answerRepository = answerRepository;
    }

    public Answer postAnswer(Answer answer){
        return answerRepository.save(answer);
    }

    public Answer editAnswer(Answer answer){
        return answerRepository.save(answer);
    }

    public void deleteAnswer(Answer answer){
        answerRepository.deleteById(answer.getId());
    }

    public List<Answer> getAnswersOfQuestion(Answer answer){
        return answerRepository.findByContentTypeIdAndContentId(2,answer.getContentId());
    }

    public Integer getTotalNumberOfAnswers(Answer answer){
        return answerRepository.countAllByContentId(answer.getContentId());
    }
}
