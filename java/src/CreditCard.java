public class CreditCard extends PaymentMethod {

    public String verifyTransaction() {
        return this.pay() ? "Approved" : "Denied";
    }

}
