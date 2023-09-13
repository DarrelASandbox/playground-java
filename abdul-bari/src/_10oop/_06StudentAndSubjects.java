package src._10oop;

class Subject2 {
  private String subjectID;
  private String name;
  private int maxMarks;
  private int marksObtain;

  public Subject2(String subjectID, String name) {
    this.subjectID = subjectID;
    this.name = name;
    this.maxMarks = 100;
  }

  public Subject2(String subjectID, String name, int marksObtain) {
    this.subjectID = subjectID;
    this.name = name;
    this.maxMarks = 100;
    this.marksObtain = marksObtain;
  }

  public String getSubjectID() {
    return subjectID;
  }

  public String getName() {
    return name;
  }

  public int getMaxMarks() {
    return maxMarks;
  }

  public int getMarksObtain() {
    return marksObtain;
  }

  public void setMarksObtain(int marksObtain) {
    this.marksObtain = marksObtain;
  }

  boolean isQualified() {
    return marksObtain >= maxMarks / 10 * 4;
  }

  public String toString() {
    return "\n SubjectID: " + subjectID + "\n Name " + name + "\n MarksObtained " + marksObtain;
  }
}

class Student2 {
  private int enrollmentNo;
  private String name;
  private String dept;
  private Subject2[] subjects;

  public Student2(int enrollmentNo, String name, String dept, Subject2[] subjects) {
    this.enrollmentNo = enrollmentNo;
    this.name = name;
    this.dept = dept;
    this.subjects = subjects;
  }

  public int getEnrollmentNo() {
    return enrollmentNo;
  }

  public void setEnrollmentNo(int enrollmentNo) {
    this.enrollmentNo = enrollmentNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public Subject2[] getSubjects() {
    return subjects;
  }

  public void setSubjects(Subject2[] subjects) {
    this.subjects = subjects;
  }
}

public class _06StudentAndSubjects {
  public static void main(String[] args) {
    Subject2 subs[] = new Subject2[3];
    subs[0] = new Subject2("s101", "DS");
    subs[1] = new Subject2("s102", "Algorithms");
    subs[2] = new Subject2("s103", "Operating Systems");

    for (Subject2 subject : subs)
      System.out.println(subject);
  }
}
