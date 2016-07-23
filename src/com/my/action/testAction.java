package com.my.action;

import com.my.entity.*;
import com.my.service.TestService;
import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by LJ on 16/7/20.
 */
public class TestAction {

    private TestService testService;
    private List<String> moduleNames;
    private List<List<Suite>> suiteList;

    private String suitId;
    private Suite suite;

    private List<Question> questionList;
    private List<Map<String, Object>> questionAndOptsList;

    private String[] allQA;

    private Result result;

    public String updateAll() {
        System.out.println("redirect test.jsp ---- updateAll");

        this.moduleNames = testService.getAllModuleName();
        System.out.println("moduleNames = " + moduleNames);

        suiteList = testService.getAllSuiteSortedByModuleId();


        return "update";
    }

    public String question() {

        System.out.println("suidId = " + suitId);
        questionAndOptsList = testService.getQuestionAndOptionsBySuiteId(Integer.parseInt(suitId));
        System.out.println("questionAndOptsList = " + questionAndOptsList);
        return "question";
    }

    public String answer() {

        Map<String, String[]> params = ServletActionContext.getRequest().getParameterMap();
        int scores = 0;
        Suite currentSuite = null;
        User user = (User) ServletActionContext.getRequest().getSession().getAttribute("currentUser");

        System.out.println("params = " + params);
        for (String key: params.keySet()) {
            if ("".equals(params.get(key)) == false || params.get(key) != null) {
                String optionId = params.get(key)[0];
                Option option = testService.getOptionById(Integer.parseInt(optionId));
                scores += option.getScore();
                if (suite == null) {
                    currentSuite = option.getQuestion().getSuite();
                }
            }
        }
        if (currentSuite == null || user == null) {
            return "error";
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = format.format(new Date());

        Score sc = new Score();
        sc.setUser(user);
        sc.setSuite(currentSuite);
        sc.setScore(scores);
        sc.setTestTime(dateStr);
        System.out.println("score = " + sc);
        testService.savaScore(sc);

        result = testService.getResultBySuiteId(currentSuite.getId());
        System.out.println("===============================");
        System.out.println("result = " + result);

        return "answer";
    }

    public TestService getTestService() {
        return testService;
    }

    public void setTestService(TestService testService) {
        this.testService = testService;
    }

    public List<String> getModuleNames() {
        return moduleNames;
    }

    public void setModuleNames(List<String> moduleNames) {
        this.moduleNames = moduleNames;
    }

    public List<List<Suite>> getSuiteList() {
        return suiteList;
    }

    public void setSuiteList(List<List<Suite>> suiteList) {
        this.suiteList = suiteList;
    }

    public String getSuitId() {
        return suitId;
    }

    public void setSuitId(String suitId) {
        this.suitId = suitId;
    }

    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    public List<Map<String, Object>> getQuestionAndOptsList() {
        return questionAndOptsList;
    }

    public void setQuestionAndOptsList(List<Map<String, Object>> questionAndOptsList) {
        this.questionAndOptsList = questionAndOptsList;
    }

    public String[] getAllQA() {
        return allQA;
    }

    public void setAllQA(String[] allQA) {
        this.allQA = allQA;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
