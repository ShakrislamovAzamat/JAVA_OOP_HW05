package Seminar_11.src.service;

import java.util.List;

import Seminar_11.src.model.Student;
import Seminar_11.src.model.StudentGroup;
import Seminar_11.src.model.Teacher;

public class StudentGroupService {

    private int groupID;

    public StudentGroup createStudentGroup (Teacher teacher, List<Student> studentList){
        this.groupID = groupID + 1;
        StudentGroup studentGroup = new StudentGroup(groupID, teacher, studentList);
        return studentGroup;
    }





}
