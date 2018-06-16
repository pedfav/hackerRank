package ThirtyDaysOfCode.Day_12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student extends Person{
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    public Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }


    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public String calculate(){
        int total = 0;
        String ret = "";

        for (int i : testScores) {
            total += i;
        }

        total = total/testScores.length;

        if(total >= 90 && total <=100){
            ret = "O";
        } else if(total >= 80 && total < 90){
            ret = "E";
        } else if(total >= 70 && total < 80){
            ret = "A";
        } else if(total >= 55 && total < 70){
            ret = "P";
        } else if(total >= 40 && total < 50){
            ret = "D";
        } else if(total < 40){
            ret = "T";
        }
        return ret;
    }
}