public class TasksOnline {
    public static void main(String[] args) {
        int billAmount = 80;
        int taxPercent = 10;
        int tipPercent = 15;

        int result = totalBillWithTaxAndTip(billAmount, taxPercent, tipPercent);
        System.out.print("Total bill amount: " + result);
    }

    public static int totalBillWithTaxAndTip(int billAmount, int taxPercent, int tipPercent) {
        int taxAmount = billAmount * taxPercent / 100;
        int tipAmount = billAmount * tipPercent / 100;
        int result = billAmount + taxAmount + tipAmount;
        return result;
    }
}
