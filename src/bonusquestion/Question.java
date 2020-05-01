/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonusquestion;

/**
 * This class creates an object of a  question. The method here can get the question from
 * the object you created.
 * @author Vincent Benesen &lt;vincebry0803@yahoo.com&gt;
 */
public class Question {

    private String questions;
    
    public Question (String question){
        this.questions = question;
    }
    
    public String getQuestions(){
        return questions;
    }
}
