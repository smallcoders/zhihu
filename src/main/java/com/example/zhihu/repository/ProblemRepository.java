package com.example.zhihu.repository;

import com.example.zhihu.dao.Problem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProblemRepository extends JpaRepository<Problem, Integer> {
}
