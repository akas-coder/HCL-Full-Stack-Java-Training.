package org.example.Day2.notificationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private NotificationService notificationService;
    @Autowired
    public Student(NotificationService notificationService){
        this.notificationService=notificationService;
    }
    public void notifyStudent(){
        notificationService.sendMessage("Your Assesemnt is sheduled");
    }
}
