package cn.monch.entity;

import java.io.Serializable;

public class Route implements Serializable
{
    private Integer id;
    private String name;
    private Double price;
    private String routeIntroduce;
    private Character rflaag;
    private String rdate;
    private Character isThemeTour;
    private Integer count;
    private Integer cid;
    private String rimage;
    private Integer sid;
    private String sourceId;

    public Route(){}

    public Route(Integer id, String name, Double price, String routeIntroduce, Character rflaag, String rdate, Character isThemeTour, Integer count, Integer cid, String rimage, Integer sid, String sourceId)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.routeIntroduce = routeIntroduce;
        this.rflaag = rflaag;
        this.rdate = rdate;
        this.isThemeTour = isThemeTour;
        this.count = count;
        this.cid = cid;
        this.rimage = rimage;
        this.sid = sid;
        this.sourceId = sourceId;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Double getPrice()
    {
        return price;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    public String getRouteIntroduce()
    {
        return routeIntroduce;
    }

    public void setRouteIntroduce(String routeIntroduce)
    {
        this.routeIntroduce = routeIntroduce;
    }

    public Character getRflaag()
    {
        return rflaag;
    }

    public void setRflaag(Character rflaag)
    {
        this.rflaag = rflaag;
    }

    public String getRdate()
    {
        return rdate;
    }

    public void setRdate(String rdate)
    {
        this.rdate = rdate;
    }

    public Character getIsThemeTour()
    {
        return isThemeTour;
    }

    public void setIsThemeTour(Character isThemeTour)
    {
        this.isThemeTour = isThemeTour;
    }

    public Integer getCount()
    {
        return count;
    }

    public void setCount(Integer count)
    {
        this.count = count;
    }

    public Integer getCid()
    {
        return cid;
    }

    public void setCid(Integer cid)
    {
        this.cid = cid;
    }

    public String getRimage()
    {
        return rimage;
    }

    public void setRimage(String rimage)
    {
        this.rimage = rimage;
    }

    public Integer getSid()
    {
        return sid;
    }

    public void setSid(Integer sid)
    {
        this.sid = sid;
    }

    public String getSourceId()
    {
        return sourceId;
    }

    public void setSourceId(String sourceId)
    {
        this.sourceId = sourceId;
    }

    @Override
    public String toString()
    {
        return "Route{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", routeIntroduce='" + routeIntroduce + '\'' +
                ", rflaag=" + rflaag +
                ", rdate='" + rdate + '\'' +
                ", isThemeTour=" + isThemeTour +
                ", count=" + count +
                ", cid=" + cid +
                ", rimage='" + rimage + '\'' +
                ", sid=" + sid +
                ", sourceId='" + sourceId + '\'' +
                '}';
    }
}
