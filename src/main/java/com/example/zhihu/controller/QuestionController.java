package com.example.zhihu.controller;

import com.example.zhihu.common.HttpResult;
import com.example.zhihu.dao.Question;
import com.example.zhihu.repository.QuestionRepository;
import com.example.zhihu.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/getQuestionList")
    public HttpResult getQuestionList() {
        try {
            List<Question> questionList = questionService.queryQuestionList();
            return HttpResult.getSuccessInstance(questionList);
        } catch (Exception e) {
            return HttpResult.getFailedInstance("接口异常");
        }
    }

    @GetMapping("/getQuestion")
    public HttpResult getQuestion(Integer id) {
        try {
            Question question = questionService.queryQuestion(id);
            return HttpResult.getSuccessInstance(question);
        } catch (Exception e) {
            return HttpResult.getFailedInstance("接口异常");
        }
    }

    @PostMapping("/addQuestion")
    public HttpResult addQuestion(@RequestParam("name") String name,
                                  @RequestParam("desc") String desc) {
        try {
            Question question = new Question();
            question.setName(name);
            question.setDesc(desc);
            questionRepository.save(question);
            return HttpResult.getSuccessInstance();
        } catch (Exception e) {
            return HttpResult.getFailedInstance("接口异常");
        }
    }
}
