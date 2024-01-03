package com.example;

import java.util.List;

public class SeatingChart {
    private Student[][] seats;

    // Constructor to implement a)
    public SeatingChart(List<Student> studentList, int rows, int cols) {
        int counter = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j< cols; j++){
                seats[i][j] = studentList.get(counter);
                counter++;

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
