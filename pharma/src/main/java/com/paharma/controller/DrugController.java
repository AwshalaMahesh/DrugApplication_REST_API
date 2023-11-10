package com.paharma.controller;

import com.paharma.entity.Drug;
import com.paharma.service.DrugService;
import com.paharma.service.DrugServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DrugController {

    @Autowired
    private DrugService drugService;
    @PostMapping("/drug")
    public Drug addDrug(@RequestBody Drug drug){
        return drugService.addDrug(drug);
    }
    @GetMapping("/drugs")
    public List<Drug> getAllDrugs(){
        return drugService.getAllDrugs();
    }
    @GetMapping("/drugs/{id}")
    public Drug getDrugById(@PathVariable("id") Integer id){
        return drugService.getDrugById(id);
    }
    @DeleteMapping("/drugs/{id}")
    public String deleteDrugById(@PathVariable("id") Integer id){
         drugService.deleteDrugById(id);
         return "Drug deleted Successfully";
    }
    @PutMapping("/drugs/{id}")
    public Drug updateDrugById(@PathVariable("id") Integer id,@RequestBody Drug drug){
        return drugService.updateDrugById(id,drug);
    }

}
