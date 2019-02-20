/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dwianto
 */
public class Grade {
    public static void main(String[] args)
    { 
        Float quiz_score =new Float(100);
        Float uas_score = new Float(75.5);
        Float uts_score = new Float(75.5);
        
        String grade = showGrade(quiz_score,uas_score, uts_score);
       
        System.out.println(grade);
    }

static String showGrade(Float quiz_score,Float uas_score,Float uts_score){

    Float avg;
    String grade;
    avg=(quiz_score+uts_score+uas_score)/3;
    
    if(avg>=90 && (avg<100)) grade = "A";
    else if((avg>=70) && (avg<90)) grade = "B";
    else if((avg>=50) && (avg<70)) grade = "C";
    else if(avg<50) grade = "F";
    else grade = "invalid";
    
    return grade;

 }

    
}
