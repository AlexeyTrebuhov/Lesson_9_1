package org.example;

import java.util.List;

public class Research {
    public static void print(String street, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getStreet().equals(street) &&
                    el.getLink() == Relation.SiSi) {
                System.out.println("Sister - Sister = " + el.getPersonFirst());
            }
        }
    }




}