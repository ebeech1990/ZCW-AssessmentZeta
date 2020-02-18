package com.zipcodewilmington.assessment1.part3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    private String name;
    private ArrayList<Pet> pets = new ArrayList<>();


    public PetOwner(String name, Pet... pets) {
        this.name = name;

        if (pets != null) {
            for (Pet p : pets) {
                this.pets.add(p);
                p.setOwner(this);
            }


        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {

            pets.add(pet);

    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

                pets.remove(pet);

    }
        /**
         * @param pet pet to evaluate ownership of
         * @return true if I own this pet
         */
        public Boolean isOwnerOf (Pet pet){

            for (Pet p : pets) {
                if (p.equals(pet)) {
                    return true;
                }
            }
            return false;

        }

        /**
         * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
         */
        public Integer getYoungetPetAge () {
            int lowest = Integer.MAX_VALUE;

            for (Pet p : pets) {
                if (p.getAge() < lowest) {
                    lowest = p.getAge();
                }

            }
            return lowest;
        }


        /**
         * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
         */
        public Integer getOldestPetAge () {
            int highest = 0;

            for (Pet p : pets) {
                if (p.getAge() > highest) {
                    highest = p.getAge();
                }

            }
            return highest;
        }


        /**
         * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
         */
        public Float getAveragePetAge () {
            int sum = 0;


            int numOf = pets.size();
            for (Pet p : pets) {
                sum += p.getAge();
            }

            return (float) sum / numOf;
        }

        /**
         * @return the number of Pet objects stored in this class
         */
        public Integer getNumberOfPets () {
            return pets.size();
        }

        /**
         * @return the name property of the Pet
         */
        public String getName () {
            return name;
        }

        /**
         * @return array representation of animals owned by this PetOwner
         */
        public Pet[] getPets () {
            Pet[] pets = new Pet[this.pets.size()+1];
            int i = 0;
            for (Pet p : this.pets) {
                pets[i] = p;
                i++;
            }
            return pets;
        }

}
