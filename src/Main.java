public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int putMoney = 1210;
        int bonus = 0;
        int saveSum = 100;
        int finaleScore;
        if (putMoney > 1000 && currentBalance >= 100) {
            bonus = putMoney / saveSum;
            finaleScore = currentBalance + putMoney + bonus;
            System.out.println(finaleScore);
        } else {
            finaleScore = currentBalance + putMoney;
            System.out.println(finaleScore);
        }
    }
}
