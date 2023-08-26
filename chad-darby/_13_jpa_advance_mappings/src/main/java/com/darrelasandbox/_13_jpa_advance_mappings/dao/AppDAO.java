package com.darrelasandbox._13_jpa_advance_mappings.dao;

import com.darrelasandbox._13_jpa_advance_mappings.entity.Instructor;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

}
