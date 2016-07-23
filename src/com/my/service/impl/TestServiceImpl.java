package com.my.service.impl;

import com.my.dao.*;
import com.my.entity.*;
import com.my.service.TestService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LJ on 16/7/20.
 */
public class TestServiceImpl implements TestService {

    private ModuleDao moduleDao;
    private OptionDao optionDao;
    private QuestionDao questionDao;
    private ResultDao resultDao;
    private ScoreDao scoreDao;
    private SuiteDao suiteDao;
    private UserDao userDao;

    @Override
    public List<String> getAllModuleName() {
        List<String> list = new ArrayList<String>();
        List<Module> modules = moduleDao.getAllModule();
        if (modules.size() > 0) {
            for (Module m: modules) {
                list.add(m.getName());
            }
        }
        return list;
    }

    @Override
    public Module getModule(int id) {
        return moduleDao.getModuleById(id);
    }

    @Override
    public Suite getSuite(int id) {
        return suiteDao.getSuiteById(id);
    }

    @Override
    public List<Suite> getSuitesByModuleId(int moduleId) {

        return suiteDao.getSuitesByModuleId(moduleId);
    }

    @Override
    public List<List<Suite>> getAllSuiteSortedByModuleId() {

        List<List<Suite>> suiteList = new ArrayList<>();
        List<Integer> allId = moduleDao.getAllId();
        for (Integer ival: allId) {
            List<Suite> suites = this.getSuitesByModuleId(ival.intValue());
            suiteList.add(suites);
        }
        System.out.println("suiteList = " + suiteList);
        return suiteList;
    }

    @Override
    public List<Question> getQuestionsBySuiteId(int suiteId) {
        return questionDao.getQuestionsBySuiteId(suiteId);
    }

    @Override
    public List<Option> getOptionsByQuestionId(int questionId) {
        return optionDao.getOptionsByQuestionId(questionId);
    }

    @Override
    public List<Map<String, Object>> getQuestionAndOptionsBySuiteId(int suiteId) {
        List<Map<String, Object>> questionAndOptsList = new ArrayList<>();
        List<Question> questions = this.getQuestionsBySuiteId(suiteId);
        for(Question q: questions) {
            List<Option> options = this.getOptionsByQuestionId(q.getId());
            Map<String, Object> tempMap = new HashMap<String, Object>();
            tempMap.put("question", q);
            tempMap.put("options", options);
            questionAndOptsList.add(tempMap);
        }
        return questionAndOptsList;
    }

    @Override
    public Option getOptionById(int optionId) {
        return optionDao.getOptionById(optionId);
    }

    @Override
    public Result getResultById(int resultId) {
        return resultDao.getResultById(resultId);
    }

    @Override
    public Score savaScore(Score score) {
        return scoreDao.saveScore(score);
    }

    @Override
    public Result getResultBySuiteId(int suiteId) {
        return resultDao.getResultBySuiteId(suiteId);
    }

    public ModuleDao getModuleDao() {
        return moduleDao;
    }

    public void setModuleDao(ModuleDao moduleDao) {
        this.moduleDao = moduleDao;
    }

    public OptionDao getOptionDao() {
        return optionDao;
    }

    public void setOptionDao(OptionDao optionDao) {
        this.optionDao = optionDao;
    }

    public QuestionDao getQuestionDao() {
        return questionDao;
    }

    public void setQuestionDao(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    public ResultDao getResultDao() {
        return resultDao;
    }

    public void setResultDao(ResultDao resultDao) {
        this.resultDao = resultDao;
    }

    public ScoreDao getScoreDao() {
        return scoreDao;
    }

    public void setScoreDao(ScoreDao scoreDao) {
        this.scoreDao = scoreDao;
    }

    public SuiteDao getSuiteDao() {
        return suiteDao;
    }

    public void setSuiteDao(SuiteDao suiteDao) {
        this.suiteDao = suiteDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
