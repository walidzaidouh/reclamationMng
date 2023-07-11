package ma.atos.reclamation.services.impl;

import ma.atos.reclamation.dto.AgenceDTO;
import ma.atos.reclamation.dto.ClientDTO;
import ma.atos.reclamation.entites.Agence;
import ma.atos.reclamation.repositories.AgenceRepository;
import ma.atos.reclamation.services.AgenceService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AgenceServiceImpl implements AgenceService {

    @Autowired
    AgenceRepository agenceRepository;

    @Autowired
    RestTemplate restTemplate;

    @Value("${api.agence.url}")
    private String agenceUrl;

    @Override
    public List<AgenceDTO> list() {

        // Return all agenies exist in DB
        List<Agence> agenceList =  agenceRepository.findAll();

        List<AgenceDTO> agenceDTOList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(agenceList)) {
            agenceList.forEach(agence -> {
                AgenceDTO agenceDTO = new AgenceDTO();
                BeanUtils.copyProperties(agence, agenceDTO);
                agenceDTOList.add(agenceDTO);
            });
        }

        return agenceDTOList;
    }

    @Override
    public AgenceDTO getAgenceByCode(String code) {

        Agence agence = agenceRepository.findByCode(code);
        AgenceDTO agenceDTO = new AgenceDTO();

        BeanUtils.copyProperties(agence, agenceDTO);

        List<ClientDTO> clientDTOList = new ArrayList<>();

        if(!CollectionUtils.isEmpty(agence.getClientList())){
            agence.getClientList().stream().forEach( client ->  {
                ClientDTO clientDTO = new ClientDTO();
                BeanUtils.copyProperties(client, clientDTO);
                clientDTOList.add(clientDTO);
            });
        }
        agenceDTO.setClientList(clientDTOList);
        return agenceDTO;
    }

    @Override
    public AgenceDTO getAgenceByCodeRestTemplate(String code) {
        String url = agenceUrl + "/" + code;
        ResponseEntity<AgenceDTO> response = restTemplate.getForEntity(url, AgenceDTO.class);
        return response.getBody();
    }

    @Override
    public void createAgence(AgenceDTO agenceDTO) {

        Agence agence = new Agence();
        BeanUtils.copyProperties(agenceDTO, agence);
        agenceRepository.save(agence);

    }

}
