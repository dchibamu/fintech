package com.chibamu.forex.service;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


public class StockServiceImpl implements StockService {

    public List<String> findLatestStock() {
        return Arrays.asList("Ngonidzashe Inc", "iChampidigori Inc");
    }
}
