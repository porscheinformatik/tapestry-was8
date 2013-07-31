package at.porscheinformatik.tapestry.dto;

import java.io.Serializable;

public class DetailDataDTO implements Serializable
{
    private static final long serialVersionUID = -7563258916581178080L;

    private Long id;

    private String name;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
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

    @Override
    public String toString()
    {
        return "Id: " + id + " Name: " + name;
    }
}
