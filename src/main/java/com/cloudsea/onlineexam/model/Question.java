package com.cloudsea.onlineexam.model;

import java.util.Collection;

/**
 * Created by deepas on 24/04/17.
 */
public class Question {

    private Integer questionNum;

    private String questionDescription;

    private Collection<MultiMedia> medias;

    private Collection<QuestionChoice> questionChoices;

    private Collection<Answer> answers;

    private Integer timeAlloted;

    private boolean randomizeChoices;

    private Integer weightage;

    public Question(Integer questionNum, String questionDescription, Collection<MultiMedia> medias, Collection<QuestionChoice> questionChoices, Collection<Answer> answers, Integer timeAlloted, boolean randomizeChoices, Integer weightage) {
        this.questionNum = questionNum;
        this.questionDescription = questionDescription;
        this.medias = medias;
        this.questionChoices = questionChoices;
        this.answers = answers;
        this.timeAlloted = timeAlloted;
        randomizeChoices = false;
        this.weightage = weightage;
    }

    public Question() {
        randomizeChoices = false;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionNum=" + questionNum +
                ", questionDescription='" + questionDescription + '\'' +
                ", medias=" + medias +
                ", questionChoices=" + questionChoices +
                ", answers=" + answers +
                ", timeAlloted=" + timeAlloted +
                ", randomizeChoices=" + randomizeChoices +
                ", weightage=" + weightage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question)) return false;

        Question question = (Question) o;

        if (randomizeChoices != question.randomizeChoices) return false;
        if (!questionNum.equals(question.questionNum)) return false;
        if (!questionDescription.equals(question.questionDescription)) return false;
        if (medias != null ? !medias.equals(question.medias) : question.medias != null) return false;
        if (questionChoices != null ? !questionChoices.equals(question.questionChoices) : question.questionChoices != null)
            return false;
        if (!answers.equals(question.answers)) return false;
        if (timeAlloted != null ? !timeAlloted.equals(question.timeAlloted) : question.timeAlloted != null)
            return false;
        return weightage != null ? weightage.equals(question.weightage) : question.weightage == null;
    }

    @Override
    public int hashCode() {
        int result = questionNum.hashCode();
        result = 31 * result + questionDescription.hashCode();
        result = 31 * result + (medias != null ? medias.hashCode() : 0);
        result = 31 * result + (questionChoices != null ? questionChoices.hashCode() : 0);
        result = 31 * result + answers.hashCode();
        result = 31 * result + (timeAlloted != null ? timeAlloted.hashCode() : 0);
        result = 31 * result + (randomizeChoices ? 1 : 0);
        result = 31 * result + (weightage != null ? weightage.hashCode() : 0);
        return result;
    }

	public Integer getQuestionNum() {
		return questionNum;
	}

	public void setQuestionNum(Integer questionNum) {
		this.questionNum = questionNum;
	}

	public String getQuestionDescription() {
		return questionDescription;
	}

	public void setQuestionDescription(String questionDescription) {
		this.questionDescription = questionDescription;
	}

	public Collection<MultiMedia> getMedias() {
		return medias;
	}

	public void setMedias(Collection<MultiMedia> medias) {
		this.medias = medias;
	}

	public Collection<QuestionChoice> getQuestionChoices() {
		return questionChoices;
	}

	public void setQuestionChoices(Collection<QuestionChoice> questionChoices) {
		this.questionChoices = questionChoices;
	}

	public Collection<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(Collection<Answer> answers) {
		this.answers = answers;
	}

	public Integer getTimeAlloted() {
		return timeAlloted;
	}

	public void setTimeAlloted(Integer timeAlloted) {
		this.timeAlloted = timeAlloted;
	}

	public boolean isRandomizeChoices() {
		return randomizeChoices;
	}

	public void setRandomizeChoices(boolean randomizeChoices) {
		this.randomizeChoices = randomizeChoices;
	}

	public Integer getWeightage() {
		return weightage;
	}

	public void setWeightage(Integer weightage) {
		this.weightage = weightage;
	}
    
    
}
