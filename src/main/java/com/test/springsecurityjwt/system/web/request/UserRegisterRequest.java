package com.test.springsecurityjwt.system.web.request;


import com.test.springsecurityjwt.system.entity.User;
import com.test.springsecurityjwt.system.validator.FullName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author shuang.kou
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegisterRequest {
    @NotBlank
    private String userName;
    @NotBlank
    private String password;
    @FullName
    @NotBlank
    private String fullName;

    public User toUser() {
        return User.builder().fullName(this.getFullName())
                .userName(this.getUserName())
                .enable(true).build();
    }
}
