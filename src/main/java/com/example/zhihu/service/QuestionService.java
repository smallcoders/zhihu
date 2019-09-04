package com.example.zhihu.service;

import com.example.zhihu.dao.Question;

import java.util.List;


public interface QuestionService {

    List<Question> queryQuestionList();

    Question queryQuestion(Integer id);
}
