package cn.monch.dao;

import cn.monch.entity.Route;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Route表的持久层接口
 */
@Repository
public interface RouteDao
{
    @Results(id = "routeMap", value =
            {
                    @Result(id = true, column = "rid", property = "id")
            })
    @Select("select tab_route.* " +
            "from tab_user " +
            "left join tab_favorite on tab_user.uid = tab_favorite.uid " +
            "left join tab_route on tab_favorite.rid = tab_route.rid " +
            "where tab_user.uid = #{uid}")
    List<Route> findByUid(Integer uid);
}
