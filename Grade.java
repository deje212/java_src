public class Grade {
    public static void main(String[] args)
    {
        
        Float quiz_score =new Float(1000);
        Float uas_score = new Float(75.5);
        Float uts_score = new Float(75.5);
        showGrade(quiz_score,uas_score, uts_score);
    }

static void showGrade(Float quiz_score,Float uas_score,Float uts_score){

    Float avg;
    avg=(quiz_score+uts_score+uas_score)/3;

    if(avg>=90 && (avg<100)) System.out.println("Your grade A.");
    else if((avg>=70) && (avg<90)) System.out.println("Your grade B.");
    else if((avg>=50) && (avg<70)) System.out.println("Your grade C.");
    else if(avg<50) System.out.println("Your grade F.");
    else System.out.println("Invalid");
    

 }

    
}
