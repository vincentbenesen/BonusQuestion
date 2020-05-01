/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonusquestion;

/**
 * This file is used to test the Question class
 * @author Vincent Benesen &lt;vincebry0803@yahoo.com&gt;
 */
public class BonusQuestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Question question1 = new Question("What is your name?");
        Question question2 = new Question("How old are you?");
        
        System.out.println("Q1: " + question1.getQuestions());
        System.out.println("Q2: " + question2.getQuestions());
                
        
    }
    
}
