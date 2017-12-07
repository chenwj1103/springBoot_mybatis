package cn.chenwj.springboot.mapper;

import cn.chenwj.springboot.domain.Country;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 国家mapper类
 *
 * @author Chen WeiJie
 * @date 2017-12-07 19:41
 **/
@Mapper
public interface CountryMapper {


    /**
     * 查询国家列表
     *
     * @return 列表
     */
    List<Country> selectAll();

}
