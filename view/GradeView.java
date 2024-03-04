package view;

import model.Subject;
import model.User;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main(Scanner sc) {

        System.out.println("다음은 한 학생의 과목 점수이다.");

        System.out.println("이름 : ");
        System.out.println("국어점수 : ");
        System.out.println("영어점수 : ");
        System.out.println("수학점수 : ");
        System.out.println("평균 점수를 구하시오");

        UtilService util = UtilServiceImpl.getInstance();
        GradeService grade = GradeServiceImpl.getInstance();
        User student = User.builder()
                .username(sc.next())
                .build();

        Subject subjects = Subject.builder()
                .kor(util.createRandomInteger(0, 100))
                .eng(util.createRandomInteger(0, 100))
                .math(util.createRandomInteger(0, 100))
                .build();


        int totalScore = grade.getTotal(subjects);
        double avg = grade.findAvg(totalScore);

        System.out.printf(" ============= 성적표 ==============\n" +
                "kor : %s \n" +
                "eng : %s \n" +
                "math : %s \n" +
                "Total : %s \n" +
                "Avg : %s",
                String.valueOf(subjects.getKor()),
                String.valueOf(subjects.getEng()),
                String.valueOf(subjects.getMath()),
                String.valueOf(totalScore),
                String.valueOf(avg));

//        Subject subject = new SubjectBuilder()
//                .kor(sc.nextInt())
//                .eng(sc.nextInt())
//                .math(sc.nextInt())
//                .build();
//        System.out.println(subject.toString());

//        System.out.printf("이름 : ");
//        String name = sc.next();
//        Subject.setUserName(sc.next());

//        System.out.printf("국어점수 : ");
//        int kor = sc.nextInt();
//        model.setKor(kor);
//
//        System.out.printf("영어점수 : ");
//        int eng = sc.nextInt();
//        model.setEng(eng);
//
//        System.out.printf("수학점수 : ");
//        int math = sc.nextInt();
//        model.setMath(math);


//        System.out.println("평균 점수를 구하시오");
//        int avg = (kor+eng+math)/3;
//        model.setAvg(avg);


//        System.out.println("이름 : "+model.getUserName());
//        System.out.println("국어점수 : "+model.getKor());
//        System.out.println("영어점수 : "+model.getEng());
//        System.out.println("수학점수 : "+model.getMath());
//        System.out.println("평균 점수: "+model.getAvg());

    }
}
