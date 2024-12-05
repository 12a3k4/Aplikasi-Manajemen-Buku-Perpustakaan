/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ujian.ujian_rpl.controller;

import org.springframework.web.bind.annotation.*;
import com.ujian.ujian_rpl.model.ModelUjian;
import com.ujian.ujian_rpl.service.UjianService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author 2060
 */

@Controller
public class UjianController {
    @Autowired
    private UjianService ujianService;
    
    //Untuk ADD 
    public String addUjian(@RequestBody ModelUjian buku) {
        ujianService.addbuku(buku);
        return "Buku added successfully";
    }
    
    //Get by ID
    public ModelUjian getUjian(@PathVariable int id) {
        return ujianService.getbuku(id);
    }
    
    // Update
    public String updateUjian(@RequestBody ModelUjian buku) {
        ujianService.updatebuku(buku);
        return "Buku updated successfully";
    }
    
    // Delete  By ID
    public String deleteUjian(@PathVariable int id) {
        ujianService.deletebuku(id);
        return "Buku deleted successfully";
    }
    
    // Get All 
    public List<ModelUjian> getAllUjian() {
        return ujianService.getAllUjian();
    }

}
