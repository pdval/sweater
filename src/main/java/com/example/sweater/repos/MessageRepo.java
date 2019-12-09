package com.example.sweater.repos;/*
 *
 * Author(s):
 * Dmitry Privalov
 *
 */

import com.example.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Integer> {
    public List<Message> findByTagLike(String tag);
    public List<Message> findByTextLike(String text);
}


