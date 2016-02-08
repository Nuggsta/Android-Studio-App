package com.example.mars.group_project_one;


import java.util.List;
import java.util.ArrayList;
public class BeerAdvisor {

    List<String> getBrands(String beercolor){
        List<String> brands = new ArrayList<String>();

        if(beercolor.equals("Amber")){
            brands.add("Tröegs Nugget Nectar");
            brands.add("AleSmith Evil Dead Red");
        }
        else if (beercolor.equals("Dark")){
            brands.add("Kurofune Porter");
            brands.add("Tröegs Java Head");

        }
        else if (beercolor.equals("Light")){
            brands.add("Kirin Light Beer");
            brands.add("Pabst Blue Ribbon Light");
        }
        else if (beercolor.equals("Brown")){
            brands.add("Dogfish Indian Brown Ale");
            brands.add("Dogfish Palo Santo Marron");
        }

        return brands;

    }
}
