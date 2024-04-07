package Seminar_11.src.model;

import java.util.List;

public class StudentGroup {

    int groupID;
    Teacher teacher;
    List<Student> studentList;

    public StudentGroup(int groupID, Teacher teacher, List<Student> studentList) {
        this.groupID = groupID;
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public int getGroupId() {
        return this.groupID;
    }

    public void setGroupId(int id) {
        this.groupID = id;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return this.studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

}
