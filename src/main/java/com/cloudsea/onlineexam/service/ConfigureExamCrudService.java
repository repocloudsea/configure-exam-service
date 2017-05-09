package com.cloudsea.onlineexam.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cloudsea.onlineexam.dao.ConfigureQuestionsRepository;
import com.cloudsea.onlineexam.entity.QuestionConfigurationCollection;
import com.cloudsea.onlineexam.model.QuestionConfiguration;

/**
 * Created by deepas on 24/04/17.
 */
@RestController
@RequestMapping("/configure")
public class ConfigureExamCrudService {

	private ConfigureQuestionsRepository ConfigureQuestionsRepository;

	@Autowired
	public ConfigureExamCrudService(
			com.cloudsea.onlineexam.dao.ConfigureQuestionsRepository configureQuestionsRepository) {
		super();
		ConfigureQuestionsRepository = configureQuestionsRepository;
	}

	@RequestMapping(value = "/questions", method = RequestMethod.GET)
	public String get() {

		return "hello";
	}

	@RequestMapping(value = "/questions", method = RequestMethod.POST, produces = {
			"application/json" }, consumes = "application/json")
	@ResponseBody
	public ResponseEntity<String> saveQuestionConfiguration(@RequestHeader(value = "schema") String schema,
			@RequestBody QuestionConfiguration questionConfiguration) {
		QuestionConfigurationCollection question = new QuestionConfigurationCollection();
		question.setCreatedBy("admin");
		question.setCreateDate(new Date().toString());
		question.setQuestionConfig(questionConfiguration);
		ConfigureQuestionsRepository.save(question);
		return null;

	}

}
