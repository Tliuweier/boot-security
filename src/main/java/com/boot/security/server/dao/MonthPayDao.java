package com.boot.security.server.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.boot.security.server.model.MonthPay;

@Mapper
public interface MonthPayDao {

    @Select("select * from month_pay t where t.id = #{id}")
    MonthPay getById(Long id);

    @Delete("delete from month_pay where id = #{id}")
    int delete(Long id);

    int update(MonthPay monthPay);
    
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into month_pay(month, pay, paymoney, paytime, ordercd, consumer, cashier) values(#{month}, #{pay}, #{paymoney}, #{paytime}, #{ordercd}, #{consumer}, #{cashier})")
    int save(MonthPay monthPay);
    
    int count(@Param("params") Map<String, Object> params);

    List<MonthPay> list(@Param("params") Map<String, Object> params, @Param("offset") Integer offset, @Param("limit") Integer limit);

    List<MonthPay> getpayType();
}
