package com.medipol;

import com.medipol.Singer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mustafacan on 29.05.2017.
 */

@RestController
public class SingerRestController {

    @Autowired
    private SingerService singerService;

    @RequestMapping(path = "/singers")
    public List<Singer> findSingers(){

        return singerService.findSingers();

    }

    @RequestMapping(path = "/addSingers")
    public List<Singer> addSingers(@RequestParam String singerName,@RequestParam String songName , @RequestParam String singerAlbumName){

        singerService.addSinger(singerName, songName, singerAlbumName);

        return singerService.findSingers();
    }

    @RequestMapping(path = "/singersByName")
    public List<Singer> findSingersByName(@RequestParam String singerName){

        System.out.println("disardan gonderilen deger : " + singerName);

        return singerService.findSingersByName(singerName);
    }

    @RequestMapping(path = "/singersByAlbums")
    public List<Singer> findSingersByAlbums(@RequestParam String singerAlbums){

        System.out.println("disardan gonderilen deger : " + singerAlbums);

        return singerService.findSingersByAlbums(singerAlbums);
    }

    @RequestMapping(path = "/singersSongName")
    public List<Singer> findSingersBySong(@RequestParam String songName){

        System.out.println("disardan gonderilen deger : " + songName);

        return singerService.findSongName(songName);
    }




}
