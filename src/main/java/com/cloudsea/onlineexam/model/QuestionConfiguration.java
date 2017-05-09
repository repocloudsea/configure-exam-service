package com.cloudsea.onlineexam.model;

import java.util.Collection;

/**
 * Created by deepas on 23/04/17.
 */
public class QuestionConfiguration {


    private QuestionType questionType;

    private Integer questionsCount;

    private Collection<Question> questions;

    private Integer timeAlloted;

    private boolean randomizeQuestion;

    private Integer weightage;

    public QuestionConfiguration(){
        randomizeQuestion = false;
    }

    public QuestionConfiguration(QuestionType questionType, Integer questionsCount, Collection<Question> questions, Integer timeAlloted, Integer weightage) {
        this.questionType = questionType;
        this.questionsCount = questionsCount;
        this.questions = questions;
        this.timeAlloted = timeAlloted;
        randomizeQuestion = false;
        this.weightage = weightage;
    }

    @Override
    public String toString() {
        return "QuestionConfiguration{" +
                "questionType=" + questionType +
                ", questionsCount=" + questionsCount +
                ", questions=" + questions +
                ", timeAlloted=" + timeAlloted +
                ", randomizeQuestion=" + randomizeQuestion +
                ", weightage=" + weightage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuestionConfiguration)) return false;

        QuestionConfiguration that = (QuestionConfiguration) o;

        if (randomizeQuestion != that.randomizeQuestion) return false;
        if (questionType != that.questionType) return false;
        if (!questionsCount.equals(that.questionsCount)) return false;
        if (!questions.equals(that.questions)) return false;
        if (timeAlloted != null ? !timeAlloted.equals(that.timeAlloted) : that.timeAlloted != null) return false;
        return weightage.equals(that.weightage);
    }

    @Override
    public int hashCode() {
        int result = questionType.hashCode();
        result = 31 * result + questionsCount.hashCode();
        result = 31 * result + questions.hashCode();
        result = 31 * result + (timeAlloted != null ? timeAlloted.hashCode() : 0);
        result = 31 * result + (randomizeQuestion ? 1 : 0);
        result = 31 * result + weightage.hashCode();
        return result;
    }

	public QuestionType getQuestionType() {
		return questionType;
	}

	public void setQuestionType(QuestionType questionType) {
		this.questionType = questionType;
	}

	public Integer getQuestionsCount() {
		return questionsCount;
	}

	public void setQuestionsCount(Integer questionsCount) {
		this.questionsCount = questionsCount;
	}

	public Collection<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Collection<Question> questions) {
		this.questions = questions;
	}

	public Integer getTimeAlloted() {
		return timeAlloted;
	}

	public void setTimeAlloted(Integer timeAlloted) {
		this.timeAlloted = timeAlloted;
	}

	public boolean isRandomizeQuestion() {
		return randomizeQuestion;
	}

	public void setRandomizeQuestion(boolean randomizeQuestion) {
		this.randomizeQuestion = randomizeQuestion;
	}

	public Integer getWeightage() {
		return weightage;
	}

	public void setWeightage(Integer weightage) {
		this.weightage = weightage;
	}
    
}
