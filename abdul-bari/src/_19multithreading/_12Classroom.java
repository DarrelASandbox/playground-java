package src._19multithreading;

class Whiteboard {
  String text;
  int noOfStudents = 0;
  int count = 0; // Number of students who have taken the note

  public void attendance() {
    noOfStudents++;
  }

  synchronized public void write(String t) {
    System.out.println("Teacher is writing " + t);
    while (count != 0) {
      try {
        wait();
      } catch (Exception e) {
      }
    }

    text = t;
    count = noOfStudents;
    notifyAll();
  }

  synchronized public String read() {
    while (count == 0) {
      try {
        wait();
      } catch (Exception e) {
      }
    }

    String t = text;
    count--;
    if (count == 0)
      notifyAll();
    return t;
  }

}

class Teacher extends Thread {
  Whiteboard wb;

  String notes[] = {
      "Java is language",
      "It is OOPs",
      "It is Platform Independent",
      "It supports Thread",
      "end" };

  public Teacher(Whiteboard w) {
    wb = w;
    start();
  }

  public void run() {
    for (int i = 0; i < notes.length; i++) {
      wb.write(notes[i]);
    }
  }
}

class Student4 extends Thread {
  String name;
  Whiteboard wb;

  public Student4(String n, Whiteboard w) {
    name = n;
    wb = w;
    start();
  }

  public void run() {
    String text;
    wb.attendance();

    do {
      text = wb.read();
      System.out.println(name + " reading " + text);
      System.out.flush();
    } while (!text.equals("end"));
  }
}

public class _12Classroom {
  public static void main(String[] args) {
    Whiteboard wb = new Whiteboard();
    new Teacher(wb);

    new Student4("1. John", wb);
    new Student4("2. Jay", wb);
    new Student4("3. Kon", wb);
    new Student4("4. Smith", wb);

  }
}
