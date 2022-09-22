package Service;

import DTO.InfoDTO;
import Entity.FirstEntity;
import Repository.FirstEntityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@EnableScheduling
public class FirstEntityServiceImpl implements FirstEntityService {

    private FirstEntityRepository firstEntityRepository;

    @Override
    public InfoDTO getData() {
        InfoDTO<FirstEntity> infoDTO = new InfoDTO<>();

        try {
            FirstEntity firstEntity = firstEntityRepository.getById(1L);
            infoDTO.setObject(firstEntity);
            infoDTO.setStatus(HttpStatus.OK);
            infoDTO.setSuccess(true);
            infoDTO.setMessage("Operação realizada com sucesso!");


        } catch (Exception e){
            e.printStackTrace();
            infoDTO.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            infoDTO.setSuccess(false);
            infoDTO.setMessage(e.getMessage());
        }

        return infoDTO;
    }

    @Override
    public InfoDTO getListData() {
        InfoDTO<Object> infoDTO = new InfoDTO<>();

        try {
            List<FirstEntity> firstEntity = firstEntityRepository.findAllByNameIsNotNull();
            infoDTO.setObject(firstEntity);
            infoDTO.setStatus(HttpStatus.OK);
            infoDTO.setSuccess(true);
            infoDTO.setMessage("Operação realizada com sucesso!");


        } catch (Exception e){
            e.printStackTrace();
            infoDTO.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            infoDTO.setSuccess(false);
            infoDTO.setMessage(e.getMessage());
        }

        return infoDTO;
    }
}
