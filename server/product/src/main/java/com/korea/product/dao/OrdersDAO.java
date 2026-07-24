package com.korea.product.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.korea.product.vo.OrdersVO;

@Mapper
public interface OrdersDAO {

	int insert(OrdersVO vo);

	List<OrdersVO> findAll();

}
