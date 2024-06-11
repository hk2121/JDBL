package com.test.interfacedemo;

public class TataTiago extends TataCar {

    private String rc;
    private String puc;

//    @Override
//    public String getCompanyName() {
//
//        return "Tata";
//    }


    public TataTiago(String rc, String puc) {
        super();
        this.rc = rc;
        this.puc = puc;
    }

    public TataTiago() {

    }

    @Override
    public String getPUC() {
        return puc;
    }

    @Override
    public String getCountry() {
        return null;
    }

    @Override
    public String getRC() {
        return rc;
    }

    @Override
    public String getInsurance() {
        return null;
    }
}
