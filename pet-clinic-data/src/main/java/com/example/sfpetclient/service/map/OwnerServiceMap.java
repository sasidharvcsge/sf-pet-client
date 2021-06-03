package com.example.sfpetclient.service.map;

import com.example.sfpetclient.model.Owner;
import com.example.sfpetclient.service.CurdService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CurdService<Owner,Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findALL();
    }
    @Override
    public Owner findById(Long id) {
        return super.finByid(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }
    @Override
    public void delete(Owner object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
