package service;

import exception.EntityNotFoundException;
import model.Product;
import repository.Config;
import repository.ProductRepository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class ProductService {

    private ProductRepository productRepository = Config.getProductRepositoryInstance();

    public Product createProduct(Product product){
        return productRepository.createProduct(product);
    }

    public List<Product> getAllProduct(){
        return productRepository.getAll();
    }

    public boolean deleteById(UUID id){
        productRepository.deleteById(id);
        return true;
    }

    public Product getByName(String name){
       return productRepository.getByName(name)
               .orElseThrow(()-> new EntityNotFoundException("Ürün bulunamadı"));
    }

    public List<Product> getProductsByGroupName(String groupName){
        return productRepository.getAll().stream()
                .filter(product -> product.getProductGroup().getName().equals(groupName))
                .collect(Collectors.toList());
    }

    public Product findById(UUID id){
        return productRepository.getById(id)
                .orElseThrow(()-> new EntityNotFoundException("Ürün bulunamadı"));
    }

}
