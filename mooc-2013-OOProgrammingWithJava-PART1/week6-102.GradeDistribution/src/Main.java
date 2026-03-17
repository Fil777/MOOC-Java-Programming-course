import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        String input = "34\n41\n53\n36\n55\n27\n43\n40\n-1";
//        String input = "44\n12\n58\n29\n60\n-1";
//        String input = "34\n-1";
//        String input = "34\n41\n53\n36\n55\n27\n43\n35\n40\n11\n-1";
//        String input = "42\n61\n15\n-2\n-1";
//        Scanner reader = new Scanner(input);

        Scanner reader = new Scanner(System.in);
        
        ExamResults examData = new ExamResults();
        
        System.out.println("Type exam scores, -1 completes: ");
        while (true){
            int score = Integer.parseInt(reader.nextLine());
            if (score == -1) break;
            examData.add(score);
        }
        
        int[] totalOfGrades = new int[Grades.grades.length];
        for (int i = 0; i < Grades.grades.length; i++){
            for (int k =0; k < examData.size(); k++)
                if (examData.getGrade(k) == Grades.grades[i]) 
                    totalOfGrades[i]++;
            }
        
        System.out.println("Grade distribution: ");
        for (int l = totalOfGrades.length - 1; l > 0; l--) {
            System.out.println(Grades.grades[l] + ": " + stars(totalOfGrades[l]));
        }    
        
        System.out.println("Acceptance percentage: " 
                + (100.0 * (examData.size() - totalOfGrades[0] - totalOfGrades[1])) 
                        / (examData.size() - totalOfGrades[0])); 
    }
    
    public static String stars(int len){
        String stars = "";
        for (int i = 0; i < len; i++) stars += '*';
        return stars;
    }
}
