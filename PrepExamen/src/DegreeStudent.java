public class DegreeStudent extends Student {
    public DegreeStudent(String studentNumber, String name, String surname, String course) {
        super(studentNumber, name, surname, course);
    }

    @Override
    public void study(){
        System.out.println(name + " " + surname + "is studying for the dipoma course in" + course);
    }
}
