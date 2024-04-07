package Seminar_11.src.controller;

import java.util.ArrayList;
import java.util.List;

import Seminar_11.src.model.Student;
import Seminar_11.src.model.Teacher;
import Seminar_11.src.model.Type;
import Seminar_11.src.model.User;
import Seminar_11.src.service.DataService;
import Seminar_11.src.service.StudentGroupService;
import Seminar_11.src.view.StudentView;

public class Controller {

    private final DataService service = new DataService();

    private final StudentView view = new StudentView();

    private final StudentGroupService studentGroupService = new StudentGroupService();

    public void createStudent(String firstName, String lastName, String middleName) {
        service.create(firstName, lastName, middleName, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            Student student = (Student) user;
            view.printOnConsole(student);
        }
    }

    public void createStudentGroup(Integer teacherID, List<Integer> studentList) {
        Teacher teacher = (Teacher) service.getUserByID(Type.TEACHER, teacherID);
        List<Student> students = new ArrayList<>();
        for (Integer id : studentList) {
            students.add((Student) service.getUserByID(Type.STUDENT, id));
        }
        studentGroupService.createStudentGroup(teacher, students);
    }

}
