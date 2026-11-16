package com.pluralsight;

import java.math.BigDecimal;
import java.math.BigInteger;

public class House extends Assets{

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, BigDecimal originalCost) {
        super(description, dateAcquired, originalCost);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
    @Override
    public BigDecimal getValue() {

        BigDecimal pricePerSqrFt = BigDecimal.ZERO;

        //depreciation price if loop
        if (condition == 1) {
            pricePerSqrFt = new BigDecimal("180");
        }
        else if (condition == 2) {
            pricePerSqrFt = new BigDecimal("130");
        }
        else if (condition == 3) {
            pricePerSqrFt = new BigDecimal("90");
        }
        else if (condition == 4) {
            pricePerSqrFt = new BigDecimal("80");
        }


        return getOriginalCost();
    }
}
