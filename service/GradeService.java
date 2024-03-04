package service;

import model.Subject;

public interface GradeService {
     int getTotal(Subject score);
     double findAvg(int total);
}
