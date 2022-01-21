package marcelobaldi.livedata01.repository;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.List;
import marcelobaldi.livedata01.model.ClienteModel;

public class ClienteRepository {
    //Atributos
    private ClienteModel clienteModel = new ClienteModel();
    private final MutableLiveData<List<ClienteModel>> buscarTodosLiveData = new MutableLiveData<>();
    private final MutableLiveData<ClienteModel> buscarPorIdLiveData = new MutableLiveData<>();

    //Métodos Assíncronos
    public LiveData<List<ClienteModel>> buscarTodos() {
        //Mockar Dados
        ArrayList<ClienteModel> listaClientes = new ArrayList<ClienteModel>();
        listaClientes.add(new ClienteModel(1, "Marcelo", "mar@ig.com", 40));
        listaClientes.add(new ClienteModel(2, "Klebers", "kle@ig.com", 38));
        listaClientes.add(new ClienteModel(3, "Natalia", "nat@ig.com", 35));

        //Atualizar Dados
        buscarTodosLiveData.setValue(listaClientes);

        //Retornar Dados
        return buscarTodosLiveData;
    };
    public LiveData<ClienteModel> buscarPorId(Integer idV) {
        //Mockar Dados
        clienteModel.setId(idV);
        clienteModel.setNome("Lukas");

        //Atualizar e Retornar Dados
        buscarPorIdLiveData.setValue(clienteModel);
        return buscarPorIdLiveData;
    }
}

//Observações
//- Lib Ext MutableLiveData     da Lib Lifecycle
//- Lib Ext LiveData            da Lib Lifecycle



