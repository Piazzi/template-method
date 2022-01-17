public class CreditCard extends PaymentMethod {

    public String verifyTransaction() {
        return this.pay() && getTax() != 0 ? "Approved" : "Denied";
    }

}
