package com.epam.services;

import com.epam.models.MusicAlbumModel;
import com.epam.repositories.MusicRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MusicService {

    @Resource
    private MusicRepository musicRepository;

    public List<MusicAlbumModel> getMusicAlbums(){
        return musicRepository.getMusicAlbums();
    }
}
