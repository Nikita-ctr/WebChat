package com.app.webchat.model;

import javax.persistence.Id;
import java.util.Date;

public class ChatMessage {
    @Id
    private String id;
    private String chatId;
    private String senderId;
    private String recipientId;
    private String senderName;
    private String recipientName;
    private String content;
    private Date timestamp;
    private MessageStatus status;

    public ChatMessage(String id,
                       String chatId,
                       String senderId,
                       String recipientId,
                       String senderName,
                       String recipientName,
                       String content,
                       Date timestamp,
                       MessageStatus status) {
        this.id = id;
        this.chatId = chatId;
        this.senderId = senderId;
        this.recipientId = recipientId;
        this.senderName = senderName;
        this.recipientName = recipientName;
        this.content = content;
        this.timestamp = timestamp;
        this.status = status;
    }

    public ChatMessage() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public MessageStatus getStatus() {
        return status;
    }

    public void setStatus(MessageStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ChatMessage{" +
                "id='" + id + '\'' +
                ", chatId='" + chatId + '\'' +
                ", senderId='" + senderId + '\'' +
                ", recipientId='" + recipientId + '\'' +
                ", senderName='" + senderName + '\'' +
                ", recipientName='" + recipientName + '\'' +
                ", content='" + content + '\'' +
                ", timestamp=" + timestamp +
                ", status=" + status +
                '}';
    }
}
