package com.paharma.service;

import com.paharma.entity.Drug;

import java.util.List;

public interface DrugService {
    public Drug addDrug(Drug drug);

    public List<Drug> getAllDrugs();

    public Drug getDrugById(Integer id);

    public void deleteDrugById(Integer id);

    public Drug updateDrugById(Integer id, Drug drug);


}
