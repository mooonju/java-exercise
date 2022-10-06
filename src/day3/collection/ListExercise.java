package day3.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    private List<String> students;
    // 초기화 방법
    // 1. List<String> students = new ArrayList<>();
    // 2. this.students = new ArrayList<>();
    public ListExercise() {
        this.students = new ArrayList<>();
        this.students.add("조문주");
    }

    public List<String > getStudents(){
        return this.students;
    }
}
