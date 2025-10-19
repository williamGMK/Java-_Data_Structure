public class DegreeStudents extends Student{
    public DegreeStudents(String studentNumbers, String name, String surname, String course) {
        super(studentNumbers, name,surname,course);
    }

    @Override
    public void study(){
        System.out.println(name+" "+surname+"is studying for the diploma course in"+course);
    }
}
