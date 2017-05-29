package com.medipol;

import com.medipol.Singer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by mustafacan on 29.05.2017.
 */


@Service
public class SingerService {

    private List<Singer> singers = new ArrayList<>();
    @Autowired
    public SingerService(){

        singers.add(new Singer(1l,"Hadise","Prenses","AskAsk"));
        singers.add(new Singer(2l,"MuratBoz","Ask","Unutma"));
        singers.add(new Singer(3l,"KattyPerry","Caca","Dream"));

    }
    public List<Singer> findSingers(){
        return  singers;
    }
    public List<Singer>findSingersByName(String singerName){

        for (Singer singer : singers) {
            if (singer.getSingerName().equals(singerName)){

                List<Singer> res = new ArrayList<>();
                res.add(singer);

                return res;
            }
        }
        return new ArrayList<>();

    }

    public List<Singer>findSingersByAlbums(String singerAlbums){
        for(Singer singer: singers){
            if(singer.getSingerAlbum().equals(singerAlbums)){
                List<Singer> res = new ArrayList<>();
                res.add(singer);
                    return  res;
            }
        }
        return new ArrayList<>();
    }

    public List<Singer>findSongName(String songname){
        for(Singer singer: singers){
            if(singer.getSongName().equals(songname)){
                List<Singer> res = new ArrayList<>();
                res.add(singer);
                return  res;
            }
        }
        return new ArrayList<>();
    }


    public void addSinger(String singerName, String singerAlbums ,String songName) {

        final Random random = new Random(10000l);
        final Singer singer = new Singer(random.nextLong(), singerName, singerAlbums,songName);
        singers.add(singer);

    }


}
