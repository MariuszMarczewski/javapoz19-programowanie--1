package pl.sdaacademy.javapoz19programowanie1.pet;


import java.util.List;

public class PetService {

    private PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<Pet> findAll() {
        return petRepository.findAll();
    }

    public List<Pet> findByBreed(String breed) {
        return petRepository.findByBreed(breed);
    }

    public List<Pet> findByLocation(String location) {
        return petRepository.findByLocation(location);
    }
}