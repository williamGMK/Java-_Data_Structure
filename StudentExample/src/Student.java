public abstract class Student {
    // files or attributes
    protected String studentNumbers;
    protected String name ;
    protected String surname;
    protected String course;

    public Student(String studentNumbers, String name, String surname, String course) {
        this.studentNumbers = studentNumbers;
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public abstract void study();
    @Override
    public String toString(){
        return "Students Number:"+ studentNumbers + ", Name" + name + ",surname"+ surname+",course"+course;
    }
}
