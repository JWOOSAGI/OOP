package model;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString

public class Subject {
    private int kor;
    private int eng;
    private int math;
    private int id;

    @Builder (builderMethodName = "builder")
    public Subject (int kor, int eng, int math, int id) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.id = id;
    }


}
