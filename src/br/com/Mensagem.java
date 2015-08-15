package br.com;

import android.content.Context;
import android.content.Intent;
import android.view.Gravity;
import android.widget.Toast;

public class Mensagem {

    public static void sendMessage(Context context, String mensagem) {
        Toast toast = Toast.makeText(context, mensagem, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
    }

}
