/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day12;

import java.util.Objects;

/**
 *
 * @author MB-study
 */
public class Exam {
    private String subject;
    private  int score;

    public Exam(String subject, int score) {
        this.subject = subject;
        this.score = score;
    }

    public Exam() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Exam{" + "subject=" + subject + ", score=" + score + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.subject);
        hash = 59 * hash + this.score;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Exam other = (Exam) obj;
        if (this.score != other.score) {
            return false;
        }
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        return true;
    }
    
}
