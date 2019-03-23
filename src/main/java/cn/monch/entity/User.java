package cn.monch.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable
{
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Date birthday;
    private Character sex;
    private String telephone;
    private String email;
    private Character status;
    private String code;

    private List<Route> favorites;

    public User(){}

    public User(Integer id, String username, String password, String name, Date birthday, Character sex, String telephone, String email, Character status, String code, List<Route> favorites)
    {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.telephone = telephone;
        this.email = email;
        this.status = status;
        this.code = code;
        this.favorites = favorites;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    public Character getSex()
    {
        return sex;
    }

    public void setSex(Character sex)
    {
        this.sex = sex;
    }

    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public Character getStatus()
    {
        return status;
    }

    public void setStatus(Character status)
    {
        this.status = status;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public List<Route> getFavorites()
    {
        return favorites;
    }

    public void setFavorites(List<Route> favorites)
    {
        this.favorites = favorites;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", code='" + code + '\'' +
                ", favorites=" + favorites +
                '}';
    }
}
