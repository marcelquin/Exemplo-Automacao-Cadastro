package App.Service;

import App.Entity.ClienteEntity;
import App.Repository.ClienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;


    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public ResponseEntity<List<ClienteEntity>> ListarCliente()
    {
        try
        {
            return new ResponseEntity<>(clienteRepository.findAll(), HttpStatus.OK);
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
    }

    public ResponseEntity<ClienteEntity> NovoCliente(String nome, String email)
    {
        try
        {
            if(nome != null && email != null)
            {
                ClienteEntity entity = new ClienteEntity();
                entity.setNome(nome);
                entity.setEmail(email);
                clienteRepository.save(entity);
                return new ResponseEntity<>(HttpStatus.CREATED);
            }
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
    }

}
