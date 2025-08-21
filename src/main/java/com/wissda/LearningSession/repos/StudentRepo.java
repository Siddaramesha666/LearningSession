package com.wissda.LearningSession.repos;

import com.wissda.LearningSession.dao.StudentDAO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<StudentDAO, String> {
}