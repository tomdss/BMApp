package com.example.basemvvm.utils.network

enum class NetworkState {
    NO_INTERNET,
    BAD_REQUEST, // 400 Bad Request
    NOT_FOUND, // 404 NotFound
    UNAUTHORISED, // 401 UnauthorizedError
    FORBIDDEN, // 403 Forbidden
}