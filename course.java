import java.lang.Object.*;
public class course implements Cloneable {
    private String coursename;
    private String[] students=new String[100];
    private int numofstu=0;

    public course(String coursename) {
        this.coursename = coursename;
    }

    public void addstu(String student){
        students[numofstu]=student;
        numofstu++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumofstu() {
        return numofstu;
    }

    public String getCoursename(){
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }

    public void setNumofstu(int numofstu) {
        this.numofstu = numofstu;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object obj =super.clone();
        return obj;
    }
}
