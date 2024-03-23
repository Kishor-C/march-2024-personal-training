package com.example.springbootdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootdemo.beans.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
