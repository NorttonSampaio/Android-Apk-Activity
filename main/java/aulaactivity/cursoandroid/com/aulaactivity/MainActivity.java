package aulaactivity.cursoandroid.com.aulaactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getApplicationContext(),"onCreate Metodo Chamado",Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.botaoId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SegundaActivity.class));
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"on Start Metodo Chamado",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"on Restart Metodo Chamado",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"on Resume Metodo Chamado",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"on Pause Metodo Chamado",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"on Stop Metodo Chamado",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"on Destroy Metodo Chamado",Toast.LENGTH_SHORT).show();
    }
}
