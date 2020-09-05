package cn.lihuan.com.dao;

import cn.lihuan.com.pojo.AddressCode;

public interface AddressCodeMapper {
    int deleteByPrimaryKey(Integer acId);

    int insert(AddressCode record);

    int insertSelective(AddressCode record);

    AddressCode selectByPrimaryKey(Integer acId);

    int updateByPrimaryKeySelective(AddressCode record);

    int updateByPrimaryKey(AddressCode record);
}