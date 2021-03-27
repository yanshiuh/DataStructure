package com.Lab_Tuto.Lab_from_snr.Lab_1;

public class SimpleNetwork {
    private String name, IP_address, subnet_mask, status;

    public SimpleNetwork(String name, String IP_address, String subnet_mask, String status) {
        this.name = name;
        this.IP_address = IP_address;
        this.subnet_mask = subnet_mask;
        this.status = status;
    }

    public int usable_host() {
        String last_3 = subnet_mask.substring(12);
        return 256 - Integer.parseInt(last_3) - 2;
        // 256 - 224 = 32
        // host bit = 5 (2^5 = 32)
        // usable host = (2 ^ host bit) - 2
        //             = (2 ^ 5) - 2
        //             = 30
    }

    public String check_connection(SimpleNetwork other) {
        String reason = "";
        int host_portion_of_Host = Integer.parseInt(IP_address.substring(7));
        int host_portion_of_Other = Integer.parseInt(other.IP_address.substring(7));

        if (status.equalsIgnoreCase("DOWN"))
            reason = this.name + " cannot ping with other hosts because " + this.name +
                    " is down.";
        else if (other.status.equalsIgnoreCase("DOWN"))
            reason = this.name + " cannot ping " + other.name + " because the destination " + other.name +
                    " is down.";
        else if (host_portion_of_Host - host_portion_of_Other > usable_host() ||
                (host_portion_of_Host - host_portion_of_Other)*-1 > usable_host())
            reason = this.name + " cannot ping " + other.name + " because the destination " + other.name +
                    " is located in different network.";
        else
            reason = this.name + " can ping " + other.name;

        return reason;
    }

    @Override
    public String toString() {
        return "Host Name: " + name + " IP: " + IP_address + " Subnet Mask: " + subnet_mask + " Status: " + status;

    }
}
