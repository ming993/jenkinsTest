package common.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import common.service.SocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocketServiceImpl implements SocketService {


    @Autowired
    private Environment env;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void receiveMessage(String message) throws JsonProcessingException {

    }
}
