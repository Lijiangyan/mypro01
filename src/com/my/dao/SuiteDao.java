package com.my.dao;

import com.my.entity.Suite;

import java.util.List;

/**
 * Created by LJ on 16/7/21.
 */
public interface SuiteDao {

    Suite getSuiteById(int id);
    List<Suite> getSuitesByModuleId(int moduleId);
}
