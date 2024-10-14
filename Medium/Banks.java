class Bank {
    public double getRateOfInterest() {
        return 0.0;
    }
}

class SBI extends Bank {
    @Override
    public double getRateOfInterest() {
        return 8.4;
    }
}

class ICICI extends Bank {
    @Override
    public double getRateOfInterest() {
        return 7.3;
    }
}

class AXIS extends Bank {
    @Override
    public double getRateOfInterest() {
        return 9.7;
    }
}

public class BankInterest {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();

        System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest() + "%");
        System.out.println("IC
