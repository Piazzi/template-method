public abstract class PaymentMethod {

    private float amountToPay;
    private float payment;
    protected String method;
    private float tax;

    public float getAmountToPay() {
        return amountToPay;
    }

    public void setAmountToPay(int amount) {
        this.amountToPay = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getPayment() {
        return payment;
    }

    public void setPayment(float payment) {
        this.payment = payment;
    }

    public boolean pay() {
        return payment == amountToPay + (amountToPay*getTax());
    }

    public abstract String verifyTransaction();

    public String getType() {
        return "Payment";
    }

    public String getData() {
        return getType() + "{" +
                "amount=" + this.amountToPay +
                ", method='" + this.method + '\'' +
                ", transaction=" + this.verifyTransaction() +
                ", tax=" + this.tax +
                '}';
    }
}
