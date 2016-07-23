package com.my.dao;

import com.my.entity.Module;

import java.util.List;

/**
 * Created by LJ on 16/7/20.
 */
public interface ModuleDao {
    List<Module> getAllModule();
    Module getModuleById(int id);
    List<Integer> getAllId();
}
