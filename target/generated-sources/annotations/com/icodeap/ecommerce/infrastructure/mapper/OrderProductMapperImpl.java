package com.icodeap.ecommerce.infrastructure.mapper;

import com.icodeap.ecommerce.domain.Order;
import com.icodeap.ecommerce.domain.OrderProduct;
import com.icodeap.ecommerce.domain.Product;
import com.icodeap.ecommerce.infrastructure.entity.OrderEntity;
import com.icodeap.ecommerce.infrastructure.entity.OrderProductEntity;
import com.icodeap.ecommerce.infrastructure.entity.OrderProductPK;
import com.icodeap.ecommerce.infrastructure.entity.ProductEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-07T14:55:02+0100",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 21.0.9 (Microsoft)"
)
@Component
public class OrderProductMapperImpl implements OrderProductMapper {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public OrderProduct toOrderProduct(OrderProductEntity orderProductEntity) {
        if ( orderProductEntity == null ) {
            return null;
        }

        Product product = null;
        Integer quantity = null;
        Order order = null;

        product = productMapper.toProduct( orderProductEntityPkProductEntity( orderProductEntity ) );
        quantity = orderProductEntity.getQuantity();
        order = orderMapper.toOrder( orderProductEntityPkOrderEntity( orderProductEntity ) );

        OrderProduct orderProduct = new OrderProduct( product, quantity, order );

        return orderProduct;
    }

    @Override
    public Iterable<OrderProduct> toOrderProducts(Iterable<OrderProductEntity> orderProductEntities) {
        if ( orderProductEntities == null ) {
            return null;
        }

        ArrayList<OrderProduct> iterable = new ArrayList<OrderProduct>();
        for ( OrderProductEntity orderProductEntity : orderProductEntities ) {
            iterable.add( toOrderProduct( orderProductEntity ) );
        }

        return iterable;
    }

    @Override
    public List<OrderProduct> toOrderProductsList(Iterable<OrderProductEntity> orderProductEntities) {
        if ( orderProductEntities == null ) {
            return null;
        }

        List<OrderProduct> list = new ArrayList<OrderProduct>();
        for ( OrderProductEntity orderProductEntity : orderProductEntities ) {
            list.add( toOrderProduct( orderProductEntity ) );
        }

        return list;
    }

    @Override
    public OrderProductEntity toOrderProductEntity(OrderProduct orderProduct) {
        if ( orderProduct == null ) {
            return null;
        }

        OrderProductEntity orderProductEntity = new OrderProductEntity();

        orderProductEntity.setPk( orderProductToOrderProductPK( orderProduct ) );
        orderProductEntity.setQuantity( orderProduct.getQuantity() );

        return orderProductEntity;
    }

    private ProductEntity orderProductEntityPkProductEntity(OrderProductEntity orderProductEntity) {
        if ( orderProductEntity == null ) {
            return null;
        }
        OrderProductPK pk = orderProductEntity.getPk();
        if ( pk == null ) {
            return null;
        }
        ProductEntity productEntity = pk.getProductEntity();
        if ( productEntity == null ) {
            return null;
        }
        return productEntity;
    }

    private OrderEntity orderProductEntityPkOrderEntity(OrderProductEntity orderProductEntity) {
        if ( orderProductEntity == null ) {
            return null;
        }
        OrderProductPK pk = orderProductEntity.getPk();
        if ( pk == null ) {
            return null;
        }
        OrderEntity orderEntity = pk.getOrderEntity();
        if ( orderEntity == null ) {
            return null;
        }
        return orderEntity;
    }

    protected OrderProductPK orderProductToOrderProductPK(OrderProduct orderProduct) {
        if ( orderProduct == null ) {
            return null;
        }

        OrderProductPK orderProductPK = new OrderProductPK();

        orderProductPK.setProductEntity( productMapper.toProductEntity( orderProduct.getProduct() ) );
        orderProductPK.setOrderEntity( orderMapper.toOrderEntity( orderProduct.getOrder() ) );

        return orderProductPK;
    }
}
