package Files_Exceptions;

public class Students {

    private String studentEmail, studentName;

    //Constructor of a Student
    public Students(String studentEmail, String studentName){
        this.studentEmail = studentEmail;
        this.studentName = studentName;
    }

    // Getters for the students attributes (as they are private)
    public String getStudentEmail(){
        return studentEmail;
    }

    public String getStudentName(){
        return studentName;
    }
}

