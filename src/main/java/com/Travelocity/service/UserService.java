package com.Travelocity.service;

import com.Travelocity.payload.AppUserDto;

public interface UserService {

 public   AppUserDto createUser(AppUserDto dto);

 //   JWTTokenDTo verifyLogin(LoginDto loginDto);
}
