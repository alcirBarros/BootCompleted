package br.com;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();

        if (action.equals(Intent.ACTION_BOOT_COMPLETED)) {
            Mensagem.sendMessage(context, action);
        } else {
            Mensagem.sendMessage(context, action);
        }

        Intent inent = new Intent(context, MainActivity.class);
        inent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(inent);
    }    
}
