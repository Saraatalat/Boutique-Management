package src;

public class Stock {
    private int stockId;
    private int productId;
    private int availableQuantity;

    public Stock() {}

    public Stock(int stockId, int productId, int availableQuantity) {
        this.stockId = stockId;
        this.productId = productId;
        this.availableQuantity = availableQuantity;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
}
