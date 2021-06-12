package com.football.fan.chelsea.player.service;

import com.football.fan.chelsea.player.models.PlayerRequestResource;

import java.util.Optional;

public interface RateService {

    public Optional<Long> createPlayerDetails(PlayerRequestResource playerRequestResource);

}
