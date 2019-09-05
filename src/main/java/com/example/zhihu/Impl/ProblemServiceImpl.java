package com.example.zhihu.Impl;


import com.example.zhihu.dao.Problem;
import com.example.zhihu.repository.ProblemRepository;
import com.example.zhihu.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemServiceImpl implements ProblemService {

    @Autowired
    private ProblemRepository problemRepository;

    @Override
    public List<Problem> queryProblemList() {
        List<Problem> problemList = problemRepository.findAll();
        return problemList;
    }

    @Override
    public Problem insertProblem(String name, String description) {
        Problem problem = new Problem();
        problem.setName(name);
        problem.setDescription(description);
        return problemRepository.save(problem);
    }
}
