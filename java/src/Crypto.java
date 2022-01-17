public class Crypto extends PaymentMethod {

    public String verifyTransaction() {
        return this.pay() ? "Approved" : "Denied";
    }

    @Override
    public String getType() {
        return "Decentralized payment";
    }
}
