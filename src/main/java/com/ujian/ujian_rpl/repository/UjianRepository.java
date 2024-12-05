/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ujian.ujian_rpl.repository;
import com.ujian.ujian_rpl.model.ModelUjian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
/**
 *
 * @author 2060
 */
@Repository
public interface UjianRepository extends JpaRepository<ModelUjian, Integer> {
    
}
