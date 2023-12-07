package com.rohan.maintanencemanagementsystem.service.impl;

import com.rohan.maintanencemanagementsystem.entity.Tenent;
import com.rohan.maintanencemanagementsystem.repository.TenentRepository;
import com.rohan.maintanencemanagementsystem.service.TenentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenentServiceImpl implements TenentService {

    private TenentRepository tenentRepository;

    public TenentServiceImpl(TenentRepository tenentRepository) {
        super();
        this.tenentRepository = tenentRepository;
    }

    @Override
    public List<Tenent> getAllTenents(){

        return tenentRepository.findAll();
    }

@Override
    public List<Tenent> findByKeyword(String keyword){
        return tenentRepository.findByKeyword(keyword);
    }

    @Override
    public Tenent saveTenent(Tenent tenent) {
        return tenentRepository.save(tenent);
    }

    @Override
    public Tenent getTenentById(long id) {
        return tenentRepository.findById(id).get();

    }

    @Override
    public Tenent updateTenent(Tenent tenent) {
        return tenentRepository.save(tenent);
    }

    @Override
    public void deleteTenentById(long id) {
        tenentRepository.deleteById(id);
    }



}
