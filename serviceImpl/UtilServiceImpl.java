package serviceImpl;

import service.UtilService;

public class UtilServiceImpl implements UtilService {

    private static UtilService instance = new UtilServiceImpl();

    private UtilServiceImpl() {
    }

    public static UtilService getInstance() {
        return instance;
    }

    @Override
    public int createRandomInteger(int start, int gap) {

        return start + (int) (Math.random() * gap);
    }

    @Override
    public double createRandomDouble(int start, int gap) {
        return Double.parseDouble(
                String.format("%.1f" + start + (int) (Math.random() * gap)));
    }

    public String createRandomName() {
        String[] names = {"이정재", "마동석", "송강호", "윤여정", "황정민",
                "정우성", "이병헌", "현 빈", "유해진", "손석구", "전도연",
                "손예진", "하지원", "김하늘", "송중기", "하정우", "장동건",
                "원 빈", "박해일", "소지섭", "김혜수"};
        return names[createRandomInteger(0, 20)];
    }
    public String createRandomUserName() {
        String username = "";
        for(; username.length() < 5;
            username += String.valueOf((char)('a' + this.createRandomInteger(0, 26))));
        return username;
    }
    public String createRandomTitle() {
        String[] titles = {"국방의 의무", "과학기술", "국가안전보장", "대통령",
                "전통문화", "국회의원", "국가이익", "15일", "예산안", "소급입법"
        };
        return titles[createRandomInteger(0, 10)];
    }

    public String createRandomContent() {
        String[] content = {
                "모든 국민은 법률이 정하는 바에 의하여 국방의 의무를 진다.",
                "국가는 과학기술의 혁신과 정보 및 인력의 개발을 통하여 국민경제의 발전에 노력하여야 한다.",
                "국가안전보장에 관련되는 대외정책·군사정책과 국내정책의 수립에 관하여 국무회의의 심의에 앞서 대통령의 자문에 응하기 위하여 국가안전보장회의를 둔다.",
                "대통령은 조약을 체결·비준하고, 외교사절을 신임·접수 또는 파견하며, 선전포고와 강화를 한다.",
                "국가는 전통문화의 계승·발전과 민족문화의 창달에 노력하여야 한다.",
                "국회의원과 정부는 법률안을 제출할 수 있다. 국가안전보장회의는 대통령이 주재한다.",
                "국회의원은 국가이익을 우선하여 양심에 따라 직무를 행한다.",
                "국회에서 의결된 법률안은 정부에 이송되어 15일 이내에 대통령이 공포한다.",
                "국회는 국가의 예산안을 심의·확정한다. 대통령의 임기는 5년으로 하며, 중임할 수 없다.",
                "모든 국민은 소급입법에 의하여 참정권의 제한을 받거나 재산권을 박탈당하지 아니한다."
        };
        return content[createRandomInteger(0, 10)];
    }
    public String createRandomCompany(){
        String[] companies = {"구글","엔비디아","메타","삼성","LG","애플"};
        return null;
    }



}