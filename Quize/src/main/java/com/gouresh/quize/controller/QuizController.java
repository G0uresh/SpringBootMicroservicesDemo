package com.gouresh.quize.controller;

import com.gouresh.quize.entity.Quiz;
import com.gouresh.quize.service.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping()
    private Quiz createQuiz(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }

    @GetMapping()
    private List<Quiz> getAllQuiz(){
        return quizService.get();
    }

    @GetMapping("/{id}")
    private Quiz getQuizById(@PathVariable(name = "id") Long id){
        return quizService.findQuizById(id);
    }

}
