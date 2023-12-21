package pt.iade.nayukamalebo.atividade

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class NoteActivity extends AppCompatActivity {

    private EditText titleEditText;
    private MultiLineEditText contentEditText;
    private TextView modifiedDateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        titleEditText = findViewById(R.id.editTextTitle);
        contentEditText = findViewById(R.id.editTextContent);
        modifiedDateTextView = findViewById(R.id.textViewModifiedDate);

        // Obtenha dados da nota selecionada (se estiver editando uma nota existente)
        // ...

        updateModifiedDate(); // Atualiza a data de modificação inicial

        // Adicione o código para preencher os campos com os dados da nota, se necessário
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_note, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_save) {
            saveNote(); // Implemente a lógica para salvar a nota
            return true;
        } else if (item.getItemId() == R.id.action_delete) {
            deleteNote(); // Implemente a lógica para excluir a nota
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void updateModifiedDate() {
        // Implemente a lógica para atualizar a TextView da data de modificação
        // modifiedDateTextView.setText(...);
    }

    private void saveNote() {
        // Implemente a lógica para salvar a nota
        // ...
        finish(); // Fecha a atividade após salvar
    }

    private void deleteNote() {
        // Implemente a lógica para excluir a nota
        // ...
        finish(); // Fecha a atividade após excluir
    }
}
