package week5.assessment;

import week3.Coursework.Service;

public class CourseworkMain {

    public static void main(String args[]){

        CylinderGenerator cylinderGenerator = new CylinderGenerator();
        cylinderGenerator.run(5);
        cylinderGenerator.run(50);
        cylinderGenerator.run(500);
        cylinderGenerator.run(5000);
    }
}
