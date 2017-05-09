package com.cloudsea.onlineexam.model;

/**
 * Created by deepas on 23/04/17.
 */
public enum QuestionType {
    /**
     * MCQ-Multiple choice Questions
     * DESCRIPTIVE- Theoretical questions which require descriptive answers
     * MULTIMEDIA- Images or video based question
     * HYBRID- Combination of MCQ and DESCRIPTIVE
     * CODE- Code Snippets based questions
     */
    MCQ("mcq"), DESCRIPTIVE("descriptive"), HYBRID("hybrid"), MULTIMEDIA("multimedia"), CODE("code");

    private final String val;

    private QuestionType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}
