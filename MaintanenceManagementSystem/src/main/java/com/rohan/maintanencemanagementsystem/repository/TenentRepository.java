package com.rohan.maintanencemanagementsystem.repository;

import com.rohan.maintanencemanagementsystem.entity.Tenent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface TenentRepository extends JpaRepository<Tenent,Long> {

    @Query(value="select * from tenent e where e.area like %:keyword% or e.problem like%:keyword% or e.datetime like%:keyword% or e.status like%:keyword% or e.apt like%:keyword% or e.username like%:keyword%", nativeQuery = true)
    List<Tenent> findByKeyword(@Param("keyword") String keyword);
}
