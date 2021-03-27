package com.Lab_Tuto.Tuto_from_snr.Tuto_1;

public class ISP {
    protected int mbps, GB;

    public ISP(int mbps, int GB) {
        this.mbps = mbps;
        this.GB = GB;
    }

    @Override
    public String toString() {
        return mbps + "mbps Subscription and " + GB + "GB";
    }
}
