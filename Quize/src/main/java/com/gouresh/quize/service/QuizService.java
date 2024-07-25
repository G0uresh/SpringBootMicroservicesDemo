package com.gouresh.quize.service;

import com.gouresh.quize.entity.Quiz;

import java.util.List;

public interface QuizService {
    Quiz add(Quiz quiz);
    List<Quiz> get();
    Quiz findQuizById(Long id);
}
