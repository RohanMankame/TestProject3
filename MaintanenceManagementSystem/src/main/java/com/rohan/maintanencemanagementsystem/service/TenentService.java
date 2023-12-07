package com.rohan.maintanencemanagementsystem.service;

import com.rohan.maintanencemanagementsystem.entity.Tenent;

import java.util.List;

public interface TenentService {
    List<Tenent> getAllTenents();

    Tenent saveTenent(Tenent tenent);

    Tenent getTenentById(long id);
    Tenent updateTenent(Tenent tenent);

    void deleteTenentById(long id);

    //get find requests by keyword
    List<Tenent> findByKeyword(String keyword);

}
