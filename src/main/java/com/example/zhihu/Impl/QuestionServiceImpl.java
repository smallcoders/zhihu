package com.example.zhihu.Impl;

import com.example.zhihu.dao.Question;
import com.example.zhihu.repository.QuestionRepository;
import com.example.zhihu.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<Question> queryQuestionList() {
        return questionRepository.findAll();
    }

    @Override
    public Question queryQuestion(@RequestParam("id") Integer id) {
        Question question = questionRepository.findById(id).get();
        if (null == question) {
            return null;
        }
        return question;
    }
}
