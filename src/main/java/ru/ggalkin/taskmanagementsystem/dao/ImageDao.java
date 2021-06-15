package ru.ggalkin.taskmanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.ggalkin.taskmanagementsystem.model.Image;

@Repository
public interface ImageDao
     extends JpaRepository<Image, Integer> {



}
