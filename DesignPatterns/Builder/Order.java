package DesignPatterns.Builder;

public class Order {

    private final int id;
    private final String customerName;
    private final String mobile;
    private final String address;
    private final String product;

    private Order(Builder builder) {
        this.id = builder.id;
        this.customerName = builder.customerName;
        this.mobile = builder.mobile;
        this.address = builder.address;
        this.product = builder.product;
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }

    public String getProduct() {
        return product;
    }

    public static class Builder {
        private int id;
        private String customerName;
        private String mobile;
        private String address;
        private String product;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setProduct(String product) {
            this.product = product;
            return this;
        }

        public Order build(){
            return new Order(this);
        }
    }
}
