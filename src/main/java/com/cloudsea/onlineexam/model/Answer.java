package com.cloudsea.onlineexam.model;

import java.util.Arrays;

/**
 * Created by deepas on 24/04/17.
 */
public class Answer {

    private String[] answerKeys;

    private String answerDesc;

    private Integer answerLength;

    private String answerExplanation;

    public Answer(String[] answerKeys, String answerDesc, Integer answerLength, String answerExplanation) {
        this.answerKeys = answerKeys;
        this.answerDesc = answerDesc;
        this.answerLength = answerLength;
        this.answerExplanation = answerExplanation;
    }

    public Answer() {
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answerKeys=" + Arrays.toString(answerKeys) +
                ", answerDesc='" + answerDesc + '\'' +
                ", answerLength=" + answerLength +
                ", answerExplanation='" + answerExplanation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Answer)) return false;

        Answer answer = (Answer) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(answerKeys, answer.answerKeys)) return false;
        if (answerDesc != null ? !answerDesc.equals(answer.answerDesc) : answer.answerDesc != null) return false;
        if (!answerLength.equals(answer.answerLength)) return false;
        return answerExplanation != null ? answerExplanation.equals(answer.answerExplanation) : answer.answerExplanation == null;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(answerKeys);
        result = 31 * result + (answerDesc != null ? answerDesc.hashCode() : 0);
        result = 31 * result + answerLength.hashCode();
        result = 31 * result + (answerExplanation != null ? answerExplanation.hashCode() : 0);
        return result;
    }

	public String[] getAnswerKeys() {
		return answerKeys;
	}

	public void setAnswerKeys(String[] answerKeys) {
		this.answerKeys = answerKeys;
	}

	public String getAnswerDesc() {
		return answerDesc;
	}

	public void setAnswerDesc(String answerDesc) {
		this.answerDesc = answerDesc;
	}

	public Integer getAnswerLength() {
		return answerLength;
	}

	public void setAnswerLength(Integer answerLength) {
		this.answerLength = answerLength;
	}

	public String getAnswerExplanation() {
		return answerExplanation;
	}

	public void setAnswerExplanation(String answerExplanation) {
		this.answerExplanation = answerExplanation;
	}
    
}
