package com.cloudsea.onlineexam.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import com.cloudsea.onlineexam.model.QuestionConfiguration;

@Document(collection = "questions")
public class QuestionConfigurationCollection {

	@Id
	private long id;

	private QuestionConfiguration questionConfig;

	private String createdBy;

	private String createDate;

	private String modifiedBy;

	private String modifiedDate;
	
	public QuestionConfigurationCollection() {
	}

	@PersistenceConstructor
	public QuestionConfigurationCollection(long id, QuestionConfiguration questionConfig, String createdBy,
			String createDate, String modifiedBy, String modifiedDate) {
		super();
		this.id = id;
		this.questionConfig = questionConfig;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "Exam [id=" + id + ", questionConfig=" + questionConfig + ", createdBy=" + createdBy + ", createDate="
				+ createDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public QuestionConfiguration getQuestionConfig() {
		return questionConfig;
	}

	public void setQuestionConfig(QuestionConfiguration questionConfig) {
		this.questionConfig = questionConfig;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
