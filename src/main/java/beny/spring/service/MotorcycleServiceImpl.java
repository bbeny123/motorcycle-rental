package beny.spring.service;

import beny.spring.model.MotorcycleData;
import beny.spring.repository.MotorcycleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Beny on 04.06.2017.
 */

@Service
public class MotorcycleServiceImpl implements MotorcycleService {

    private MotorcycleRepository motorcycleRepository;

    @Autowired
    public MotorcycleServiceImpl(MotorcycleRepository motorcycleRepository) {
        this.motorcycleRepository = motorcycleRepository;
    }

    @Override
    public MotorcycleData findById(Long id) throws DataAccessException {
        return motorcycleRepository.findById(id);
    }

    @Override
    public List<MotorcycleData> getAllMotorcycle() throws DataAccessException {
        return motorcycleRepository.getAllMotorcycle();
    }

    @Transactional
    @Override
    public void removeMotorcycle(Long id) throws DataAccessException {
        motorcycleRepository.removeMotorcycle(id);
    }


}