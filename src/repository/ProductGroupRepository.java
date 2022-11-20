package repository;

import model.ProductGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ProductGroupRepository {

    List<ProductGroup> productGroups = new ArrayList<>();

    public ProductGroupRepository() {
        productGroups.add(new ProductGroup(UUID.randomUUID(), "Notebook"));
        productGroups.add(new ProductGroup(UUID.randomUUID(), "Mobile Phone"));
    }

    public ProductGroup createProductGroup(ProductGroup productGroup){
        productGroups.add(productGroup);
        return productGroup;
    }

    public List<ProductGroup> getAll(){
        return productGroups;
    }

    public Optional<ProductGroup> getById(UUID id){
        Optional<ProductGroup> productGroupOptional = productGroups.stream()
                .filter(productGroup-> productGroup.getId().equals(id))
                .findFirst();
        return productGroupOptional;
    }

    public Optional<ProductGroup> getByName(String name){
        Optional<ProductGroup> productGroupOptional = productGroups.stream()
                .filter(productGroup->productGroup.getName().equals(name))
                .findFirst();
        return productGroupOptional;
    }

    public void deleteById(UUID id){
        productGroups.remove(getById(id).get());
    }
}
