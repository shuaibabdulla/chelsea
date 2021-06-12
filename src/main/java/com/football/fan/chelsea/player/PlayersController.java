package com.football.fan.chelsea.player;

import com.football.fan.chelsea.player.models.PlayerRequestResource;
import com.football.fan.chelsea.player.models.PlayerResponseResource;
import com.football.fan.chelsea.player.service.RateService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class PlayersController {

    private RateService rateService;

    public PlayersController(RateService rateService) {
        this.rateService = rateService;
    }

    @ApiOperation(value = "Create player", notes = "Create Player")
    @RequestMapping("/create")
    public ResponseEntity<?> createPlayer(@ApiParam(name = "playerDetails", value = "Create player"
            ,required = true) @RequestBody PlayerRequestResource playerRequestResource){
        Assert.notNull(playerRequestResource,"The player request object cannot be null");
        log.info("Create player method started");
        PlayerResponseResource playerResponseResource = null;
        return new ResponseEntity<>(playerResponseResource, HttpStatus.OK);
    }
}
