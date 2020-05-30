/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day07;

/**
 *
 * @author MB-study
 */
public class Exam {
    private String name;
    private int Score;

    public Exam() {
    }

    public Exam(String name, int Score) {
        this.name = name;
        this.Score = Score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

    @Override
    public String toString() {
        return "Exam{" + "name=" + name + ", Score=" + Score + '}';
    }
    
}
