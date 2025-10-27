public abstract class Student {
    // Fields
    protected String studentNumber;
    protected String name;
    protected String surname;
    protected String course;

    public Student(String studentNumber, String name, String surname, String course) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    // Abastract method

    public abstract void study();

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course='" + course + '\'' +
                '}';
    }




}
