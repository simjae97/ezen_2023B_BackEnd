package day22.step5;

public class Step5 {
    public static void main(String[] args) {
        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<Students>(new Students()));
        Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));

        //Course.registerCourse2(new Applicant<Person>(new Person()));
        //Course.registerCourse2(new Applicant<Worker>(new Worker()));
        Course.registerCourse2(new Applicant<Students>(new Students()));
        Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));

        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
        //Course.registerCourse3(new Applicant<Students>(new Students()));
        //Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
        //Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));

        Course.registerCourse4(new Applicant<Person>(new Person()));
        //Course.registerCourse4(new Applicant<Worker>(new Worker()));
        Course.registerCourse4(new Applicant<Students>(new Students()));
        //Course.registerCourse4(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse4(new Applicant<MiddleStudent>(new MiddleStudent()));
    }
}
