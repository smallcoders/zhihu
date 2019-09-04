package com.example.zhihu.repository;

import com.example.zhihu.dao.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
