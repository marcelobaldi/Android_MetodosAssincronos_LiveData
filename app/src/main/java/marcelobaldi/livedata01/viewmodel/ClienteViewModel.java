package marcelobaldi.livedata01.viewmodel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import java.util.List;
import marcelobaldi.livedata01.model.ClienteModel;
import marcelobaldi.livedata01.repository.ClienteRepository;

public class ClienteViewModel extends ViewModel {
    //Atributos
    ClienteRepository clienteRepository = new ClienteRepository();

    //Métodos (Retornar Dados Para Activity)
    public LiveData<List<ClienteModel>> buscarTodosViewModel(){
        return clienteRepository.buscarTodos();
    }
    public LiveData<ClienteModel> buscarPorIdViewModel(Integer idV){
        return clienteRepository.buscarPorId(idV);
    }
}


