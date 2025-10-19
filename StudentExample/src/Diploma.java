public class Diploma extends Student {


    public Diploma(String studentNumbers, String name, String surname, String course) {
        super(studentNumbers, name, surname, course);
    }
    @Override
    public void study(){
        System.out.println(name+" "+surname+"is studying for the diploma course in"+course);
    }
}
