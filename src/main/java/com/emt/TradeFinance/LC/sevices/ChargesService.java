package com.emt.TradeFinance.LC.sevices;

import com.emt.TradeFinance.LC.entities.Charges;
import com.emt.TradeFinance.LC.repositories.ChargesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChargesService {

    @Autowired
    private ChargesRepository chargesRepository;

    public List<Charges> getAllCharges() {
        return chargesRepository.findAll();
    }

    public Charges getChargesById(Long id) {
        return chargesRepository.findById(id).orElse(null);
    }

    public Charges saveCharges(Charges charges) {
        return chargesRepository.save(charges);
    }



    public void deleteCharges(Long id) {
        chargesRepository.deleteById(id);
    }
}
