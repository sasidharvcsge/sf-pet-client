package com.example.sfpetclient.service.map;

import com.example.sfpetclient.model.Pet;
import com.example.sfpetclient.service.CurdService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements CurdService<Pet,Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findALL();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }

    @Override
    public Pet findById(Long id) {
        return super.finByid(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }
}
