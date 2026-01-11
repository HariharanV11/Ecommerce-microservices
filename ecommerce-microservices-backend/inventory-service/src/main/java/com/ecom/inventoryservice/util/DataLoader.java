package main.java.com.ecom.inventoryservice.util;

import main.java.com.ecom.inventoryservice.model.Inventory;
import main.java.com.ecom.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final InventoryRepository inventoryRepository;

    @Override
    public void run(String... args) throws Exception {
        Inventory inventory = new Inventory();
        inventory.setProductName("Iphone 13");
        inventory.setQuantity(12);

        Inventory inventory1 = new Inventory();
        inventory1.setProductName("Macbook Pro 13.3");
        inventory1.setQuantity(4);

        inventoryRepository.save(inventory);
        inventoryRepository.save(inventory1);
    }

}