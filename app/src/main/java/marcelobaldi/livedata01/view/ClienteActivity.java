package marcelobaldi.livedata01.view;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import java.util.List;
import marcelobaldi.livedata01.R;
import marcelobaldi.livedata01.model.ClienteModel;
import marcelobaldi.livedata01.viewmodel.ClienteViewModel;

public class ClienteActivity extends AppCompatActivity {
    //Atributos
    Integer idBuscarPorId;
    ClienteViewModel clienteViewModel;

    //Método Inicial
    @Override protected void onCreate(Bundle savedInstanceState){super.onCreate(savedInstanceState);
        //Tela Xml
        setContentView(R.layout.activity_cliente);

        //Carregar Dados - ViewModel e Observer
        clienteViewModel = new ViewModelProvider(this).get(ClienteViewModel.class);
        registrarObserver();
    }

    //Botões Comando
    public void btnBuscarTodos (View view){
        clienteViewModel.buscarTodosViewModel();
    }
    public void btnBuscarPorId (View view){
        idBuscarPorId = 10;
        clienteViewModel.buscarPorIdViewModel(idBuscarPorId);
    }

    //Manipular Dados
    public void registrarObserver(){
        clienteViewModel.buscarTodosViewModel().observe(this, new Observer<List<ClienteModel>>(){
            @Override public void onChanged(List<ClienteModel> clienteModelsX) {
                Log.d("meuLog.BuscarTodos", clienteModelsX.toString());
            }
        });

        clienteViewModel.buscarPorIdViewModel(idBuscarPorId).
                observe(this, new Observer<ClienteModel>() {
            @Override public void onChanged(ClienteModel clienteModelXX) {
                Log.d("meuLog.BuscarPorId", clienteModelXX.toString());
            }
        });
    }
}


