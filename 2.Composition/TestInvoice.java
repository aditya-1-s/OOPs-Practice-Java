public class TestInvoice {
    public static void main(String[] args) {
        Customer c1 = new Customer(88, "Tan ah Teck", 10);
        System.out.println(c1);
        c1.setDiscount(8);
        System.out.println(c1);
        System.out.println(c1.getId());
        System.out.println(c1.getName());
        System.out.println(c1.getDiscount());
        Invoice i1 = new Invoice(101, c1, 888.8);
        System.out.println(i1);
        i1.setAmount(999.9);
        System.out.println(i1);
        System.out.println(i1.getId());
        System.out.println(i1.getCustomer().toString());
        System.out.println(i1.getAmount());
        System.out.println(i1.getCustomerId());
        System.out.println(i1.getCustomerName());
        System.out.println(i1.getCustomerDiscount());
        System.out.println(i1.getAmountAfterDiscount());

    }
}
