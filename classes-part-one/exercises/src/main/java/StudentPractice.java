public class StudentPractice {
    public static void main(String[] args){
        //instantiate your Student class below
        Student student = new Student("Whitney", 12345, 1, 4.0);
        String name = student.getName();
        int studentId = student.getStudentId();
        int numberOfCredits = student.getNumberOfCredits();
        double gpa = student.getGpa();


    }
}
