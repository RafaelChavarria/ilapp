package info.rafaelchavarria.iberoapp.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import info.rafaelchavarria.iberoapp.Core.Alumno;
import info.rafaelchavarria.iberoapp.Core.Profesor;
import info.rafaelchavarria.iberoapp.R;

public class MainActivity extends AppCompatActivity {


    public TextView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> listaTest = new ArrayList<String>();
        ListView list = findViewById(R.id.lst_test);

        for (int i = 0; i <20 ; i++){
            Alumno alumno = new Alumno("Rafael", "Chavarría", "Pérez", "166614-6");
            listaTest.add(alumno.toString());
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                listaTest );

        list.setAdapter(arrayAdapter);




    }
}
