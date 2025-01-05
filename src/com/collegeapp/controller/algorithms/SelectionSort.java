/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.collegeapp.controller.algorithms;

import com.collegeapp.model.StudentModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Prithivi
 */
public class SelectionSort {

    public List<StudentModel> sortByLmuId(List<StudentModel> unsortedData, boolean isDesc) {
        
        List<StudentModel> dataToSort = new ArrayList(); 
        dataToSort.addAll(unsortedData);
        
        for (int i = 0; i < dataToSort.size() - 1; i++) {
            //min value
            int minIndex = i;
            for (int j = i + 1; j < dataToSort.size(); j++) {
                // compare and assign
                if (isDesc) {
                    if (dataToSort.get(j).getLmuId() > dataToSort.get(minIndex).getLmuId()) {
                        minIndex = j;
                    }
                } else {
                    if (dataToSort.get(j).getLmuId() < dataToSort.get(minIndex).getLmuId()) {
                        minIndex = j;
                    }
                }
            }
            //swap
            StudentModel tempStudent = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, tempStudent);
        }
        return dataToSort;
    }
    
     public List<StudentModel> sortByName(List<StudentModel> unsortedData, boolean isDesc) {
        
        List<StudentModel> dataToSort = new ArrayList(); 
        dataToSort.addAll(unsortedData);
        
        for (int i = 0; i < dataToSort.size() - 1; i++) {
            //min value
            int minIndex = i;
            for (int j = i + 1; j < dataToSort.size(); j++) {
                // compare and assign
                if (isDesc) {
                    if (dataToSort.get(j).getName().compareToIgnoreCase(dataToSort.get(minIndex).getName())>0 ) {
                        minIndex = j;
                    }
                } else {
                    if (dataToSort.get(j).getName().compareToIgnoreCase(dataToSort.get(minIndex).getName())<0) {
                        minIndex = j;
                    }
                }
            }
            //swap
            StudentModel tempStudent = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, tempStudent);
        }
        return dataToSort;
    }

}