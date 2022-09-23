package com.restful.rachidapi.Controller;

import com.restful.rachidapi.DTO.InfoDTO;
import com.restful.rachidapi.Service.FirstEntityService;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/firstEntityEndPoint")
@NoArgsConstructor
@Slf4j
public class FirstEntityController {

    @Autowired
    private FirstEntityService firstEntityService;

    @RequestMapping(value = "/getData", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<InfoDTO> getData() {
        InfoDTO infoDTO = firstEntityService.getData();
        return ResponseEntity.status(infoDTO.getStatus()).body(infoDTO);
    }

    @RequestMapping(value = "/getListData", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<InfoDTO> getListData() {
        InfoDTO infoDTO = firstEntityService.getListData();
        return ResponseEntity.status(infoDTO.getStatus()).body(infoDTO);
    }

    @RequestMapping(value = "/getBusinessDataByCNPJ/", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<InfoDTO> getBusinessDataByCNPJ() {
        InfoDTO infoDTO = firstEntityService.getBusinessDataByCNPJ("08706688000131");
        return ResponseEntity.status(infoDTO.getStatus()).body(infoDTO);
    }
}
