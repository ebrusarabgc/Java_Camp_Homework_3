package Homework3;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.id = 3903;
        student1.name = "Ebru Şara Bağca";
        student1.email = "abc@xyz.com";
        student1.school = "Eskişehir Teknik Üniversitesi";

        Instructor instructor1 = new Instructor();
        instructor1.id = 4324;
        instructor1.name = "Engin Demiroğ";
        instructor1.email = "def@xyz.com";

        User[] users = {student1,instructor1};

        UserManager userManager = new UserManager();
        StudentManager studentManager = new StudentManager();
        InstructorManager instructorManager = new InstructorManager();

        userManager.signIn();
        userManager.addComment();
        studentManager.enrollForLesson();
        studentManager.homework();
        studentManager.inspection();
        studentManager.percentageCompletion();
        instructorManager.addHomework();
        instructorManager.addLesson();
    }
}
