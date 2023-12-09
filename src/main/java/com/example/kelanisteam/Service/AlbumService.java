package com.example.kelanisteam.service;

import com.example.kelanisteam.model.Album;
import com.example.kelanisteam.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Page;


import java.util.Date;
import java.util.List;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

//    Create Album
    public Album createAlbum(Album album) {
        // Set the createdDate before saving
        album.setCreatedDate(new Date());
        return albumRepository.save(album);
    }

//    Get All Albums
    public List<Album> getAllAlbums() {
        return albumRepository.findAll();
    }

//    Get last 10 Albums
    public List<Album> getLast10Albums() {
        // Your logic to retrieve the last 10 albums, for example:
        Sort sort = Sort.by(Sort.Order.desc("createdDate")); // Assuming you have a createdDate field
        PageRequest pageRequest = PageRequest.of(0, 10, sort);
        Page<Album> last10AlbumsPage = albumRepository.findAll(pageRequest);
        return last10AlbumsPage.getContent();
    }

//    Delete Album By Id
    public boolean deleteAlbumById(String albumId) {
        if (albumRepository.existsById(albumId)) {
            albumRepository.deleteById(albumId);
            return true; // Album deleted successfully
        }
        return false; // Album not found
    }
}
