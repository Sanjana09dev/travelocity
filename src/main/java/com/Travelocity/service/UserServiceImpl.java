package com.Travelocity.service;

import com.Travelocity.entity.AppUser;
import com.Travelocity.payload.AppUserDto;
import com.Travelocity.repository.AppUserRepository;
import org.springframework.stereotype.Service;

@Service
//
public class UserServiceImpl implements UserService{

    private AppUserRepository appUserRepository;

    public UserServiceImpl(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Override//we are doing inheritence hereand ploymorphismbecause i am inheriting
    //incomplete method overriding it and completing it these all ooops principal are being
    //implemented in the project
    public AppUserDto createUser(AppUserDto dto) {
        AppUser entity = new AppUser();
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setUsername(dto.getUsername());
        entity.setPassword(dto.getPassword());
        //save the entity
        AppUser savedAppUser = appUserRepository.save(entity);

        //copy the entity content to dto
        AppUserDto result = new AppUserDto();
        result.setId(savedAppUser.getId());
        result.setName(savedAppUser.getName());
        result.setEmail(savedAppUser.getEmail());
        result.setUsername(savedAppUser.getUsername());
        result.setPassword(savedAppUser.getPassword());
        return result;


    }
}
