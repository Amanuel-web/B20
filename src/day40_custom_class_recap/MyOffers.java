package day40_custom_class_recap;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setSalaryOfferInfo(100000,"VA",true,true,true,"SDET",true);
        offer2.setSalaryOfferInfo(170000,"NV",true,true,true,"SDET",true);
        offer3.setSalaryOfferInfo(105000,"CA",true,true,true,"SDET",true);
        offer4.setSalaryOfferInfo(110000,"PA",true,true,true,"SDET",true);
        offer5.setSalaryOfferInfo(130000,"VA",true,true,true,"SDET",true);
        offer6.setSalaryOfferInfo(120000,"TX",true,true,true,"SDET",true);
        offer7.setSalaryOfferInfo(110000,"GA",true,true,true,"SDET",true);

        ArrayList <Offer > jopOffer = new ArrayList<>();
        jopOffer.addAll(Arrays.asList(offer1,offer2,offer3 ,offer4 ,offer5 ,offer6,offer7));

        for ( Offer each : jopOffer){
            each.getSalaryOfferInfo();
        }
        System.out.println("=======================================================================================================");

        jopOffer.removeIf(p -> p.salary < 12000 || p.state.equals("VA"));

        System.out.println(jopOffer.size());
    }
}

