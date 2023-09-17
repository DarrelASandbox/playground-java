package src._15staticAndFinal;

import java.util.Date;

class Student3 {
  private String enrollmentNo;
  private static int count = 0;

  public Student3() {
    this.enrollmentNo = generateEnrollmentNo();
  }

  public String getEnrollmentNo() {
    return enrollmentNo;
  }

  private String generateEnrollmentNo() {
    Date d = new Date();
    count++;
    return "Batch-" + (d.getYear() + 1900) + "-" + count;
  }
}

public class _03StudentEnrollment {
  public static void main(String[] args) {
    Student3 s1 = new Student3();
    Student3 s2 = new Student3();
    Student3 s3 = new Student3();

    System.out.println(s1.getEnrollmentNo());
    System.out.println(s2.getEnrollmentNo());
    System.out.println(s3.getEnrollmentNo());
  }
}
