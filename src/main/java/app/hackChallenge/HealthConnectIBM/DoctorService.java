package app.hackChallenge.HealthConnectIBM;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    @Autowired //autowire instansises the object without constructor
    private DoctorRepository docRepo;
    @Autowired
    
    /**
     * returns all the doctors present in the data base
     */
    public List<Doctor> findAllDoctors() {
        return docRepo.findAll();
    }
    //optional because it can return null
    //List of doctors because there may be many docs in single location
    public Optional<List<Doctor>> getDoctorsByLocation(String location) {
        return docRepo.findByLocationIgnoreCase(location);
    }
}
