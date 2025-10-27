public class DiplomaStudent extends Student {
    public DiplomaStudent(String studentNumber, String name, String surname, String course) {
        super(studentNumber, name, surname, course);
    }

    @Override
    public void study(){
        System.out.println(name +" " + surname + "is studying for the diploma course in " + course);
    }
}
