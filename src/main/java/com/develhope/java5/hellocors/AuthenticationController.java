package com.develhope.java5.hellocors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

@Controller
public class AuthenticationController {
    private String secret = "mirkodicristinaekarinakosovanegiuseppecorrao";

    @GetMapping("/login")
    public ResponseEntity<String> login(
            @RequestParam String username,
            @RequestParam String password) {
        if (!password.equals("giuseppe")) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        Algorithm algorithm = Algorithm.HMAC512(secret);

        String token = JWT.create()
            .withIssuer("lorenzo")
            .withSubject(username)
            .sign(algorithm);

        return ResponseEntity.ok(token);
    }
}
