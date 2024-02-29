package service;

import model.SubjectDTO;

public interface GradeService {
     int getTotal(SubjectDTO score);
     double findAvg(int total);
}
