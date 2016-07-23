package com.my.dao;

import com.my.entity.Option;

import java.util.List;

/**
 * Created by LJ on 16/7/21.
 */
public interface OptionDao {
    List<Option> getOptionsByQuestionId(int questionId);
    Option getOptionById(int optionId);
}
