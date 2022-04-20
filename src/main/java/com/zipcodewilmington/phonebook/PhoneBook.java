package com.zipcodewilmington.phonebook;



import java.util.List;
import java.util.Map;
import java.util.*;


    public class PhoneBook {
        private Map<String, List<String>> phonebook;

        public PhoneBook(){
         //this.phonebook = phonebook <>
         phonebook = new HashMap<>();
        }
        public PhoneBook(Map<String, List<String>> map22) {
            phonebook = new HashMap<>();

        }

        public void add(String name, String phoneNumber) {
            // Getting the list view of Array numbers
            ArrayList<String> num = new ArrayList<>(Arrays.asList(phoneNumber));
          // phonebook.put(phoneNumber);
            phonebook.put(name,num);
        }

//
        public void addAll(String name, String[] phoneNumbers) {
            //ArrayList<String> num = new ArrayList<>(
             phonebook.put( name, Arrays.asList(phoneNumbers));      //Arrays.asList(phoneNumbers);

      ;
        }

        public void remove(String name) {
            phonebook.remove(name);
        }

        public Boolean hasEntry(String name) {

        if (phonebook.containsKey(name)) {
            return true;
        }
        else {
            return false;
        }
        }

        public List<String> lookup(String name) {
            List<String> numbers = phonebook.get(name);
            return numbers;


        }

        public String reverseLookup(String phoneNumber) {
            for (Map.Entry<String, List<String>> entry : phonebook.entrySet()) {
                if (entry.getValue().contains(phoneNumber)) {

                    return entry.getKey();
                }
            }
           return null;


      }

        public List<String> getAllContactNames() {

            ArrayList<String> names = new ArrayList<>();
            for (String name : this.phonebook.keySet()) {
                names.add(name);
            }
            return names;
        }

        public Map<String, List<String>> getMap() {

            return this.phonebook;
       }

 }

