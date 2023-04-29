package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Demo1;

public interface donor extends JpaRepository<Demo1, Integer>  {
	

}
