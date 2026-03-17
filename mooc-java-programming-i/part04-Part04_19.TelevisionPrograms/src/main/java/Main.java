import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give programs: ");
        while (true) {
            String programName = scanner.nextLine();
            if (programName.isEmpty()) {
                break;
            }
            int programDuration = Integer.valueOf(scanner.nextLine());
            
            TelevisionProgram program = new TelevisionProgram(programName, programDuration);
            programs.add(program);
        }
        System.out.println("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        
        for (TelevisionProgram program : programs){
            if (program.getDuration() <= maxDuration) {
                System.out.println(program.toString());
            }
        }
    }
}
