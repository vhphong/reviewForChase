package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Message implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "m_id", nullable = false)
    private Long id;
    private String sender_email;
    private String recipient_email;
    private String m_content;
    private String sending_timestamp;

    public Message() {
    }

    public Message(Long id, String sender_email, String recipient_email, String m_content, String sending_timestamp) {
        this.id = id;
        this.sender_email = sender_email;
        this.recipient_email = recipient_email;
        this.m_content = m_content;
        this.sending_timestamp = sending_timestamp;
    }

    public Message(String sender_email, String recipient_email, String m_content, String sending_timestamp) {
        this.sender_email = sender_email;
        this.recipient_email = recipient_email;
        this.m_content = m_content;
        this.sending_timestamp = sending_timestamp;
    }

    public String getSender_email() {
        return sender_email;
    }

    public void setSender_email(String sender_email) {
        this.sender_email = sender_email;
    }

    public String getRecipient_email() {
        return recipient_email;
    }

    public void setRecipient_email(String recipient_email) {
        this.recipient_email = recipient_email;
    }

    public String getM_content() {
        return m_content;
    }

    public void setM_content(String m_content) {
        this.m_content = m_content;
    }

    public String getSending_timestamp() {
        return sending_timestamp;
    }

    public void setSending_timestamp(String sending_timestamp) {
        this.sending_timestamp = sending_timestamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", sender_email='" + sender_email + '\'' +
                ", recipient_email='" + recipient_email + '\'' +
                ", m_content='" + m_content + '\'' +
                ", sending_timestamp='" + sending_timestamp + '\'' +
                '}';
    }
}
