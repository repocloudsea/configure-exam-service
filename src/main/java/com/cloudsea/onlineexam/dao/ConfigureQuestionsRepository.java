package com.cloudsea.onlineexam.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cloudsea.onlineexam.entity.QuestionConfigurationCollection;

@Repository
public interface ConfigureQuestionsRepository extends CrudRepository<QuestionConfigurationCollection, Long>{

	
}
