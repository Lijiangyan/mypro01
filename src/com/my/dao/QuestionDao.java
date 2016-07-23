package com.my.dao;

import com.my.entity.Question;

import java.util.List;

/**
 * Created by LJ on 16/7/21.
 */
public interface QuestionDao {
    List<Question> getQuestionsBySuiteId(int suitId);
}
