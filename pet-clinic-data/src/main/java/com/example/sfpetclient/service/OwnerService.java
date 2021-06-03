package com.example.sfpetclient.service;

import com.example.sfpetclient.model.Owner;

public interface OwnerService extends CurdService<Owner, Long>{
    Owner findByLastName(String lastName);


}
