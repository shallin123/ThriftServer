package com.example.demo.service;

import com.example.demo.thrift.LoginService;
import com.example.demo.thrift.Request;
import com.example.demo.thrift.RequestException;
import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService.Iface {
    private static Logger log = LoggerFactory.getLogger(LoginServiceImpl.class);
    @Override
    public String doAction(Request request) throws RequestException, TException {
        log.info(request.username);
        log.info(request.password);
        return request.getUsername() + request.getPassword();
    }
}
