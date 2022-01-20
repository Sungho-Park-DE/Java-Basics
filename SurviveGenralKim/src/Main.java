import java.util.ArrayList;

public class Main {
    public static int getSurvivingIndex(int n, int k) {
        // 코드를 입력하세요.
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            integerArrayList.add(i);
        }
        int killIndex = 0;
        while (integerArrayList.size() > 1) {
            killIndex = (killIndex + k - 1) % integerArrayList.size();
            System.out.println(integerArrayList.remove(killIndex) + "번 군사가 죽었습니다.");
        }
        return integerArrayList.get(0);
    }

    public static void main(String[] args) {

        System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
    }
}
