package com.example.sfpetclient.model;

import java.io.Serializable;

public class BaseEnity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
