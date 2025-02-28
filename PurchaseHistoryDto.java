package jp.co.internous.team2412.model.domain.dto; 

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 
  購入履歴画面に表示するためのDTO
  @author インターノウス*/
  public class PurchaseHistoryDto {

    private int userId;
    private String productName;
    private int price;
    private int productCount;
    private String familyName;
    private String firstName;
    private String address;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd HH:mm:ss", timezone = "Asia/Tokyo")
    private LocalDateTime purchasedAt;

    public void setPurchasedAt(LocalDateTime timestamp) {
        this.purchasedAt = timestamp;
    }

    public String getPurchasedAt() {
        if (this.purchasedAt == null) {
            return null;
        }
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return this.purchasedAt.format(formatter);
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getUserId() {
        return userId;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductName() {
        return productName;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }
    public int getProductCount() {
        return productCount;
    }
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    public String getFamilyName() {
        return familyName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    
}