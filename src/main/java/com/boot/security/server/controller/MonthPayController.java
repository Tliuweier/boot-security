package com.boot.security.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.security.server.page.table.PageTableRequest;
import com.boot.security.server.page.table.PageTableHandler;
import com.boot.security.server.page.table.PageTableResponse;
import com.boot.security.server.page.table.PageTableHandler.CountHandler;
import com.boot.security.server.page.table.PageTableHandler.ListHandler;
import com.boot.security.server.dao.MonthPayDao;
import com.boot.security.server.model.MonthPay;

import io.swagger.annotations.ApiOperation;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/monthPays")
public class MonthPayController {

    @Autowired
    private MonthPayDao monthPayDao;

    @PostMapping
    @ApiOperation(value = "保存")
    public MonthPay save(@RequestBody MonthPay monthPay) {
        //String month = request.getParameter("month");
        //MonthPay monthPay = new MonthPay();
        System.out.println(monthPay);
        monthPayDao.save(monthPay);

        return monthPay;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取")
    public MonthPay get(@PathVariable Long id) {
        return monthPayDao.getById(id);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    public MonthPay update(@RequestBody MonthPay monthPay) {
        monthPayDao.update(monthPay);

        return monthPay;
    }

    @GetMapping
    @ApiOperation(value = "列表")
    public PageTableResponse list(PageTableRequest request) {
        return new PageTableHandler(new CountHandler() {

            @Override
            public int count(PageTableRequest request) {
                return monthPayDao.count(request.getParams());
            }
        }, new ListHandler() {

            @Override
            public List<MonthPay> list(PageTableRequest request) {
                return monthPayDao.list(request.getParams(), request.getOffset(), request.getLimit());
            }
        }).handle(request);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public void delete(@PathVariable Long id) {
        monthPayDao.delete(id);
    }


    @GetMapping("/getpayType")
    public List<MonthPay> getpayType(){
        List<MonthPay> list = monthPayDao.getpayType();
        
        return  list;
    }
}
