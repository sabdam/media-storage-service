package com.epam.facades;

import com.epam.converters.PicturesAlbumConverter;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.epam.dto.PictureAlbumDto;
import com.epam.services.PicturesService;
import org.springframework.core.convert.ConversionService;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PicturesFacade {
    @Resource
    private PicturesService picturesService;

    private PicturesAlbumConverter converter = new PicturesAlbumConverter();

    public List<PictureAlbumDto> getPictureAlbums() {
        return picturesService.getPictureAlbums().stream().map(pictureAlbum -> converter.convert(pictureAlbum))
                .collect(Collectors.toList());
    }
}
