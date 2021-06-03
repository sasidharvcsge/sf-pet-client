package com.example.sfpetclient.service.map;

import com.example.sfpetclient.model.Vet;
import com.example.sfpetclient.service.CurdService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements CurdService<Vet,Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findALL();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Vet object) {
        super.delete(object);

    }

    @Override
    public Vet findById(Long id) {
        return super.finByid(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }
}
