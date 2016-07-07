package com.company.SN;

import java.util.*;

public class Main
{
    static Scanner sc = new Scanner(System.in);
    static SocialNetwork socialNetwork = new SocialNetwork();

    public static void main(String[] args)
    {
        initializeSocialNetwork();

        System.out.println("Query of person by Id:");
        System.out.println("Id 1: "+socialNetwork.getPerson(1L));
        System.out.println("Id 2: "+socialNetwork.getPerson(2L));
        System.out.println("Id 3: "+socialNetwork.getPerson(3L));
        System.out.println("Id 4: "+socialNetwork.getPerson(4L));
        System.out.println("Id 5: "+socialNetwork.getPerson(5L));
        System.out.println("Id 6: "+socialNetwork.getPerson(6L));
        System.out.println("Id 7: "+socialNetwork.getPerson(7L));
        System.out.println("Id 8: "+socialNetwork.getPerson(8L));
        System.out.println("Id 9: "+socialNetwork.getPerson(9L));
        System.out.println("Id 10: "+socialNetwork.getPerson(10L));
        System.out.println("Id 11: "+socialNetwork.getPerson(11L));
        System.out.println("Id 12: "+socialNetwork.getPerson(12L));
        System.out.println("Id 13: "+socialNetwork.getPerson(13L));

        System.out.println("Query of person by Name ");
        System.out.println("Name Daniel:"
                + socialNetwork.getPerson("Daniel"));
        System.out.println("Name David:"
                + socialNetwork.getPerson("David"));
        System.out.println("Name Dimple:"
                + socialNetwork.getPerson("Dimple"));
        System.out.println("Name Ismael:"
                + socialNetwork.getPerson("Ismael"));
        System.out.println("Name Ivan:"
                + socialNetwork.getPerson("Ivan"));
        System.out.println("Name Jordi:"
                + socialNetwork.getPerson("Jordi"));
        System.out.println("Name Judith:"
                + socialNetwork.getPerson("Judith"));
        System.out.println("Name Marcos:"
                + socialNetwork.getPerson("Marcos"));
        System.out.println("Name Noelia:"
                + socialNetwork.getPerson("Noelia"));
        System.out.println("Name Oriol:"
                + socialNetwork.getPerson("Oriol"));
        System.out.println("Name Oscar:"
                + socialNetwork.getPerson("Oscar"));
        System.out.println("Name Pol:"
                + socialNetwork.getPerson("Pol"));
        System.out.println("Name Ricard:"
                + socialNetwork.getPerson("Ricard"));
    }
    private static void initializeSocialNetwork()
    {
        Person daniel = new Person(1L,"Daniel","Alvarez Vega");
        Person david = new Person(2L,"David","Rodriguez Arias");
        Person dimple = new Person(3L,"Dimple","Ramachandani Balani");
        Person ismael = new Person(4L,"Ismael","Molero Fajardo");
        Person ivan = new Person(5L,"Ivan","Merino Fajardo");
        Person jordi = new Person(6L,"Jordi","Portero Simon");
        Person judith = new Person(7L, "Judith","Sala Verdugo");
        Person marcos = new Person(8L, "Marcos", "Cerezo Trenard");
        Person noelia = new Person(9L, "Noelia", "Villa Tena");
        Person oriol = new Person(10L, "Oriol", "Lloberas Lopez de Sepulveda");
        Person oscar = new Person(11L, "Oscar", "Comino Saavedra");
        Person pol = new Person(12L, "Pol", "Ramos Fandos");
        Person ricard = new Person(13L, "Ricard", "Sole i Xanxo");

        socialNetwork.addPerson(daniel);
        socialNetwork.addPerson(david);
        socialNetwork.addPerson(dimple);
        socialNetwork.addPerson(ismael);
        socialNetwork.addPerson(ivan);
        socialNetwork.addPerson(jordi);
        socialNetwork.addPerson(judith);
        socialNetwork.addPerson(marcos);
        socialNetwork.addPerson(noelia);
        socialNetwork.addPerson(oriol);
        socialNetwork.addPerson(oscar);
        socialNetwork.addPerson(pol);
        socialNetwork.addPerson(ricard);

        socialNetwork.addCouple(ricard,judith);
        socialNetwork.addCouple(dimple,ivan);
        socialNetwork.addCouple(noelia, david);

        socialNetwork.addFriend(ricard,dimple);
        socialNetwork.addFriend(ricard,david);
        socialNetwork.addFriend(ricard,ivan);
        socialNetwork.addFriend(ricard,noelia);
        socialNetwork.addFriend(ricard,daniel);
        socialNetwork.addFriend(dimple,noelia);
        socialNetwork.addFriend(dimple,david);
        socialNetwork.addFriend(dimple,judith);
        socialNetwork.addFriend(judith,noelia);
        socialNetwork.addFriend(judith,david);

        System.out.println("Daniel's couple is: " + socialNetwork.getCouple(daniel));
        System.out.println("David's couple is:  " + socialNetwork.getCouple(david));
        System.out.println("Dimple's couple is: " + socialNetwork.getCouple(dimple));
        System.out.println("Ismael's couple is: " + socialNetwork.getCouple(ismael));
        System.out.println("Ivan's couple is: " + socialNetwork.getCouple(ivan));
        System.out.println("Jordi's couple is: " + socialNetwork.getCouple(jordi));
        System.out.println("Judith's couple is: " + socialNetwork.getCouple(judith));
        System.out.println("Marcos's couple is: " + socialNetwork.getCouple(marcos));
        System.out.println("Noelia's couple is: " + socialNetwork.getCouple(noelia));
        System.out.println("Oriol's couple is: " + socialNetwork.getCouple(oriol));
        System.out.println("Oscar's couple is: " + socialNetwork.getCouple(oscar));
        System.out.println("Pol's couple is: " + socialNetwork.getCouple(pol));
        System.out.println("Ricard's couple is: " + socialNetwork.getCouple(ricard));

        System.out.println("Daniel's friends: " + socialNetwork.getFriends(daniel));
        System.out.println("David's friends:  " + socialNetwork.getFriends(david));
        System.out.println("Dimple's friends: " + socialNetwork.getFriends(dimple));
        System.out.println("Ismael's friends: " + socialNetwork.getFriends(ismael));
        System.out.println("Ivan's friends: " + socialNetwork.getFriends(ivan));
        System.out.println("Jordi's friends: " + socialNetwork.getFriends(jordi));
        System.out.println("Judith's friends: " + socialNetwork.getFriends(judith));
        System.out.println("Marcos's friends: " + socialNetwork.getFriends(marcos));
        System.out.println("Noelia's friends: " + socialNetwork.getFriends(noelia));
        System.out.println("Oriol's friends: " + socialNetwork.getFriends(oriol));
        System.out.println("Oscar's friends: " + socialNetwork.getFriends(oscar));
        System.out.println("Pol's friends: " + socialNetwork.getFriends(pol));
        System.out.println("Ricard's friends: " + socialNetwork.getFriends(ricard));

        System.out.println("Daniel's friendships: " + socialNetwork.getFriendship(daniel));
        System.out.println("David's friendships:  " + socialNetwork.getFriendship(david));
        System.out.println("Dimple's friendships: " + socialNetwork.getFriendship(dimple));
        System.out.println("Ismael's friendships: " + socialNetwork.getFriendship(ismael));
        System.out.println("Ivan's friendships: " + socialNetwork.getFriendship(ivan));
        System.out.println("Jordi's friendships: " + socialNetwork.getFriendship(jordi));
        System.out.println("Judith's friendships: " + socialNetwork.getFriendship(judith));
        System.out.println("Marcos's friendships: " + socialNetwork.getFriendship(marcos));
        System.out.println("Noelia's friendships: " + socialNetwork.getFriendship(noelia));
        System.out.println("Oriol's friendships: " + socialNetwork.getFriendship(oriol));
        System.out.println("Oscar's friendships: " + socialNetwork.getFriendship(oscar));
        System.out.println("Pol's friendships: " + socialNetwork.getFriendship(pol));
        System.out.println("Ricard's friendships: " + socialNetwork.getFriendship(ricard));

        System.out.println("Daniel's friend couple: " + socialNetwork.getFriendsCouple(daniel));
        System.out.println("David's friend couple:  " + socialNetwork.getFriendsCouple(david));
        System.out.println("Dimple's friend couple: " + socialNetwork.getFriendsCouple(dimple));
        System.out.println("Ismael's friend couple: " + socialNetwork.getFriendsCouple(ismael));
        System.out.println("Ivan's friend couple: " + socialNetwork.getFriendsCouple(ivan));
        System.out.println("Jordi's friend couple: " + socialNetwork.getFriendsCouple(jordi));
        System.out.println("Judith's friend couple: " + socialNetwork.getFriendsCouple(judith));
        System.out.println("Marcos's friend couple: " + socialNetwork.getFriendsCouple(marcos));
        System.out.println("Noelia's friend couple: " + socialNetwork.getFriendsCouple(noelia));
        System.out.println("Oriol's friend couple: " + socialNetwork.getFriendsCouple(oriol));
        System.out.println("Oscar's friend couple: " + socialNetwork.getFriendsCouple(oscar));
        System.out.println("Pol's friend couple: " + socialNetwork.getFriendsCouple(pol));
        System.out.println("Ricard's friend couple: " + socialNetwork.getFriendsCouple(ricard));

    }
}
