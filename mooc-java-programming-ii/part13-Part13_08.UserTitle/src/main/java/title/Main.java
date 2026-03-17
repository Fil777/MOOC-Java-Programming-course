/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package title;

import java.util.Scanner;
import javafx.application.Application;

/**
 *
 * @author Fil
 */
public class Main {
        public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the title: ");
        String title = reader.nextLine();

        Application.launch(UserTitle.class, "--title=" + title);
    }
}
