import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String q1 = "What color is apples?\n" 
        + "(a)brown\n(b)blue\n(c)green\n";
        String q2 = "What color is banana?\n"
         + "(a)yellow\n(b)blue\n(c)pink\n";

        Question[]  questions =  {
            new Question(q1, "c"),
            new Question(q2, "a")
        };

        takeTest(questions);

        
    }
    
    public static void takeTest (Question[] questions){
        int score = 0;
        try (Scanner KeyboardInput = new Scanner(System.in)) {
            for(int i = 0; i < questions.length; i++){
                System.out.println(questions[i].prompt);
                String answer = KeyboardInput.nextLine();
                if(answer.equals(questions[i].answer)){
                    score ++;
                }
            }
        }
        System.out.println("You scored " + score + "/" + questions.length +".");
    }
}
