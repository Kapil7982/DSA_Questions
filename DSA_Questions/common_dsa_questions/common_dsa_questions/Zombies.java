package common_dsa_questions;

import java.util.*;

public class Zombies {

    public static void main(String[] args) {
    	
//    	 List<Integer> zombies = new ArrayList<>();
//         zombies.add(1);
//         zombies.add(2);
//         zombies.add(3);
//         zombies.add(4);
//         zombies.add(5);
//         zombies.add(6);
    	
    	 List<Integer> zombies = new ArrayList<>(List.of(1,2,3,4,5,6)); // Created the list of zombies

        int currentZombieIndex = 0;
        
        while(zombies.size() > 1) // This loop will run as long as the size of the zombies list is greater than 1
        {
            int zombieToKillIndex = (currentZombieIndex + 1) % zombies.size(); // It will take care of the index of killed zombies
            int zombieToPassKnife = (currentZombieIndex + 2) % zombies.size(); // It will take care of the passing knife

            int zombieToPassKnifeTo = zombies.get(zombieToPassKnife);

            zombies.remove(zombieToKillIndex); // The zombie at index zombieToKillIndex is removed from the zombies list
            currentZombieIndex = zombies.indexOf(zombieToPassKnifeTo); // The currentZombieIndex is updated to the index 
                                                                       // of the zombieToPassKnifeTo in the modified zombies list.

        }

        System.out.println("The zombie who lived: " + zombies.get(0));  // After all operations it will print the first element of the list.
    }
}
