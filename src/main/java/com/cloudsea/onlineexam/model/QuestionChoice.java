package com.cloudsea.onlineexam.model;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by deepas on 24/04/17.
 */
public class QuestionChoice implements Serializable{

    private String choiceNum;

    private String choiceDesc;

    private Collection<MultiMedia> media;

    public QuestionChoice(String choiceNum, String choiceDesc, Collection<MultiMedia> media) {
        this.choiceNum = choiceNum;
        this.choiceDesc = choiceDesc;
        this.media = media;
    }

    public QuestionChoice() {
    }

    @Override
    public String toString() {
        return "QuestionChoice{" +
                "choiceNum='" + choiceNum + '\'' +
                ", choiceDesc='" + choiceDesc + '\'' +
                ", media=" + media +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuestionChoice)) return false;

        QuestionChoice that = (QuestionChoice) o;

        if (!choiceNum.equals(that.choiceNum)) return false;
        if (!choiceDesc.equals(that.choiceDesc)) return false;
        return media != null ? media.equals(that.media) : that.media == null;
    }

    @Override
    public int hashCode() {
        int result = choiceNum.hashCode();
        result = 31 * result + choiceDesc.hashCode();
        result = 31 * result + (media != null ? media.hashCode() : 0);
        return result;
    }

	public String getChoiceNum() {
		return choiceNum;
	}

	public void setChoiceNum(String choiceNum) {
		this.choiceNum = choiceNum;
	}

	public String getChoiceDesc() {
		return choiceDesc;
	}

	public void setChoiceDesc(String choiceDesc) {
		this.choiceDesc = choiceDesc;
	}

	public Collection<MultiMedia> getMedia() {
		return media;
	}

	public void setMedia(Collection<MultiMedia> media) {
		this.media = media;
	}
    
    
}
