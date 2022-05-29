package controller;

import model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.MessageService;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {

    public final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }


    @RequestMapping(method= RequestMethod.GET,path="")
    public ResponseEntity<List<Message>> getAllMessage(){
        System.out.println("hello from controller getAllMessage");
        return new ResponseEntity<>(messageService.getAllMessages(), HttpStatus.OK);
    }

}
