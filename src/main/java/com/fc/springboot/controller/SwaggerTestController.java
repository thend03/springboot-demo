package com.fc.springboot.controller;

import com.fc.springboot.model.*;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author feng.chuang
 * @description swagger-test-controller
 * @time 2020-12-31 15:36
 */
@RestController
public class SwaggerTestController {
    @ApiOperation("根据用户id数组集获得用户集合信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name="userIds", value="用户ID数组集", required=true, paramType="query" ,allowMultiple=true, dataType = "String"),
    })
    @GetMapping("/ids_user_list")
    public Map<String,Person> getUserList(HttpServletRequest request,String[] userIds) {
        return new HashMap<>();
    }

    @ApiOperation("query cherry and result mapping")
    @ApiImplicitParam(name="cherryIds", value="用户ID数组集", required=true, paramType="query" ,allowMultiple=true, dataType = "String")
    @GetMapping("/cherryIds")
    public Map<Cherry,String> getCherryResultMapping(HttpServletRequest request, String[] cherryIds) {
        HashMap<Cherry,String> objectObjectHashMap = new HashMap<>(16);
        return objectObjectHashMap;
    }

    @ApiOperation(value = "批量删除购物车明细")
    @DeleteMapping("/deleteGoods")
    @ApiImplicitParam(name="shopCartIds",value = "商品shopCartIds",required = true,allowMultiple = false,dataType = "Goods",paramType="query",dataTypeClass = Goods.class)
    public List<String> delete(@ApiParam(value = "商品shopCartIds") @RequestParam("shopCartIds") List<Goods> shopCartIds) {
        return new ArrayList<>();
    }

    @ApiOperation(value = "batch query person")
    @DeleteMapping("/person")
    @ApiImplicitParam(name="personNames",value = "person name list",required = true,allowMultiple = false,dataType = "Person",paramType="query",dataTypeClass = Person.class)
    public List<Person> queryPerson(@ApiParam(value = "商品shopCartIds") @RequestParam("shopCartIds") List<Goods> personNames) {
        ArrayList<Person> objects = new ArrayList<>();
        return objects;
    }

    @RequestMapping(value="/multiFive",consumes = "application/json",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "openid", value = "openid", required = false, dataType = "String",paramType="header"),
            @ApiImplicitParam(paramType = "header", dataType = "String", name = "Content-Type", value = "content type", required = true),
            @ApiImplicitParam(name = "user", value = "user", required = false, dataType = "User",paramType = "body",dataTypeClass = User.class),
            @ApiImplicitParam(name="userIds", value="用户ID数组集", required=true, paramType="body" ,allowMultiple=true, dataType = "String"),
            @ApiImplicitParam(name="nameList", value="用户 info  list", required=true, paramType="body" ,allowMultiple=true, dataType = "Person",dataTypeClass = Person.class),
            @ApiImplicitParam(name="longList", value="test Long  list", required=true, paramType="query" ,allowMultiple=true, dataType = "Long",dataTypeClass = Long.class),
            @ApiImplicitParam(name="razer", value="razer class def", required=true, paramType="body" ,allowMultiple=false, dataType = "Razer",dataTypeClass = Razer.class),
    })
    public Result serverError(@RequestBody User user, String[] userIds, @RequestBody List<Person> nameList, List<Long> longList, @RequestBody Razer razer){
        Result result = new Result();
        result.setId(111);
        result.setType("param in header");
        result.setInfo("oh yeah");
        result.setName("fc");

        return result;
    }

    @RequestMapping(value = "/xxx",consumes = "application/json",method = RequestMethod.POST)
    @ApiImplicitParam(name = "user", value = "user data", required = false, dataType = "User",paramType = "body",dataTypeClass = User.class)
    public Report<Person> xxxy(@RequestBody User user){
        return Report.ofSuccess(new Person());
    }




}
