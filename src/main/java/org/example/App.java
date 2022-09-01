package org.example;


public class App {

    public static void main(String[] args) {

        Person person1 = new Person( "Dima", " Ludvigovich", -12001, "Russia",  "Nizniy Novgorod", "Al-Faraby", 16);
        Person person2 = new Person( "Gleb", " Ludvigovich", -10944, "Russia", "Nizniy Tagil", "8mart", 1);

        Person person3 = new Person( "Olga", "Dmitrievna", 9186,"Russia",  "Tashkent", "8mart", 76);
        Person person4 = new Person("Dima", "Dmitrievich", 9857,"Russia",  "Semipalatinsk", "Al-Faraby", 11);

        Person person5 = new Person("Yuri", "Glebovich", 12500,"Russia",  "Baltabay", "8mart", 7);
        Person person6 = new Person( "Erbol", "Glebovich", 12711,"Russia",  "Fergana", "Al-Faraby", 3 );
        Person person7 = new Person("Saule", "Glebovna", 12500,"Russia",  "Baltabay", "Al-Faraby", 7);
        Person person8 = new Person( "Raushan", "Governable", 12711,"Russia",  "Fergana", "8mart", 3 );

        Tree tree = new Tree();

        tree.addLink(person2, person1, Relation.BrBr, Relation.BrBr); // родственные отношения между персонажами

        tree.addLink(person1, person3, Relation.PaCh, Relation.PaCh);
        tree.addLink(person1, person4, Relation.PaCh, Relation.PaCh);

        tree.addLink(person2, person5, Relation.PaCh, Relation.PaCh);
        tree.addLink(person2, person6, Relation.PaCh, Relation.PaCh);
        tree.addLink(person2, person7, Relation.PaCh, Relation.PaCh);
        tree.addLink(person2, person8, Relation.PaCh, Relation.PaCh);

        tree.addLink(person3, person4, Relation.BrSi, Relation.BrSi);

        tree.addLink(person5, person6, Relation.BrBr, Relation.BrBr);
        tree.addLink(person5, person7, Relation.BrSi, Relation.BrSi);
        tree.addLink(person5, person8, Relation.BrSi, Relation.BrSi);
        tree.addLink(person6, person7, Relation.BrSi, Relation.BrSi);
        tree.addLink(person6, person8, Relation.BrSi, Relation.BrSi);
        tree.addLink(person7, person8, Relation.SiSi, Relation.SiSi);

        Research.print("8mart", tree);


    }

}