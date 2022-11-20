package service;

import exception.EntityNotFoundException;
import model.ProductGroup;
import repository.Config;
import repository.ProductGroupRepository;

import java.util.List;
import java.util.UUID;

public class ProductGroupService {

    private ProductGroupRepository productGroupRepository = Config.getProductGroupRepositoryInstance();

    public ProductGroup createProduct(ProductGroup productGroup){
        return productGroupRepository.createProductGroup(productGroup);
    }

    public List<ProductGroup> getAllProductGroups(){
        return productGroupRepository.getAll();
    }

    public boolean deleteById(UUID id){
        productGroupRepository.deleteById(id);
        return true;
    }

    public ProductGroup findById(UUID id){
        return productGroupRepository.getById(id)
                .orElseThrow(()-> new EntityNotFoundException("Ürün grubu bulunamadı"));
    }

}
