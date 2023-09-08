package src._10oop;

class Subject {
  private String subjectID;
  private String name;
  private int maxMarks;
  private int marksObtain;

  public Subject(String subjectID, String name) {
    this.subjectID = subjectID;
    this.name = name;
    this.maxMarks = 100;
  }

  public Subject(String subjectID, String name, int marksObtain) {
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

class Student {
  private int enrollmentNo;
  private String name;
  private String dept;
  private Subject[] subjects;

  public Student(int enrollmentNo, String name, String dept, Subject[] subjects) {
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

  public Subject[] getSubjects() {
    return subjects;
  }

  public void setSubjects(Subject[] subjects) {
    this.subjects = subjects;
  }
}

public class _06StudentAndSubjects {
  public static void main(String[] args) {
    Subject subs[] = new Subject[3];
    subs[0] = new Subject("s101", "DS");
    subs[1] = new Subject("s102", "Algorithms");
    subs[2] = new Subject("s103", "Operating Systems");

    for (Subject subject : subs)
      System.out.println(subject);
  }
}
