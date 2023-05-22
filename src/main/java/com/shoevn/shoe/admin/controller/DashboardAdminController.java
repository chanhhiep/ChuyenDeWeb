package com.shoevn.shoe.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardAdminController {
    @RequestMapping("dashboard")
    //@ResponseBody
    public String index(){
        return "/admindashboard";
    }
}
