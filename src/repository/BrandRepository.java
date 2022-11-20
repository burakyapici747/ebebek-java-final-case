package repository;

import model.Brand;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class BrandRepository {

    private List<Brand> brands = new ArrayList<>();

    public BrandRepository(){
        create(new Brand( UUID.randomUUID(),"Samsung"));
        create(new Brand(UUID.randomUUID(),"Lenovo"));
        create(new Brand(UUID.randomUUID(), "Apple"));
        create(new Brand(UUID.randomUUID(),"Huawei"));
        create(new Brand(UUID.randomUUID(),"Casper"));
        create(new Brand(UUID.randomUUID(),"Asus"));
        create(new Brand(UUID.randomUUID(),"HP"));
        create(new Brand(UUID.randomUUID(),"Xiaomi"));
        create(new Brand(UUID.randomUUID(),"Monster"));
    }

    public List<Brand> getAll(){
        return brands.stream()
                .sorted(Comparator.comparing(Brand::getName))
                .collect(Collectors.toList());
    }

    public Brand create(Brand brand){
        brands.add(brand);
        return brand;
    }

    public void delete(Brand brand){
        brands.remove(brand);
    }
}