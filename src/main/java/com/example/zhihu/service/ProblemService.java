package com.example.zhihu.service;

import com.example.zhihu.dao.Problem;

import java.util.List;

public interface ProblemService {

    List<Problem> queryProblemList();

    Problem insertProblem(String name, String description);
}
