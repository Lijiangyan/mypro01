package com.my.dao;

import com.my.entity.Result;

/**
 * Created by LJ on 16/7/21.
 */
public interface ResultDao {
    Result getResultById(int resultId);
    Result getResultBySuiteId(int suiteId);
}
