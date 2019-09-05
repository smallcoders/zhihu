package com.example.zhihu.controller;

import com.example.zhihu.common.HttpResult;
import com.example.zhihu.dao.Problem;
import com.example.zhihu.dao.Question;
import com.example.zhihu.repository.ProblemRepository;
import com.example.zhihu.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProblemController {

    @Autowired
    private ProblemRepository problemRepository;

    @Autowired
    private ProblemService problemService;

    @GetMapping("/getProblemList")
    public HttpResult getProblemList () {
        try {
            List<Problem> problemList = problemService.queryProblemList();
            return HttpResult.getSuccessInstance(problemList);
        } catch (Exception e) {
            return HttpResult.getFailedInstance("接口异常");
        }
    }

    @PostMapping("/addProblem")
    public HttpResult addProblem(@RequestParam("name") String name,
                                  @RequestParam("description") String description) {
        try {
            problemService.insertProblem(name, description);
            return HttpResult.getSuccessInstance();
        } catch (Exception e) {
            return HttpResult.getFailedInstance("接口异常");
        }
    }
}
