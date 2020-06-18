package me.zhulin.onlineshopping.dto;

import lombok.Data;
import me.zhulin.onlineshopping.entity.ProductInfo;

/**
 * Created By Zhu Lin on 3/11/2018.
 */
@Data
public class Item {
    private ProductInfo productInfo;

    private Integer quantity;

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Item(ProductInfo productInfo, Integer quantity) {
        this.productInfo = productInfo;
        this.quantity = quantity;
    }
}
