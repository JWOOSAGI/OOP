package strategy;

import java.util.Scanner;
enum Trans{
    mon{
        @Override
        public String name(String a){
            return "월요일";
        }
    },
    tues{
        @Override
        public String name(String a){
            return "화요일";
        }
    },wednes{
        @Override
        public String name(String a){
            return "수요일";
        }
    },thurs{
        @Override
        public String name(String a){
            return "목요일";
        }
    },fri{
        @Override
        public String name(String a){
            return "금요일";
        }
    },sat{
        @Override
        public String name(String a){
            return "토요일";
        }
    },sun{
        @Override
        public String name(String a){
            return "일요일";
        }
    };


    public abstract String name(String a);
}
public class Calendar {

    public static String days(String a, Trans trans){
        return trans.name(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요일 입력");
        String input = sc.next();
        Trans trans = Trans.valueOf(input);
        System.out.println(Calendar.days(input, trans));
    }
}
