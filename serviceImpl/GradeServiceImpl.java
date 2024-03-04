package serviceImpl;

import model.Subject;
import service.GradeService;
import service.KaupService;

public class GradeServiceImpl implements GradeService {
    private static GradeService instance = new GradeServiceImpl();

    private GradeServiceImpl(){}

    public static GradeService getInstance(){
        return instance;
    }
    @Override
    public int getTotal(Subject score) {
        int kor = score.getKor();
        int eng = score.getEng();
        int math = score.getMath();
        int total = kor+eng+math;
        return total;
    }

    @Override
    public double findAvg(int Total) {
        return 0;
    }
}
