package com.darrelasandbox._13_jpa_advance_mappings.dao;

import java.util.List;

import com.darrelasandbox._13_jpa_advance_mappings.entity.Course;
import com.darrelasandbox._13_jpa_advance_mappings.entity.Instructor;
import com.darrelasandbox._13_jpa_advance_mappings.entity.InstructorDetail;
import com.darrelasandbox._13_jpa_advance_mappings.entity.Student;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);

    List<Course> findCoursesByInstructorId(int theId);

    Instructor findInstructorByIdJoinFetch(int theId);

    void update(Instructor tempInstructor);

    void update(Course tempCourse);

    Course findCourseById(int theId);

    void deleteCourseById(int theId);

    void save(Course theCourse);

    Course findCourseAndReviewsByCourseId(int theId);

    Course findCourseAndStudentsByCourseId(int theId);

    Student findStudentAndCoursesByStudentId(int theId);

    void update(Student tempStudent);

    void deleteStudentById(int theId);
}
