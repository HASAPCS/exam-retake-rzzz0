package com.example;

import java.util.List;

public class SeatingChart {
    private Student[][] seats;

    // Constructor to implement a)
    public SeatingChart(List<Student> studentList, int rows, int cols) {
        int counter = 0;
        seats = new Student[rows][cols];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                if (counter < studentList.size()) {
                    seats[j][i] = studentList.get(counter);
                    counter++;
                }
                else {
                    seats[j][i] = null;
                }
            }
        }
        // Your Implementation here
    }

    // Method to implement b)
    public int removeAbsentStudents(int allowedAbsences) {

        // Your Implementation here
    }

    public Student[][] getSeats() {
        return seats;
    }
}
