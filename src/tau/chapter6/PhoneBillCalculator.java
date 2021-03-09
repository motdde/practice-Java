package tau.chapter6;

public class PhoneBillCalculator {
    public static void main(String[] args) {
        PhoneBill bill = new PhoneBill(2167);
        bill.setNumberOfMinutesUsed(7000);
        bill.printPhoneBill();
    }
}
