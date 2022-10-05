package day2.collection;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    // class 이름 변경 shift + F6

    private List<String> students = new ArrayList<>();

    public LikeLion2th() {
        Names names = new Names();
        this.students = names.names();

    }

    // 멋사자 2기 학생의 이름이 들어있는 list를 return하는 method
    public List<String> getStudentList(){
        return this.students;
    }
}
