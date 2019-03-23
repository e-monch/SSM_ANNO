package cn.monch.dao;

import cn.monch.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * user表的持久层接口
 */
@Repository
public interface UserDao
{
    /**
     * 查询所有用户
     * @return
     */
    @Results(id = "userMap", value =
            {
                    @Result(id = true, column = "uid", property = "id"),
                    @Result(column = "uid",
                            property = "favorites",
                            many = @Many(select = "cn.monch.dao.RouteDao.findByUid", fetchType = FetchType.LAZY))
            })
    @Select("select * from tab_user")
    List<User> findAll();

    /**
     * 根据 id 查询用户
     * @param id
     * @return
     */
    @ResultMap("userMap")
    @Select("select * from tab_user where uid = #{id}")
    List<User> findById(Integer id);

    /**
     * 根据名字模糊查询
     * @param name
     * @return
     */
    @ResultMap("userMap")
    @Select("select * from tab_user where name like #{name}")
    List<User> findByName(String name);

    /**
     * 根据性别查询
     * @param sex
     * @return
     */
    @ResultMap("userMap")
    @Select("select * from tab_user where sex = #{sex}")
    List<User> findBySex(Character sex);
}
