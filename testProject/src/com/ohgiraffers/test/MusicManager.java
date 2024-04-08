package com.ohgiraffers.test;

import java.util.ArrayList;
import java.util.List;

public class MusicManager {

    private List<MusicDTO> musiclist = new ArrayList<>();

    public void addlist(MusicDTO music ){
        musiclist.add(music);
    }
}
