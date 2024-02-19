package day22.step5;

public class Course {
    public static void registerCourse1(Applicant<?> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"가 1수업을 수강함");
    }
    public static void registerCourse2(Applicant<? extends Students> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"가 2수업을 수강함");
    }
    public static void registerCourse3(Applicant<? super Worker> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"가 3수업을 수강함");
    }
    public static void registerCourse4(Applicant<? super MiddleStudent> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"가 3수업을 수강함");
    }
}
