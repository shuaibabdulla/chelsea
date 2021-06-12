package com.football.fan.chelsea.player.service;

import com.football.fan.chelsea.player.models.PlayerRequestResource;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RateServiceImpl implements RateService{

    @Override
    public Optional<Long> createPlayerDetails(PlayerRequestResource playerRequestResource) {
        return Optional.empty();
    }

}
