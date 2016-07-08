package com.company.SoNe;

import com.google.common.collect.*;

import java.util.*;

public class SocialNetwork
{
    private Map<String, Person> peopleByName = new HashMap<>();
    private Map<Long, Person> peopleById = new HashMap<>();
    private BiMap<Person, Person> couples = HashBiMap.create();
    private TreeMultimap<Person, Person> friends = TreeMultimap.create();

    public void addPerson(Person person)
    {
        peopleByName.put(person.getName(),person);
        peopleById.put(person.getId(),person);
    }
    public  Person getPerson(Long id)
    {
        return peopleById.get(id);
    }
    public Person getPerson(String name)
    {
        return peopleByName.get(name);
    }
    public void addCouple (Person p1,Person p2)
    {
        checkIfCouple(p1);
        checkIfCouple(p2);
        couples.put(p1,p2);
    }
    public void addFriend (Person p1, Person p2)
    {
        checkIfFriend(p1,p2);
        checkIfFriend(p2,p1);
        friends.put(p1,p2);
        friends.put(p2,p1);
    }
    private void checkIfCouple(Person p1)
    {
        if (couples.containsKey(p1) || couples.values().contains(p1))
        {
            System.out.println("The person " + p1.getName() + " already has a couple");
            throw new RuntimeException("The person " + p1.getName() + " already has a couple"); //lanzar un error y parar la ejecución
        }
    }
    private void checkIfFriend(Person p1, Person p2)
    {
        if (friends.containsKey(p1) && friends.get(p1).contains(p2))
        {
            System.out.println("The person " + p2.getName() + " already has a friend");
            throw  new RuntimeException("The person " + p2.getName() + " is now friend with " + p1.getName());
        }
    }
    public Person getCouple(Person p1)
    {
        Person couple = couples.get(p1);
        if(couple != null)
        {
            return couple;
        }
        else
        {
            couple = couples.inverse().get(p1);
            return couple;
        }
    }
    public Integer getNumberOfFriends(Person p1)
    {
        return getFriends(p1).size();
    }
    public Set <Person> getFriends(Person p1)
    {
        return friends.get(p1);
    }
    public Set <Person> getFriendship(Person p1)
    {
        Person p2 = getCouple(p1);
        if(p2 == null)
        {
            return new TreeSet<>();
        }
        return getFriends(p2);
    }
    public Set<Person> getFriendsCouple (Person p1)
    {
        Set<Person> friends = getFriends(p1);
        Set<Person> couples= new HashSet<>();
        for (Person friend : friends)
        {
            Person couple = getCouple(friend);
            if (couple != null)
            {
                couples.add(couple);
            }
        }
        return couples;
    }
    public List<Person> popularity (Person person)
    {
        List<Person> personList = new ArrayList<>(peopleByName.values());
        Collections.sort
                (
                        personList, (p1, p2) ->
        {
            int numFriends1 = getNumberOfFriends(p1);
            int numFriends2 = getNumberOfFriends(p2);
            if (numFriends1<numFriends2)
            {
                return 1;
            }
            if (numFriends1>numFriends2)
            {
                return -1;
            }
            else return 0;
        }
                );
        return personList;
    }
    public int getConnectionDegree(Person p1, Person p2)
    {
        return 0;
    }
    public SortedSet<Person> getConnectionDegreePath(Person p1,Person p2)
    {
        return null;
    }
}
