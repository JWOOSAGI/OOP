package service;

public interface UtilService {
    int createRandomInteger(int start, int gap);
    double createRandomDouble(int start, int gap);

    String createRandomName();
    String createRandomTitle();
    String createRandomContent();
    String createRandomCompany();
    String createRandomUserName();
}