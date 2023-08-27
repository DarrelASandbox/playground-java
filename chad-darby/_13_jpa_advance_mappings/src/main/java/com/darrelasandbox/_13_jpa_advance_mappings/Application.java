package com.darrelasandbox._13_jpa_advance_mappings;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.darrelasandbox._13_jpa_advance_mappings.dao.AppDAO;
import com.darrelasandbox._13_jpa_advance_mappings.entity.Course;
import com.darrelasandbox._13_jpa_advance_mappings.entity.Instructor;
import com.darrelasandbox._13_jpa_advance_mappings.entity.InstructorDetail;
import com.darrelasandbox._13_jpa_advance_mappings.entity.Review;
import com.darrelasandbox._13_jpa_advance_mappings.entity.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO) {

		return runner -> {
			// Database: hb-01-one-to-one-uni
			// createInstructor(appDAO);
			// findInstructor(appDAO);
			// deleteInstructor(appDAO);
			// findInstructorDetail(appDAO);
			// deleteInstructorDetail(appDAO);

			// Database: hb-03-one-to-many
			// createInstructorWithCourses(appDAO);
			// findInstructorWithCourses(appDAO);
			// findCoursesForInstructor(appDAO);
			// findInstructorWithCoursesJoinFetch(appDAO);
			// updateInstructor(appDAO);
			// updateCourse(appDAO);
			// deleteInstructor(appDAO);
			// deleteCourse(appDAO);

			// Database: hb-04-one-to-many-uni
			// createCourseAndReviews(appDAO);
			// retrieveCourseAndReviews(appDAO);
			// deleteCourseAndReviews(appDAO);

			// Database: hb-05-many-to-many
			// createCourseAndStudents(appDAO);
			// findCourseAndStudents(appDAO);
			// findStudentAndCourses(appDAO);
			// addMoreCoursesForStudent(appDAO);
			// deleteStudent(appDAO);
		};
	}

	//
	// Database: hb-01-one-to-one-uni
	//

	@SuppressWarnings("unused")
	private void deleteInstructorDetail(AppDAO appDAO) {
		int theId = 4;
		System.out.println("Deleting instructor detail id: " + theId);
		appDAO.deleteInstructorDetailById(theId);
		System.out.println("Done!");
	}

	@SuppressWarnings("unused")
	private void findInstructorDetail(AppDAO appDAO) {
		int theId = 2;
		InstructorDetail tempInstructorDetail = appDAO.findInstructorDetailById(theId);
		System.out.println("tempInstructorDetail: " + tempInstructorDetail);
		System.out.println("the associated instructor: " + tempInstructorDetail.getInstructor());
		System.out.println("Done!");
	}

	@SuppressWarnings("unused")
	private void deleteInstructor(AppDAO appDAO) {
		int theId = 1;
		System.out.println("Deleting instructor id: " + theId);
		appDAO.deleteInstructorById(theId);
		System.out.println("Done!");
	}

	@SuppressWarnings("unused")
	private void findInstructor(AppDAO appDAO) {
		int theId = 2;
		System.out.println("Finding instructor id: " + theId);
		Instructor tempInstructor = appDAO.findInstructorById(theId);
		System.out.println("tempInstructor: " + tempInstructor);
		System.out.println("the associated instructorDetail only: " + tempInstructor.getInstructorDetail());

	}

	@SuppressWarnings("unused")
	private void createInstructor(AppDAO appDAO) {

		// Instructor tempInstructor = new Instructor("Chad", "Darby",
		// "darby@luv2code.com");
		// InstructorDetail tempInstructorDetail = new InstructorDetail(
		// "http://www.luv2code.com/youtube",
		// "Luv 2 code!!!");

		Instructor tempInstructor = new Instructor("Madhu", "Patel",
				"madhu@luv2code.com");
		InstructorDetail tempInstructorDetail = new InstructorDetail(
				"http://www.luv2code.com/youtube",
				"Guitar");

		// associate the objects
		tempInstructor.setInstructorDetail(tempInstructorDetail);

		// This will ALSO save the details object because of CascadeType.ALL
		System.out.println("Saving instructor: " + tempInstructor);
		appDAO.save(tempInstructor);
		System.out.println("Done!");
	}

	//
	// Database: hb-03-one-to-many
	// If you only need `Instructor` and no courses, then call
	// `appDAO.findInstructorById(...)`
	// If you need `Instructor` AND `courses`, then call
	// `appDAO.findInstructorByIdJoinFetch(...)`
	// This gives us flexibility instead of having eager fetch hard-coded
	//

	@SuppressWarnings("unused")
	private void deleteCourse(AppDAO appDAO) {
		int theId = 10;
		System.out.println("Deleting course id: " + theId);
		appDAO.deleteCourseById(theId);
		System.out.println("Done!");
	}

	@SuppressWarnings("unused")
	private void updateCourse(AppDAO appDAO) {
		int theId = 10;
		System.out.println("Finding course id: " + theId);
		Course tempCourse = appDAO.findCourseById(theId);
		System.out.println("Updating course id: " + theId);
		tempCourse.setTitle("Enjoy the Simple Things");
		appDAO.update(tempCourse);
		System.out.println("Done!");
	}

	@SuppressWarnings("unused")
	private void updateInstructor(AppDAO appDAO) {
		int theId = 1;
		System.out.println("Finding instructor id: " + theId);
		Instructor tempInstructor = appDAO.findInstructorById(theId);
		System.out.println("Updating instructor id: " + theId);
		tempInstructor.setLastName("TESTER");
		appDAO.update(tempInstructor);
		System.out.println("Done!");
	}

	@SuppressWarnings("unused")
	private void findInstructorWithCoursesJoinFetch(AppDAO appDAO) {
		int theId = 1;
		System.out.println("Finding instructor id: " + theId);
		Instructor tempInstructor = appDAO.findInstructorByIdJoinFetch(theId);
		System.out.println("tempInstructor: " + tempInstructor);
		System.out.println("the associated courses: " + tempInstructor.getCourses());
		System.out.println("Done!");
	}

	@SuppressWarnings("unused")
	private void findCoursesForInstructor(AppDAO appDAO) {

		int theId = 1;
		System.out.println("Finding instructor id: " + theId);
		Instructor tempInstructor = appDAO.findInstructorById(theId);
		System.out.println("tempInstructor: " + tempInstructor);
		System.out.println("Finding courses for instructor id: " + theId);
		List<Course> courses = appDAO.findCoursesByInstructorId(theId);

		// associate the objects
		tempInstructor.setCourses(courses);
		System.out.println("the associated courses: " + tempInstructor.getCourses());
		System.out.println("Done!");
	}

	// failed to lazily initialize a collection of role:
	// com.darrelasandbox._13_jpa_advance_mappings.entity.Instructor.courses: could
	// not initialize proxy - no Session
	// Quick solution: Change from default to `FetchType.EAGER`
	@SuppressWarnings("unused")
	private void findInstructorWithCourses(AppDAO appDAO) {
		int theId = 1;
		System.out.println("Finding instructor id: " + theId);
		Instructor tempInstructor = appDAO.findInstructorById(theId);
		System.out.println("tempInstructor: " + tempInstructor);
		System.out.println("the associated courses: " + tempInstructor.getCourses());
		System.out.println("Done!");
	}

	@SuppressWarnings("unused")
	private void createInstructorWithCourses(AppDAO appDAO) {

		Instructor tempInstructor = new Instructor("Susan", "Public", "susan.public@luv2code.com");

		InstructorDetail tempInstructorDetail = new InstructorDetail(
				"http://www.youtube.com",
				"Video Games");

		// associate the objects
		tempInstructor.setInstructorDetail(tempInstructorDetail);
		Course tempCourse1 = new Course("Air Guitar - The Ultimate Guide");
		Course tempCourse2 = new Course("The Pinball Masterclass");
		tempInstructor.add(tempCourse1);
		tempInstructor.add(tempCourse2);

		// This will ALSO save the courses because of CascadeType.PERSIST
		System.out.println("Saving instructor: " + tempInstructor);
		System.out.println("The courses: " + tempInstructor.getCourses());
		appDAO.save(tempInstructor);

		System.out.println("Done!");
	}

	//
	// Database: hb-04-one-to-many-uni
	//

	@SuppressWarnings("unused")
	private void deleteCourseAndReviews(AppDAO appDAO) {
		int theId = 10;
		System.out.println("Deleting course id: " + theId);
		appDAO.deleteCourseById(theId);
		System.out.println("Done!");
	}

	@SuppressWarnings("unused")
	private void retrieveCourseAndReviews(AppDAO appDAO) {
		int theId = 10;
		Course tempCourse = appDAO.findCourseAndReviewsByCourseId(theId);
		System.out.println(tempCourse);
		System.out.println(tempCourse.getReviews());
	}

	@SuppressWarnings("unused")
	private void createCourseAndReviews(AppDAO appDAO) {
		Course tempCourse = new Course("Pacman - How To Score One Million Points");
		tempCourse.addReview(new Review("Great course ... loved it!"));
		tempCourse.addReview(new Review("Cool course, job well done."));
		tempCourse.addReview(new Review("What a dumb course, you are an idiot!"));

		// Leverage the cascade all
		System.out.println("Saving the course");
		System.out.println(tempCourse);
		System.out.println(tempCourse.getReviews());
		appDAO.save(tempCourse);
		System.out.println("Done!");
	}

	//
	// hb-05-many-to-many
	//

	@SuppressWarnings("unused")
	private void deleteStudent(AppDAO appDAO) {
		int theId = 1;
		System.out.println("Deleting student id: " + theId);
		appDAO.deleteStudentById(theId);
		System.out.println("Done!");
	}

	@SuppressWarnings("unused")
	private void addMoreCoursesForStudent(AppDAO appDAO) {
		int theId = 2;
		Student tempStudent = appDAO.findStudentAndCoursesByStudentId(theId);
		Course tempCourse1 = new Course("Rubik's Cube - How to Speed Cube");
		Course tempCourse2 = new Course("Atari 2600 - Game Development");
		tempStudent.addCourse(tempCourse1);
		tempStudent.addCourse(tempCourse2);
		System.out.println("Updating student: " + tempStudent);
		System.out.println("associated courses: " + tempStudent.getCourses());
		appDAO.update(tempStudent);
		System.out.println("Done!");
	}

	@SuppressWarnings("unused")
	private void findStudentAndCourses(AppDAO appDAO) {
		int theId = 2;
		Student tempStudent = appDAO.findStudentAndCoursesByStudentId(theId);
		System.out.println("Loaded student: " + tempStudent);
		System.out.println("Courses: " + tempStudent.getCourses());
		System.out.println("Done!");
	}

	@SuppressWarnings("unused")
	private void findCourseAndStudents(AppDAO appDAO) {
		int theId = 10;
		Course tempCourse = appDAO.findCourseAndStudentsByCourseId(theId);
		System.out.println("Loaded course: " + tempCourse);
		System.out.println("Students: " + tempCourse.getStudents());
		System.out.println("Done!");
	}

	@SuppressWarnings("unused")
	private void createCourseAndStudents(AppDAO appDAO) {
		Course tempCourse = new Course("Pacman - How To Score One Million Points");
		Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
		Student tempStudent2 = new Student("Mary", "Public", "mary@luv2code.com");
		tempCourse.addStudent(tempStudent1);
		tempCourse.addStudent(tempStudent2);
		System.out.println("Saving the course: " + tempCourse);
		System.out.println("associated students: " + tempCourse.getStudents());
		appDAO.save(tempCourse);
		System.out.println("Done!");
	}
}
