package com.website.loveconnect.service;

import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.util.List;

public interface ImageService {
    String uploadImage(MultipartFile file, String userEmail) throws IOException;
    String uploadImageProfile(MultipartFile file, String userEmail) throws IOException;
    String getProfileImage(Integer idUser);
    List<String> getOwnedPhotos(Integer idUser);
    void deleteImageProfile(Integer idUser,String urlImage);
}
