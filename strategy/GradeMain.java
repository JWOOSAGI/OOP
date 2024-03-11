package strategy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Supplier;


enum Grade {
    A(9, ()-> "A"),
    B(8, ()-> "B"),
    C(7, ()-> "C"),
    D(6, ()-> "D"),
    E(5, ()-> "E"),
    F(4, ()-> "F"),
    ;
    private final int score;
    private final Supplier<String> supplier;

    Grade(int score, Supplier<String> supplier) {
        this.score = score;
        this.supplier = supplier;
    }

    public static String getGrade(int score) {
        return getOperator(score/10).supplier.get();
    }

    private static Grade getOperator(int score) {
        return Arrays.stream(values())
                .filter(grade -> grade.score <= score)
                .findFirst()
                .orElse(F);
    }
}

public class GradeMain {
    static String getGrade(int score){
        return Grade.getGrade(score);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Score를 입력하세요: ");
        int score = sc.nextInt();
        String rank = getGrade(score);
        System.out.println("Grade: " + rank);
    }
}
