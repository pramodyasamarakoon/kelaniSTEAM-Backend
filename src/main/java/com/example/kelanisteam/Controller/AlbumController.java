package com.example.kelanisteam.controller;

import com.example.kelanisteam.model.Album;
import com.example.kelanisteam.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/albums")
@CrossOrigin(origins = "http://localhost:3000")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @PostMapping("/create")
    public ResponseEntity<String> createAlbum(@RequestBody Album album) {
        Album createAlbum = albumService.createAlbum(album);

        // Check if the Album was successfully created
        if (createAlbum != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body("User created successfully!");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to create user.");
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Album>> getLast10Albums() {
        List<Album> last10Albums = albumService.getLast10Albums();

        // Check if albums were retrieved successfully
        if (last10Albums != null && !last10Albums.isEmpty()) {
            return ResponseEntity.ok(last10Albums);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteAlbumById(@RequestParam String albumId) {
        boolean isDeleted = albumService.deleteAlbumById(albumId);

        if (isDeleted) {
            return ResponseEntity.ok("Album deleted successfully!");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Album not found.");
        }
    }
}
