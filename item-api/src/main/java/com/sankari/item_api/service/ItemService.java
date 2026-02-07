package com.sankari.item_api.service;

import com.sankari.item_api.model.Item;
import com.sankari.item_api.repository.ItemRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ItemService {
    private final ItemRepository repository;

    public ItemService(ItemRepository repository) {
        this.repository = repository;
    }

    public Item addItem(Item item) {
        return repository.save(item);
    }

    public Optional<Item> getItemById(Long id) {
        return repository.findById(id);
    }
}