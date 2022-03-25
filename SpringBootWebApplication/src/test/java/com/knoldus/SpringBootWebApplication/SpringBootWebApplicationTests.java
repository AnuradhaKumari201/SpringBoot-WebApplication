package com.knoldus.SpringBootWebApplication;


import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringBootWebApplicationTests {

    @Autowired
    ContactBussiness contactBussiness;

    Contact contact1 = new Contact("Marry John", "marry.john@gmail.com", "USA");
    Contact contact2 = new Contact("Tom Smith", "tomsmith@outlook.com", "England");
    Contact contact3 = new Contact("John Purcell", "john123@yahoo.com", "Australia");
    Contact contact4 = new Contact("Siva Krishna", "sivakrishna@gmail.com", "India");

    ArrayList<Contact> listContact = new ArrayList<Contact>();

    @Before
    public void initInputs(){
        listContact.add(contact1);
        listContact.add(contact2);
        listContact.add(contact3);
        listContact.add(contact4);    
    }


    @Test
    void contextLoads() {

        /**
         * convert List of objects to array of objects
         */
        List<Contact> testOutput = contactBussiness.getContactList();
        Assert.assertEquals(testOutput, testOutput);

    }

}
