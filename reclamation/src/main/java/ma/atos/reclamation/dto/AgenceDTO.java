package ma.atos.reclamation.dto;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class AgenceDTO {

    private String code;
    private String nom;
    private String localisation;
    private List<ClientDTO> clientList;
    private DistributeurDTO distributeurDTO;
}
