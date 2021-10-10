public class Main {
    public static void main(String[] args) {
        int currentbalance = 100;
        int putmoney = 1200;
        int bonus = 0;
        int finalescore;
        if (putmoney > 1000 && currentbalance == 100) {
            bonus = putmoney / currentbalance;
            finalescore = currentbalance + putmoney + bonus;
            System.out.println(finalescore);
        } else {
            finalescore = currentbalance + putmoney;
            System.out.println(finalescore);
        }
    }
}
