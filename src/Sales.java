package src;

import java.util.Date;

public class Sales {
    private int saleId;
    private int productId;
    private int customerId;
    private int quantitySold;
    private Date saleDate;

    public Sales() {}

    public Sales(int saleId, int productId, int customerId, int quantitySold, Date saleDate) {
        this.saleId = saleId;
        this.productId = productId;
        this.customerId = customerId;
        this.quantitySold = quantitySold;
        this.saleDate = saleDate;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }
}
