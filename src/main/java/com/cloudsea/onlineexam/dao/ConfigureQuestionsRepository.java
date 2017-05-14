package com.cloudsea.onlineexam.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cloudsea.onlineexam.entity.QuestionConfigurationCollection;

@RepositoryRestResource
public interface ConfigureQuestionsRepository extends MongoRepository<QuestionConfigurationCollection, String>{

	
}
