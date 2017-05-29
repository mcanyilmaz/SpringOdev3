package com.medipol;

import com.medipol.Singer;
import com.medipol.SingerService;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertThat;

/**
 * Created by mustafacan on 29.05.2017.
 */
public class SingerServiceTest {

    @Test
    public void shouldFindUserByName() throws Exception {

        final SingerService singerService = new SingerService();

        final List<Singer> response = singerService.findSingersByName("mustafa");

        assertThat(response.size(), Matchers.equalTo(1));
        assertThat(response.get(0).getSingerName(), Matchers.equalTo("mustafa"));

    }

    @Test
    public void shouldAddUser() throws Exception {

        final SingerService singerService = new SingerService();

        final String newSingerName = "randomSingerName";
        final String newSingerAlbum = "randomSingerAlbum";
        final String newSongName = "randomSongName";
        singerService.addSinger(newSingerName, newSingerAlbum,newSongName);

        final List<Singer> response = singerService.findSingersByName(newSingerName);

        assertThat(response.size(), Matchers.equalTo(1));
        assertThat(response.get(0).getSingerName(), Matchers.equalTo(newSingerName));
        assertThat(response.get(0).getSingerAlbum(), Matchers.equalTo(newSingerAlbum));
        assertThat(response.get(0).getSingerAlbum(), Matchers.equalTo(newSongName));

    }



}
