package view;

import builder.UserBuilder;
import model.UserDTO;
import service.KaupService;
import service.UtilService;
import serviceImpl.KaupServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class KaupView {
    public static void main(Scanner sc) {
        UtilService util = UtilServiceImpl.getInstance();
        double h = util.createRandomDouble(150, 50);
        double w = util.createRandomInteger( 30, 70);
        UserDTO person = new UserBuilder()
                .height(h)
                .weight(w)
                .build();

        KaupService kaup = KaupServiceImpl.getInstance();

        String bmi = kaup.createBMI(person);
        String bodyMass = kaup.createBodyMass(bmi);

        System.out.printf("BMI : " + bmi +"\n"+"비만도 : %s" + bodyMass);
//        System.out.printf("이름 입력 : ");
//        String name = sc.next();
//        double mainHeight = (Math.random()*50)+150;
//        double mainWeight = (Math.random()*69)+30;
//        *String bmiResult = "";

//        double mainbmi = mainWeight / ((mainHeight*0.01)*(mainHeight*0.01));
//
//        if (mainbmi < 18.5){
//            bmiResult = "저체중";
//        } else if (mainbmi >= 18.5 && mainbmi <= 22.9) {
//            bmiResult = "정상";
//        } else if (mainbmi >=23 && mainbmi <=24.9) {
//            bmiResult = "과체중";
//        } else if (mainbmi >=25 && mainbmi <=29.9) {
//            bmiResult = "비만";
//        } else if (mainbmi >=30) {
//            bmiResult = "고도비만";
//        }*/

//        person.setName(name);
//        System.out.println("이름 : "+person.getName());

//        person.setHeight(mainHeight);
//        System.out.println("키 : " + (int)person.getHeight() + "cm");
//
//        person.setWeight(mainWeight);
//        System.out.println("몸무게 : " + (int)person.getWeight() + "kg");

//        person.createName();
//        String name = person.getName();
//        System.out.println("이름 : "+person.getName());
//
//        person.createHeight();
//        double height = person.getHeight();
//        System.out.println("키 : "+(int)person.getHeight());
//
//        person.createWeight();
//        double weight = person.getWeight();
//        System.out.println("몸무게 : "+(int)person.getWeight());
//
//        double bmi = service.createBMI();
//        double bmi = person.getBmi();
//        System.out.println("BMI : " + bmi);
//
//        String bodyMass = service.createBodyMass();
//        String bodyMass = person.getBodyMass();
//        System.out.println("비만도 : " + bodyMass);
    }
}
