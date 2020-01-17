import java.util.ArrayList;
import java.util.List;

public class Generics {


}


class Student {


}

class JuniorStudent extends Student {

}

class SeniorStudent extends Student {

}

class ExamProcessorOld {
    public void processJuniorResults(JuniorStudent[] students) {

    }

    public void processSeniorResults(SeniorStudent[] students) {

    }

    public void processStudentResults(Object[] students) {

    }


}

interface ExamProcessor<Y>
{
    void processResult(Y student);
    void processResult(Y student,double height, String fullname);
    void processResults(Y[] students);
    void processResults2(List<Y> students);

    //JuniorStudent getJuniorStudent(int index);
    //SeniorStudent getSeniorStudent(int index);

     Y getStudent(int index);
}

interface ExamProcessorInterface
{
    void processResult(JuniorStudent student);
    void processResult(SeniorStudent student);
    void processResults(JuniorStudent[] students);
    void processResults(SeniorStudent[] students);
    void processResults2(List<JuniorStudent> students);
    void processResults3(List<SeniorStudent> student);
}

class ExamProcessor2<T>  implements ExamProcessor<T>
{
    List<T> list = new ArrayList<T>();

    public void processResult(T student) {
        list.add(student);
    }

    public void processResult(T student,double height, String fullname)
    {

    }

    public void processResults(T[] students) {
        for (T item : students) {
            list.add(item);
        }
    }

    public void processResults2(List<T> students) {
        list.addAll(students);
    }

    public T getStudent(int index)
    {
        return null;
    }
}


class StudentsList {

    ExamProcessor2<JuniorStudent> juniorStudentExamProcessor = new ExamProcessor2<>();
    ExamProcessor2<SeniorStudent> seniorStudentExamProcessor2 = new ExamProcessor2<SeniorStudent>();

    private JuniorStudent[] list = new JuniorStudent[100];

    private List list2 = new ArrayList();

    private List<JuniorStudent> juniorStudents = new ArrayList<JuniorStudent>();
    private ArrayList<SeniorStudent> seniorStudents = new ArrayList<SeniorStudent>();

    public void addStudent(int index, JuniorStudent student) {
        list[index] = student;
    }

    public JuniorStudent getStudent(int index) {
        return list[index];
    }

    public void addJuniorStudent(JuniorStudent student) {
        list2.add(student);
    }

    public void addJuniorStudent(int index,JuniorStudent student) {
        juniorStudents.add(index,student);
    }
    public void addJuniorStudent2(JuniorStudent student) {
        juniorStudents.add(student);

        //SeniorStudent seniorStudent=new SeniorStudent();
        //juniorStudents.add(seniorStudent);
    }

    public void addSeniorStudent(SeniorStudent student) {
        list2.add(student);
    }

    //5
    public JuniorStudent getJuniorStudent(int index) {
        JuniorStudent student = (JuniorStudent) list2.get(index);
        return student;
        //return list2.get(index);
    }

    //type safety
    public JuniorStudent getJuniorStudent2(int index) {
        JuniorStudent student = juniorStudents.get(index);
        return student;
        //return list2.get(index);

    }

    public SeniorStudent getSeniorStudent(int index) {
        SeniorStudent student = (SeniorStudent) list2.get(index);

        return student;
        //return list2.get(index);
    }

    public void processJuniorResults(List<JuniorStudent> students) {
        juniorStudentExamProcessor.processResults2(students);

    }

}