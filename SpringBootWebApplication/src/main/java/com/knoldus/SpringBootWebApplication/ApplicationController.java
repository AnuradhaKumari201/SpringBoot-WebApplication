package com.knoldus.SpringBootWebApplication;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ApplicationController {

    //    @RequestMapping("/home")
    //    public String home(HttpServletRequest req) {
    //
    //        HttpSession session = req.getSession();
    //        String name = req.getParameter("name"); 
    //        System.out.println("hi"+ name);
    //        session.setAttribute("name", name);
    //        return "home";
    //    }

    @RequestMapping("/list_contact")
    public String listContact(Model model) {

        ContactBussiness business = new ContactBussiness();
        List<Contact> contactList = business.getContactList();

        model.addAttribute("contacts", contactList);       

        return "home";
    }


}
