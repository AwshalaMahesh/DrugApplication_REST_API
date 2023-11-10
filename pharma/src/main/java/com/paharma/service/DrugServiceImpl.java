package com.paharma.service;

import com.paharma.entity.Drug;
import com.paharma.repository.DrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Formatter;
import java.util.List;
import java.util.Objects;

@Service
public class DrugServiceImpl implements DrugService{

    @Autowired
    private DrugRepository drugRepository;

    @Override
    public Drug addDrug(Drug drug) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        String format = simpleDateFormat.format(drug.getMfg_dt());
        drug.setMfg_dt(new Date(Date.parse(format)));
        return drugRepository.save(drug);
    }

    @Override
    public List<Drug> getAllDrugs() {
        return drugRepository.findAll();
    }

    @Override
    public Drug getDrugById(Integer id) {
        return drugRepository.findById(id).get();
    }

    @Override
    public void deleteDrugById(Integer id) {
        drugRepository.deleteById(id);
    }

    @Override
    public Drug updateDrugById(Integer id ,Drug drug) {
        Drug newDrug = drugRepository.findById(id).get();

        if(Objects.nonNull(drug.getName())
        && !" ".equalsIgnoreCase(drug.getName())){
            newDrug.setName(drug.getName());
        }
        if(Objects.nonNull(drug.getMfg_dt())) {
            newDrug.setMfg_dt(drug.getMfg_dt());
        }
        if(Objects.nonNull(drug.getPrice())){
            newDrug.setPrice(drug.getPrice());
        }

        return drugRepository.save(newDrug);
    }
}
