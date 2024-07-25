package com.gouresh.quize.service;

import com.gouresh.quize.entity.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Questions")
public interface QuestionClient {

    @GetMapping("/question/quiz/{id}")
    List<Question> getQuestionsByQuizId(@PathVariable(name = "id") Long quizId);
}
