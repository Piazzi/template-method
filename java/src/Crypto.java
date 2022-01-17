public class Crypto extends PaymentMethod {

    public String verifyTransaction() {
        return this.pay() && getTax() == 0 ? "Approved" : "Denied";
    }

    @Override
    public String getType() {
        return "Decentralized payment";
    }
}
