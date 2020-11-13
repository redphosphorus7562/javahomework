public class using2 {
    public static void main(String[] args) throws CloneNotSupportedException{
        course a =new course("math");
        a.addstu("henry");
        course b= (course) a.clone();
        System.out.println(b.getCoursename());
        a.setCoursename("chinese");
        System.out.println(b.getCoursename());
    }
}
