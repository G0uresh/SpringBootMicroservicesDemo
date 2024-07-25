package com.gouresh.questions.controller;

import com.gouresh.questions.entity.Question;
import com.gouresh.questions.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public Question create(@RequestBody Question question) {
        return questionService.create(question);
    }

    //    get all
    @GetMapping
    public List<Question> getAll() {
        return questionService.get();
    }

    @GetMapping("/{questionId}")
    public Question getAll(@PathVariable(name = "questionId") Long questionId) {
        return questionService.getOne(questionId);
    }

//    get all question of specific quiz


    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId) {
        return questionService.getQuestionsOfQuiz(quizId);
    }
}
