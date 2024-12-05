/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ujian.ujian_rpl;

import com.ujian.ujian_rpl.controller.UjianController;
import com.ujian.ujian_rpl.service.UjianService;
import com.ujian.ujian_rpl.view.UjianView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


/**
 *
 * @author 2060
 */
@SpringBootApplication
public class ujian_rpl implements ApplicationRunner{
    @Autowired
    private UjianService ujianService;

    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        
        ApplicationContext context = SpringApplication.run(ujian_rpl.class, args);
        
        UjianController controller = context.getBean(UjianController.class);
       UjianView ujianView = new UjianView(controller);
        ujianView.setVisible(true);
    }
    
    @Override
    public void run(ApplicationArguments args) throws Exception{
    
    }
    
}