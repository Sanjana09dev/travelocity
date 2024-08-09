package com.Travelocity.payload;


import lombok.Data;

@Data
public class AppUserDto {



        private Long id;

      //  @NotEmpty
     //   @Size(min=2,message = "Should be at-least 2 character")
        private String name;
      //  @Email
        private String email;
     //   @NotEmpty(message = "Username cannot be empty")
        private String username;
    //    @NotEmpty(message = "Password cannot be empty")
        private String password;
    //    @NotNull(message = "Role cannot be null")
     //   private String role;






}
