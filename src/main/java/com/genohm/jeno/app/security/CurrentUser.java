package com.genohm.jeno.app.security;

import com.genohm.jeno.backend.data.entity.User;

@FunctionalInterface
public interface CurrentUser {

	User getUser();
}
