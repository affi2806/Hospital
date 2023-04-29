package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.HospitalModel;

public interface HospitalRepository extends JpaRepository <HospitalModel,Integer>{

}
