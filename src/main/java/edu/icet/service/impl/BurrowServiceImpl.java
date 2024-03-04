package edu.icet.service.impl;
import edu.icet.dto.BurrowerDto;
import edu.icet.entity.Burrower;
import edu.icet.repository.BurrowerRepository;
import edu.icet.service.BurrowService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class BurrowServiceImpl implements BurrowService {

    final BurrowerRepository repository;
    final ModelMapper mapper;

    @Override
    public void addBurrower(BurrowerDto burrowerDto) {
        Burrower entity = mapper.map(burrowerDto, Burrower.class);
        repository.save(entity);

    }

    @Override
    public List<Burrower> getBurrowers() {
        return repository.findAll();
    }

    @Override
    public boolean deleteBurrower(Long id) {
        if (repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public BurrowerDto findByUserName(String userName) {
        return mapper.map(repository.findByUserName(userName),BurrowerDto.class);
    }

    @Override
    public Boolean isExistsUserName(String userName) {
        return repository.existsByUserName(userName);
    }
}
