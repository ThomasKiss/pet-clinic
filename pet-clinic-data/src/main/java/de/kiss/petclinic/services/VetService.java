package de.kiss.petclinic.services;

import de.kiss.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findall();
}
