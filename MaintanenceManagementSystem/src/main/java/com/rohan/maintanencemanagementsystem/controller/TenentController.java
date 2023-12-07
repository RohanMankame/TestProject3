package com.rohan.maintanencemanagementsystem.controller;

import com.rohan.maintanencemanagementsystem.entity.Tenent;
import com.rohan.maintanencemanagementsystem.service.TenentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TenentController {

    private TenentService tenentService;

    public TenentController(TenentService tenentService) {
        super();
        this.tenentService = tenentService;
    }

    //handeler method to handle list tenent and return mode view
    @GetMapping("/tenents")
    public String listTenents(Model model){
        model.addAttribute("tenents", tenentService.getAllTenents());
        return "tenents";
        //return null;
    }

    @GetMapping("/tenents/new")
    public String createTenentForm(Model model){
        //create tenent obj to hold tenent from data
        Tenent tenent = new Tenent();
        model.addAttribute("tenent",tenent);
        return "create_tenent";

    }
    @PostMapping("/tenents")
    public String saveTenent(@ModelAttribute("tenent") Tenent tenent){
        tenentService.saveTenent(tenent);
        return "redirect:/tenents";

    }

    @GetMapping("/tenents/edit/{id}")
    public String editTenentForm(@PathVariable Long id, Model model){
        model.addAttribute("tenent",tenentService.getTenentById(id));
        return "edit_tenent";
    }

    @PostMapping("/tenents/{id}")
    public String updateTenent(@PathVariable long id,
    @ModelAttribute("tenent") Tenent tenent,Model model){
        //get tenent from database by id
        Tenent existingTenent = tenentService.getTenentById(id);
        existingTenent.setId(id);
        existingTenent.setUserName(tenent.getUserName());
        existingTenent.setAptNum(tenent.getAptNum());
        existingTenent.setArea(tenent.getArea());
        existingTenent.setProblem(tenent.getProblem());
        existingTenent.setDateTime(tenent.getDateTime());
        existingTenent.setStatus(tenent.getStatus());
        //save updated tenent object
        tenentService.updateTenent(existingTenent);
        return "redirect:/tenents";

    }

    //handler method to handle delete tenent request
    @GetMapping("/tenents/{id}")
    public String deleteTenent(@PathVariable long id){
        tenentService.deleteTenentById(id);
        return "redirect:/tenents";

    }

}
