/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ujian.ujian_rpl.service;
import com.ujian.ujian_rpl.model.ModelUjian;
import com.ujian.ujian_rpl.repository.UjianRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
/**
 *
 * @author 2060
 */
@Service
public class UjianService  {
    @Autowired
    private UjianRepository repository;
    
    public void addbuku(ModelUjian buku) {
        repository.save(buku);
    }
    
    public ModelUjian getbuku(int id) {
        return repository.findById(id).orElse(null);
    }
    
    public void updatebuku(ModelUjian buku) {
        repository.save(buku);
    }
    
    public void deletebuku(int id){
        repository.deleteById(id);
    }
    
    public List<ModelUjian> getAllUjian() {
        return repository.findAll();
    }
}
