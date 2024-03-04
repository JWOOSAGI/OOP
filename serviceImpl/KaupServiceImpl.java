package serviceImpl;

import model.User;
import service.KaupService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KaupServiceImpl implements KaupService {
    private static KaupService instance = new KaupServiceImpl();
    Map<?, ?>kaufMap;
    List<?> kaufList;

    private KaupServiceImpl(){
        this.kaufMap = new HashMap<>();
        this.kaufList = new ArrayList<>();
    }

    public static KaupService getInstance(){
        return instance;
    }

    @Override
    public String createBMI(User user) {
        double height = user.getHeight();
        double weight = user.getWeight();
        double bmi = (weight/(height*height)*10000);
        return String.valueOf(bmi);

    }

    @Override
    public String createBodyMass(String bmi) {
        String bodyMass = " ";


//        if (bmi < 18.5){
//            bodyMass = "저체중";
//        } else if (bmi >= 18.5 && bmi <= 22.9) {
//            bodyMass = "정상";
//        } else if (bmi >=23 && bmi <=24.9) {
//            bodyMass = "과체중";
//        } else if (bmi >=25 && bmi <=29.9) {
//            bodyMass = "비만";
//        } else if (bmi >=30) {
//            bodyMass = "고도비만";
//        }
        return bodyMass;
    }
}