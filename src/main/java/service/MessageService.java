package service;

import model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.MessageRepo;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class MessageService {

    private final MessageRepo messageRepo;

    @Autowired
    public MessageService(MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
    }

    public Message addMessage(Message message) {
        return messageRepo.save(message);
    }


    public List<Message> getAllMessages() {
        return messageRepo.findAll();
    }
}
