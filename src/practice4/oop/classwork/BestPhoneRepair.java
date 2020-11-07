package practice4.oop.classwork;


public class BestPhoneRepair extends Business implements Pay, Buy {
    @Override
    public void location() {
        System.out.println("Downtown");

    }

    @Override
    public void hourOfWork() {
        System.out.println("8 to 5 ");

    }

    @Override
    public void buyEquipment() {
        System.out.println("Need computer, tools..etc");

    }

    @Override
    public void payWithCard() {
        System.out.println("The customers can pay by card");

    }

    @Override
    public void payWithCash() {
        System.out.println("The customers can pay by cash");
    }

    @Override
    public void payWithPhone() {
        System.out.println("The customers can pay by phone");
    }
}
