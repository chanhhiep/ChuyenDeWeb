package com.shoevn.shoe.admin.dto;

public class BrandDto {
    private String Id;
    private String Name;

    public BrandDto(String id, String name) {
        Id = id;
        Name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
