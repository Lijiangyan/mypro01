package com.my.service;

import com.my.entity.*;

import java.util.List;
import java.util.Map;

/**
 * Created by LJ on 16/7/20.
 */
public interface TestService {

    List<String> getAllModuleName();

    Module getModule(int id);

    Suite getSuite(int id);

    List<Suite> getSuitesByModuleId(int moduleId);

    List<List<Suite>> getAllSuiteSortedByModuleId();

    List<Question> getQuestionsBySuiteId(int suiteId);

    List<Option> getOptionsByQuestionId(int questionId);

    List<Map<String, Object>> getQuestionAndOptionsBySuiteId(int suiteId);

    Option getOptionById(int optionId);

    Result getResultById(int resultId);

    Score savaScore(Score score);

    Result getResultBySuiteId(int suiteId);
}
