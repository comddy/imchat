package com.tdtech.imchat.ui.login.data

import com.tdtech.imchat.ui.login.data.model.LoggedInUser
import java.io.IOException

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    fun login(username: String, password: String): Result<LoggedInUser> {
        try {
            // TODO: handle loggedInUser authentication
            // val user = LoggedInUser(java.util.UUID.randomUUID().toString(), "Jane Doe")
            val user: LoggedInUser
            if (username == "123" && password == "123456") {
                user = LoggedInUser("wy007", "admin")
                return Result.Success(user)
            }
            return Result.Fail("用户名或密码错误")

        } catch (e: Throwable) {
            return Result.Error(IOException("Error logging in", e))
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }
}