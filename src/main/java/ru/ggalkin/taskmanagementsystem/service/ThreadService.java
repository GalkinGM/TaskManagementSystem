package ru.ggalkin.taskmanagementsystem.service;


import org.springframework.stereotype.Service;

@Service
public class ThreadService implements Runnable {

    @Override
    public void run()  {

        while(true) {

            System.out.println("Downloading the file Server");
            try {

                Thread.sleep(2000);

            }catch(Exception e) {}

        }

    }



}

