package com.mongo.crud.springmongo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.crud.springmongo.entity.Student;

@Repository
public interface StudentRepo extends MongoRepository<Student, Integer>{
        //List<Student> findAll();
}
