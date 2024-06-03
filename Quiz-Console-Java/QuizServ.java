import java.util.Arrays;
import java.util.Scanner;

public class QuizServ {
    Question ques[] = new Question[5];
    private String opt[] = {"1","2","3","4"};

    public QuizServ() {
        ques[0] = new Question("Size of Int", 1, "4",opt );
        ques[1] = new Question("Size of byte", 2, "1", opt);
        ques[2] = new Question("Size of char", 3, "2", opt);
        ques[3] = new Question("Size of Float", 4, "4", opt);
        ques[4] = new Question("Size of Boolean", 5, "1", opt);
    }

    public void playquiz()
    {
        int score =0;
        String ans="";
        for(int i =0; i< 5;i++){
            Question q = ques[i];
            System.out.println(q.getId()+ ": "+q.getQuestion()+"\nOptions: "+Arrays.toString(q.getOptions())+"\n");
            Scanner sc = new Scanner(System.in);
            System.out.println("Your Ans:");
            try {
                ans = sc.next();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Terminating play\ncurrent score ="+score);
                break;
            }
            if(ans.equals(q.getAnswer())){
                score++;
            }
            

        }
        System.out.println("Your score is "+score);
    }
    

}
