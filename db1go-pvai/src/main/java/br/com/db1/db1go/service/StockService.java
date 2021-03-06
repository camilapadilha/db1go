package br.com.db1.db1go.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.db1.db1go.adapter.StockAdapter;
import br.com.db1.db1go.domain.dto.StockDTO;
import br.com.db1.db1go.domain.entity.Stock;
import br.com.db1.db1go.repository.StockRepository;

@Service
public class StockService {
    
    @Autowired
    private StockRepository stockRepository;

    public List<StockDTO> getAll() {
        List<Stock> stocks = stockRepository.findAll();
        List<StockDTO> stocksDto = new StockAdapter().toDto(stocks);
        return stocksDto;
    }

    public void save(StockDTO stockDTO) {
        Stock stock = new StockAdapter().toEntity(stockDTO);
        stockRepository.save(stock);
    }
}
