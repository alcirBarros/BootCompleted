package br.com;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button start = (Button) findViewById(R.id.start);
        Button cancel = (Button) findViewById(R.id.cancel);

        start.setOnClickListener(this);
        cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cancel:
                Mensagem.sendMessage(this, "R.id.cancel");
                break;
            case R.id.start:
                Mensagem.sendMessage(this, "R.id.start");
                break;
            default:
                break;
        }
    }
}
