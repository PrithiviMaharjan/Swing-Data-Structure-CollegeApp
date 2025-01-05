/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.collegeapp.controller.algorithms;

import com.collegeapp.model.StudentModel;
import java.util.List;

/**
 *
 * @author Prithivi
 */
public class BinarySearch {

    public StudentModel searchByName(String searchValue, List<StudentModel> studentList,
            int left, int right) {

        if (right < left) {
            return null;
        }

        int mid = (left + right) / 2;

        if (searchValue.toLowerCase().equals(studentList.get(mid).getName().toLowerCase())) {
            return studentList.get(mid);
        } else if (searchValue.compareToIgnoreCase(studentList.get(mid).getName()) < 0) {
            return searchByName(searchValue, studentList, left, mid - 1);
        } else {
            return searchByName(searchValue, studentList, mid + 1, right);
        }

    }
}