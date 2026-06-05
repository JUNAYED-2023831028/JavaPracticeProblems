package PracticeProblem7;

class Student {
    long ID;
    String Name;
    String Program;

    Student(long ID, String Name, String Program) {
        this.ID = ID;
        this.Name = Name;
        this.Program = Program;
    }
}

class Instructor {
    long ID;
    String Name;
    String Department;
    String Title;

    Instructor(long ID, String Name, String Department, String Title) {
        this.ID = ID;
        this.Name = Name;
        this.Department = Department;
        this.Title = Title;
    }
}

class Course {
    long ID;
    String Syllabus;
    String Title;
    String Credits;
    String Prerequisite;

    Course(long ID, String Syllabus, String Title, String Credits, String Prerequisite) {
        this.ID = ID;
        this.Syllabus = Syllabus;
        this.Title = Title;
        this.Credits = Credits;
        this.Prerequisite = Prerequisite;
    }
}

class CourseOffering {
    long StudentID;
    long InstructorID;
    long CourseID;
    String Time;
    long SectionNo;
    long RoomId;
    long Year;
    String Semester;

    CourseOffering(long StudentID, long InstructorID, long CourseID, String Time, long SectionNo, long RoomId, long Year, String Semester) {
        this.StudentID = StudentID;
        this.InstructorID = InstructorID;
        this.CourseID = CourseID;
        this.Time = Time;
        this.SectionNo = SectionNo;
        this.RoomId = RoomId;
        this.Year = Year;
        this.Semester = Semester;
    }
}

public class PP7 {
    public static void main(String[] args) {
        Student s = new Student(2023831028, "Junayed", "SWE");
        Instructor i = new Instructor(100, "Rakib sir", "SWE", "Lecturer");
        Course c = new Course(1000, "OOP", "Object Oriented Programming", "3.0", "SPL");

        CourseOffering co = new CourseOffering(s.ID, i.ID, c.ID, "2026", 1, 203, 2026, "2 1");

        System.out.println(co.StudentID);
        System.out.println(co.InstructorID);
        System.out.println(co.CourseID);
    }
}