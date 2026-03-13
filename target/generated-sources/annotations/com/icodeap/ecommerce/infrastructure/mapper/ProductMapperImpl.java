package com.icodeap.ecommerce.infrastructure.mapper;

import com.icodeap.ecommerce.domain.Product;
import com.icodeap.ecommerce.infrastructure.entity.ProductEntity;
import java.util.ArrayList;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-07T14:55:02+0100",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 21.0.9 (Microsoft)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Product toProduct(ProductEntity productEntity) {
        if ( productEntity == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( productEntity.getId() );
        product.setName( productEntity.getName() );
        product.setDescription( productEntity.getDescription() );
        product.setPrice( productEntity.getPrice() );
        product.setDateCreated( productEntity.getDateCreated() );
        product.setDateUpdated( productEntity.getDateUpdated() );
        product.setUser( userMapper.toUser( productEntity.getUserEntity() ) );
        product.setCode( productEntity.getCode() );
        product.setImage( productEntity.getImage() );

        return product;
    }

    @Override
    public Iterable<Product> toProducts(Iterable<ProductEntity> productEntities) {
        if ( productEntities == null ) {
            return null;
        }

        ArrayList<Product> iterable = new ArrayList<Product>();
        for ( ProductEntity productEntity : productEntities ) {
            iterable.add( toProduct( productEntity ) );
        }

        return iterable;
    }

    @Override
    public ProductEntity toProductEntity(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductEntity productEntity = new ProductEntity();

        productEntity.setId( product.getId() );
        productEntity.setName( product.getName() );
        productEntity.setDescription( product.getDescription() );
        productEntity.setPrice( product.getPrice() );
        productEntity.setDateCreated( product.getDateCreated() );
        productEntity.setDateUpdated( product.getDateUpdated() );
        productEntity.setUserEntity( userMapper.toUserEntity( product.getUser() ) );
        productEntity.setCode( product.getCode() );
        productEntity.setImage( product.getImage() );

        return productEntity;
    }
}
