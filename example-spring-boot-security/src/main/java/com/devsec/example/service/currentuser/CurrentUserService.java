package com.devsec.example.service.currentuser;

import com.devsec.example.domain.CurrentUser;

public interface CurrentUserService {

    boolean canAccessUser(CurrentUser currentUser, Long userId);

}
